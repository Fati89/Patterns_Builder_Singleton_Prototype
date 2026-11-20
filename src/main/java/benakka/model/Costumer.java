package benakka.model;

public class Costumer implements Cloneable {
    private Long id;
    public String nom;

    public Costumer(){}

    public Costumer(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public Costumer clone() throws CloneNotSupportedException {
        return (Costumer) super.clone();
    }
}
