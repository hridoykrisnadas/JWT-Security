package com.hridoykrisna.me.JWTSecurity.project.service;

import com.hridoykrisna.me.JWTSecurity.project.model.dto.ProductDto;
import com.hridoykrisna.me.JWTSecurity.project.model.dto.ResponseDto;

public interface ProductService {
    ResponseDto save(ProductDto productDto);

    ResponseDto update(Long Id, ProductDto productDto);

    ResponseDto delete(Long Id);

    ResponseDto getDetails(Long Id);

    ResponseDto getAll();
}
