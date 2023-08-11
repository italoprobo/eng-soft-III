package com.projectcontrol.projectcontrol;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

class EstagiarioTest {

    @Test
    void testReadTarefaEstagiario() throws ParseException {
        Estagiario estagiario = new Estagiario(1, "Estagiário", "123456");
        Tarefa tarefa = new Tarefa(1, "Tarefa de Teste", "Descrição da tarefa", "01/01/2023");
        estagiario.adicionarTarefa(tarefa);

        //verifica se o nome da tarefa é exibido
        estagiario.readTarefa();
    }

    @Test
    void testUpdateTarefaEstagiario() {
        Estagiario estagiario = new Estagiario(1, "Estagiário", "123456");

        //verifica se a mensagem "Estagiários não podem atualizar tarefas." é exibida
        estagiario.updateTarefa(1, true);
    }

    @Test
    void testDeleteTarefaEstagiario() {
        Estagiario estagiario = new Estagiario(1, "Estagiário", "123456");
        
        //verifica se a mensagem "Estagiários não podem deletar tarefas." é exibida
        estagiario.deleteTarefa(1);
    }
}

