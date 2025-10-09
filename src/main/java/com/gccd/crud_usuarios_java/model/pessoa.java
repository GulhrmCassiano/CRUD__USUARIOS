package com.playerrank.crus_usuarios_java.model;

import java.util.Date;

public class pessoa {

    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private int idade;
    private int telefone;
    private char sexo;
    private String endereco;

    public pessoa(){
        this.nome = "";
        this.sobrenome = "";
        this.idade = 0;
        this.dataNascimento = new Date();
        this.telefone = 0;
        this.sexo = ' ';
        this.endereco = "";
    }

    public pessoa( String nome, String sobrenome, Date dataNasc, int telefone, char sexo, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNasc;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade(){
        Date currentDate = new Date();
        this.idade = currentDate.getYear() - this.dataNascimento.getYear();
        return this.idade;
    }

    public String getFullSexo(){
        if (this.sexo == 'M' || this.sexo == 'm')
            return "Masculino";
        else if(this.sexo == 'F' || this.sexo == 'f')
            return "Feminino";
        else
            return "";
    }

    public String info(){
        return nome + " " + sobrenome + " | " + getIdade() + " anos | " + telefone + " | " + getFullSexo() + " | " + endereco;
    }
}