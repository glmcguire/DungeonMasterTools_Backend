package com.dmtools.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gary Lee McGuire
 * 8/1/17.
 */
@Data
@Entity
@Table(name = "languages")
public class Languages implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //TODO

    /*
     *
     * Monsters entity notes:
     *  oneToMany languages - nullable true
     *  oneToMany actions
     *  oneToMany saving throws
     *  oneToMany skills
     *  oneToOne stats
     *
     *  Rough draft on relationships
     *
     */
}
