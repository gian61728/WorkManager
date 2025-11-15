package recursos;

import java.util.List;


import entidades.Prestador;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("prestador")
public class PrestadorRecurso {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prestador> listar(){

        return Prestador.listAll("codigo");
    }
     @POST
    @Transactional
    public void salvar (Prestador prestador){
        prestador.persit();
}
}