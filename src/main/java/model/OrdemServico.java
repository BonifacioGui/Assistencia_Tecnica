package model;

import java.util.Date;

public class OrdemServico {
    private int id;
    private Date data;
    private Aparelho aparelho;
    private String descricaoProblema;
    private String tipoServico;
    private String status;

    // Construtor
    public OrdemServico(Date data, Aparelho aparelho, String descricaoProblema, String tipoServico) {
        this.data = data;
        this.aparelho = aparelho;
        this.descricaoProblema = descricaoProblema;
        this.tipoServico = tipoServico;
        this.status = "Aberta";
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
