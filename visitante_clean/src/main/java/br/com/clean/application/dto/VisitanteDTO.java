package br.com.clean.application.dto;

public class VisitanteDTO {

    private String nome;
    private String cpf;
    private String foto;

    public VisitanteDTO(){

    }

    public VisitanteDTO(String nome, String cpf, String foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
