import java.util.ArrayList;
import java.util.List;

public class Diretor extends Usuario {

    private List<Tarefa> tarefas;

    public Diretor(int id, String nome, String telefone) {
        super(id, nome, telefone);
        this.tarefas = new ArrayList<>();
    }

    @Override
    public void createTarefa(int idTarefa, String nomeTarefa, String descricaoTarefa, String prazoTarefa) {
        try {
            Tarefa novaTarefa = new Tarefa(idTarefa, nomeTarefa, descricaoTarefa, prazoTarefa);
            tarefas.add(novaTarefa);
            System.out.println("Tarefa criada com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tarefa: " + e.getMessage());
        }
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
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idTarefa) {
                tarefa.alterarStatus();
                System.out.println("Status da tarefa atualizado.");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    @Override
    public void deleteTarefa(int idTarefa) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idTarefa) {
                tarefas.remove(tarefa);
                System.out.println("Tarefa removida com sucesso.");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }
}
