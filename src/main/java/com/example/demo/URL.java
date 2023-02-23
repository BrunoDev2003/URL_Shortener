package com.example.demo;

import java.io.Serializable;

import jakarta.annotation.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class URL implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENDITY)
    private Integer id;
    private String originalURL;
    private String shortURL;

    public URL() {

    }

    


}
