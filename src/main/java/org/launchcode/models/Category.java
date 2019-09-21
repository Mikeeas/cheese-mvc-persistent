package org.launchcode.models;


import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;


    @NotNull
    @Size(min=3, max=15)
    private String name;




    public Category(){
    }

    public Category(String name) {
        this.name = name;
    }

}
