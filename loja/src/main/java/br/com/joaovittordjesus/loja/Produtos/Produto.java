package br.com.joaovittordjesus.loja.Produtos;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@NoArdsConstructor
//@AllArgsConstructor

@Entity
class Produto{
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;

    //Construcotors
    public Produto(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this. descricao = descricao;
    }

    public  Produto(){

    }

    //Getters & Setters
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}