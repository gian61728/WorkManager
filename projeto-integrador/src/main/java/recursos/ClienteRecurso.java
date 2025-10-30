package recursos;

import java.util.List;

import entidades.Cliente;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("Clientes")
public class ClienteRecurso {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> listar (){

        return Cliente.listAll(Sort.ascending("nome"));
    }
}
