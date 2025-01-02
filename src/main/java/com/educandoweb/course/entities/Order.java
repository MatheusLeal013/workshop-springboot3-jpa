package com.educandoweb.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order") // Order é uma palavra reservada do SQL
public class Order implements Serializable {
    private static final long serialVersionUID = -8506401669627257237L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @ManyToOne // Implementar o relacionamento entre pedido e cliente para o JPA transformar em chaves estrangeiras no JPA - associação muitos para 1
    @JoinColumn(name = "clientId") // nome da chave estrangeira que vai ter no BD
    private User client;

    public Order() {
    }

    public Order(Instant moment, Long id, User client) {
        this.moment = moment;
        this.id = id;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
