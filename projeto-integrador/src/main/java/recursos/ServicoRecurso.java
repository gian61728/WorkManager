package recursos;

import java.util.List;

import jakarta.transaction.Transactional;
import entidades.Servico;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("servicos")
public class ServicoRecurso {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Servico> listar (){

        return Servico.listAll();
    }

    @POST
    @Transactional
    public void salvar (Servico servico){
        servico.persist();

    }

}
