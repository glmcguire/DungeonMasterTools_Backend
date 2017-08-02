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
@Table(name = "monsters")
public class Monsters implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //TODO
}
