package com.goldenowl.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class BookEntity extends PanacheEntity {

    // Quarkus gera os getters e setters dos atributos da classe automaticamente, nao precisando tornar private
    // acesso aos atributos sera feito de forma publica e o Quarkus em runtime ira utilizar os getters e setters que
    // ele gerou por baixo dos panos
    public String name;
    public String author;
}
