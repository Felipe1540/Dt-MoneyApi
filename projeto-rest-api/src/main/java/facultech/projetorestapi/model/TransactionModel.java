package facultech.projetorestapi.model;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity (name= "transaction")
public class TransactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, length = 50)
    public String title;

    @Column(nullable = false, length = 10)
    public String type;

    @Column(nullable = false, length = 50)
    public Double amount;

    @Column(nullable = false, length = 50)
    public String category;

    @Column(nullable = false)
    public Timestamp CreatedAt;

    @ManyToOne
    private UsuarioModel usuario;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        CreatedAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuario() {
        return usuario.codigo;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

}
