package com.hridoykrisna.me.JWTSecurity.project.model.dto;

import com.hridoykrisna.me.JWTSecurity.project.model.BaseModel;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProductDto extends BaseModel {
    @NotBlank(message = "Name is Mandatory")
    private String name;
    @NotBlank(message = "Description is Mandatory")
    private String Description;
    @Min(value = 1, message = "Price Must Mandatory")
    private float price;

}