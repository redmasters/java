package io.leo.academia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Alunos {

    @Id
    @Column(name ="id")
    private int id;

    @Column(name = "nome")
    private String nome;

}
