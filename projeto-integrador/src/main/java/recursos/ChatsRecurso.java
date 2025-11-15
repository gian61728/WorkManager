package recursos;

import java.util.List;

import jakarta.transaction.Transactional;

import entidades.Chats;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("chats")
public class ChatsRecurso {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Chats> listar (){
        
        return Chats.listAll();
    }
     @POST
    @Transactional
    public void salvar (Chats chats){
        chats.persist();
    }
}
