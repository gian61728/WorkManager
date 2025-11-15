
package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prestador extends PanacheEntityBase{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer codigo;

    public String nome;

    public String cpf;

    public String email;

    public String telefone;

    public String Endereco;

    public String senha;
    
    
}
