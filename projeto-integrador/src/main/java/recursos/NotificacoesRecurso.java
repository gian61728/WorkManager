package recursos;

import java.util.List;

import entidades.Notificacoes;

import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("notificacoes")
public class NotificacoesRecurso{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Notificacoes> listar (){

        return Notificacoes.listAll("codigo");
    }
     @POST
    @Transactional
    public void salvar (Notificacoes notificacoes){
        notificacoes.persit();
    }
}
