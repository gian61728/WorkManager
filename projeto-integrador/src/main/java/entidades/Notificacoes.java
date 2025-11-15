package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Notificacoes extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer codigo;

    public LocalDate data_invio;

    public String mensagem;

    @ManyToOne
    public Prestador prestador;

    @ManyToOne
    public Cliente cliente;

    @ManyToOne
    public Chats chats;

}