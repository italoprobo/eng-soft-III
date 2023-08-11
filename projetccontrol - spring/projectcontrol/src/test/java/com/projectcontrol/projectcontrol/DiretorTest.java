package com.projectcontrol.projectcontrol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiretorTest {

    private Diretor diretor;

    @BeforeEach
    void setUp() {
        diretor = new Diretor(1, "Diretor", "123456");
    }

    @Test
    void testCreateReadTarefaDiretor() {
        diretor.createTarefa(1, "Tarefa de Teste", "Descrição da tarefa", "01/01/2023");

        // Testa se a tarefa foi criada e é lida corretamente
        diretor.readTarefa();
    }

    @Test
    void testUpdateTarefaDiretor() {
        diretor.createTarefa(1, "Tarefa de Teste", "Descrição da tarefa", "01/01/2023");

        // Testa se o método updateTarefa() em Diretor altera o status corretamente
        diretor.updateTarefa(1, true);

        Tarefa tarefa = diretor.getTarefas().get(0);
        assertEquals(true, tarefa.getStatus());
    }

    @Test
    void testDeleteTarefaDiretor() {
        diretor.createTarefa(1, "Tarefa de Teste", "Descrição da tarefa", "01/01/2023");

        // Testa se o método deleteTarefa() em Diretor remove a tarefa corretamente
        diretor.deleteTarefa(1);

        assertEquals(0, diretor.getTarefas().size());
    }
}
