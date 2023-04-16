package com.hridoykrisna.me.JWTSecurity.project.service;

import com.hridoykrisna.me.JWTSecurity.project.model.dto.ProductDto;
import com.hridoykrisna.me.JWTSecurity.project.model.dto.ResponseDto;

public interface ProductService {
    ResponseDto save(ProductDto productDto);

    ResponseDto update(ProductDto productDto);

    ResponseDto delete(int Id);

    ResponseDto getDetails(int Id);

    ResponseDto getAll();
}
