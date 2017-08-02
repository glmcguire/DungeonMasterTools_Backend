package com.dmtools.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gary Lee McGuire
 * 7/28/17.
 *
 * Stats class contains all of the integer values of
 * Monsters, NPCs, and PCs.
 *
 * Utilizing ProjectLombok's @Data for embedded generation of
 * getters and setters.
 */

@Data
@Entity
@Table(name = "stats")
public class Stats implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int initiative;

    private int armorClass;

    private int hitPoints;

    String hitPointDiceMod;

    private int speedGround;

    private int speedFly;

    private int strength;

    private int dexterity;

    private int constitution;

    private int intelligence;

    private int wisdom;

    private int charisma;

}
