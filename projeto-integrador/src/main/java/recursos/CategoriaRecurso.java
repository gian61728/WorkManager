package recursos;

import java.util.List;

import entidades.Categoria;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
//<> diamante trava
// List Lista de itens
//querey pilha 
// @ sao configuração
@Path("categorias")//padrao de mercado em plural em ingles
public class CategoriaRecurso {
    //GET listar
    //POST alterar
    //DELETE excluir
     //isso e um select * ordenado por nome feito em apache
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categoria> listar (){
       
        return Categoria.listAll(Sort.ascending("nome"));
        
    }
}