package recursos;

import java.util.List;


import entidades.Avaliacoes;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("avaliacoes")
public class AvaliacoesRecurso {
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Avaliacoes> listar (){
       
        return Avaliacoes.listAll("codigo");
        
    }

    @POST
    @Transactional
    public void salvar (Avaliacoes avaliacoes){
        avaliacoes.persit();
    }
}