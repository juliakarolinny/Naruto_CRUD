package juliakarol.naruto.entityes;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sexo;
    private String elemento;
    private String Jinchuriki;
    private String vila;
    private String Kage;
    private String nukenin;

    public Personagem(){}
    public Personagem(int id, String nome, String sexo, String elemento, String jinchuriki, String vila, String kage, String nukenin) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.elemento = elemento;
        this.Jinchuriki = jinchuriki;
        this.vila = vila;
        this.Kage = kage;
        this.nukenin = nukenin;
    }
    public Personagem( String nome, String sexo, String elemento, String jinchuriki, String vila, String kage,  String nukenin) {

        this.nome = nome;
        this.sexo = sexo;
        this.elemento = elemento;
        this.Jinchuriki = jinchuriki;
        this.vila = vila;
        this.Kage = kage;
        this.nukenin = nukenin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getJinchuriki() {
        return Jinchuriki;
    }

    public void setJinchuriki(String jinchuriki) {
        Jinchuriki = jinchuriki;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public String getKage() {
        return Kage;
    }

    public void setKage(String kage) {
        Kage = kage;
    }

    public String getNukenin() {
        return nukenin;
    }
    public  void setNukenin(String nukenin) {
        this.nukenin = nukenin;
    }

}
