package com.projectcontrol.projectcontrol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarefa {
    private int id;
    private String nome;
    private String descricao;
    private Date prazo;
    private boolean status;

    public Tarefa(int id, String nome, String descricao, String prazo) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.prazo = formato.parse(prazo);
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public boolean getStatus() {
        return status;
    }

    public void alterarStatus() {
        if (status == false) {
            status = true;
        } else {
            status = false;
        }
    }
}
