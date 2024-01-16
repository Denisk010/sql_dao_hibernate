package ru.netology.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "PERSONS")

public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;

    @Column
    private String phoneNumber;

    @Column
    private String cityOfLiving;

}
