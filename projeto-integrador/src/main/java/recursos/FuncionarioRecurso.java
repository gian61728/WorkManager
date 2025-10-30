package recursos;

import java.util.List;

import entidades.Funcionario;

import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("funcionarios")
public class FuncionarioRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Funcionario> listar (){

        return Funcionario.listAll(Sort.ascending("nome"));
    }
}
