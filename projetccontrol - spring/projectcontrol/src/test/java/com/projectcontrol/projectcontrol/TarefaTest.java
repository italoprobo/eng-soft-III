package com.projectcontrol.projectcontrol;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TarefaTest {

    @Test
    void testGetNomeTarefa() throws ParseException {
        Tarefa tarefa = new Tarefa(1, "Tarefa de Teste", "Descrição da tarefa", "01/01/2023");

        // Testa se o método getNome() em Tarefa retorna o nome esperado
        assertEquals("Tarefa de Teste", tarefa.getNome());
    }

    @Test
    void testAlterarStatusTarefa() throws ParseException {
        Tarefa tarefa = new Tarefa(1, "Tarefa de Teste", "Descrição da tarefa", "01/01/2023");
        
        // Testa se o método alterarStatus() em Tarefa altera o status corretamente
        tarefa.alterarStatus();
        assertEquals(true, tarefa.getStatus());
    }
}

