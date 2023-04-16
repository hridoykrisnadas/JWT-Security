package com.hridoykrisna.me.JWTSecurity.project.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Product extends BaseModel {
    private String name;
    private String Description;
    private float price;
}
