<<<<<<< HEAD
package br.com.curso.listadetarefas.api.tarefa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Gera getters, setters, toString, equals e hashCode automaticamente
@Entity // Marca como entidade JPA
@Table(name = "tb_tarefas") // Define o nome da tabela no banco de dados
public class Tarefa {

    @Id // Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private Long id;

    private String descricao;
    private boolean concluida;
}
=======
package br.com.curso.listadetarefas.api.tarefa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Gera getters, setters, toString, equals e hashCode automaticamente
@Entity // Marca como entidade JPA
@Table(name = "tb_tarefas") // Define o nome da tabela no banco de dados
public class Tarefa {

    @Id // Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private Long id;

    private String descricao;
    private boolean concluida;
}
>>>>>>> 4a589d8ef8bcb6c04f26717851b86ecd3a30e7a4
