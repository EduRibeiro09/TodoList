<<<<<<< HEAD
package br.com.curso.listatarefasdesktop.model;

import javafx.beans.property.*;

public class Tarefa {
    private final StringProperty descricao;
    private final BooleanProperty concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = new SimpleStringProperty(descricao);
        this.concluida = new SimpleBooleanProperty(concluida);
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao.get();
    }

    public void setDescricao(String descricao) {
        this.descricao.set(descricao);
    }

    public StringProperty descricaoProperty() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida.get();
    }

    public void setConcluida(boolean concluida) {
        this.concluida.set(concluida);
    }

    public BooleanProperty concluidaProperty() {
        return concluida;
    }
}
=======
package br.com.curso.listatarefasdesktop.model;

import javafx.beans.property.*;

public class Tarefa {
    private final StringProperty descricao;
    private final BooleanProperty concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = new SimpleStringProperty(descricao);
        this.concluida = new SimpleBooleanProperty(concluida);
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao.get();
    }

    public void setDescricao(String descricao) {
        this.descricao.set(descricao);
    }

    public StringProperty descricaoProperty() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida.get();
    }

    public void setConcluida(boolean concluida) {
        this.concluida.set(concluida);
    }

    public BooleanProperty concluidaProperty() {
        return concluida;
    }
}
>>>>>>> 4a589d8ef8bcb6c04f26717851b86ecd3a30e7a4
