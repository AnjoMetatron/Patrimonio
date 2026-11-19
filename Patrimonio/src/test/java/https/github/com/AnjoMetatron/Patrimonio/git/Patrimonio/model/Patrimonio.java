package https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.model;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_patrimonio")

public class Patrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    public Patrimonio() {

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNr_patrimonio() {
        return nr_patrimonio;
    }

    public void setNr_patrimonio(String nr_patrimonio) {
        this.nr_patrimonio = nr_patrimonio;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    @Column(name = "nr_patrimonio", nullable = false, length = 50)
    private String nr_patrimonio;
    @Column(name = "local", nullable = false, length = 255)
    private String Local;

    public Patrimonio(long ID, String nr_patrimonio, String local, String descricao) {

        this.ID = ID;
        this.nr_patrimonio = nr_patrimonio;
        Local = local;
        this.descricao = descricao;
    }
}