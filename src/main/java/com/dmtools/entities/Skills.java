package com.dmtools.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gary Lee McGuire
 * 7/28/17.
 */
@Data
@Entity
@Table(name = "skills")
public class Skills implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int acrobatics;

    private int animalHandling;

    private int arcana;

    private int athletics;

    private int deception;

    private int history;

    private int insight;

    private int intimidation;

    private int investigation;

    private int medicine;

    private int nature;

    private int perception;

    private int performance;

    private int persuasion;

    private int religion;

    private int sleightOfHand;
    
    private int stealth;


}
