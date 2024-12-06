package model;

public class Aparelho {
    private int id;
    private String nome;
    private String marca;
    private String tipo;
    private int ano;

    // Construtor
    public Aparelho(String nome, String marca, String tipo, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.ano = ano;
    }

    // Getters e Setters
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
