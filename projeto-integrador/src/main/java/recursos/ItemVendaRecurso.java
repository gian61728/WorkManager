package recursos;

import java.util.List;

import entidades.ItemVenda;

import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("itemvendas")
public class ItemVendaRecurso {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <ItemVenda> listar (){

        return ItemVenda.listAll(Sort.ascending("nome"));
    }
}
