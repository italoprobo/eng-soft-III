package com.projectcontrol.projectcontrol;

import java.util.ArrayList;
import java.util.List;

public class Estagiario extends Usuario {

    private List<Tarefa> tarefas;

    public Estagiario(int id, String nome, String telefone) {
        super(id, nome, telefone);
        this.tarefas = new ArrayList<>();
    }

    @Override
    public void createTarefa(int idTarefa, String nomeTarefa, String descricaoTarefa, String prazoTarefa) {
        System.out.println("Estagiários não podem criar tarefas.");
    }

    @Override
    public void readTarefa() {
        for (Tarefa tarefa : tarefas) {
            System.out.println("ID: " + tarefa.getId());
            System.out.println("Nome: " + tarefa.getNome());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Prazo: " + tarefa.getPrazo());
            System.out.println("Status: " + (tarefa.getStatus() ? "Concluída" : "Pendente"));
            System.out.println("-------------------");
        }
    }

    @Override
    public void updateTarefa(int idTarefa, boolean novoStatus) {
        System.out.println("Estagiários não podem atualizar tarefas.");
    }

    @Override
    public void deleteTarefa(int idTarefa) {
        System.out.println("Estagiários não podem deletar tarefas.");
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
}
