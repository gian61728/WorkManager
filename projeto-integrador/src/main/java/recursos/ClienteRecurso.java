package recursos;

import java.util.List;

import jakarta.transaction.Transactional;

import entidades.Cliente;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("clientes")
public class ClienteRecurso {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> listar (){

        return Cliente.listAll();
    }
    @POST
    @Transactional
    public void salvar (Cliente cliente){
        cliente.persist();
    }
}
