package com.projectcontrol.projectcontrol;

public abstract class Usuario {
    private int id;
    private String nome;
    private String telefone;

    public Usuario(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public abstract void createTarefa(int idTarefa, String nomeTarefa, String descricaoTarefa, String prazoTarefa);

    public abstract void readTarefa();

    public abstract void updateTarefa(int idTarefa, boolean novoStatus);

    public abstract void deleteTarefa(int idTarefa);
}
