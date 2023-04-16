package com.hridoykrisna.me.JWTSecurity.project.controller;

import com.hridoykrisna.me.JWTSecurity.project.model.dto.ProductDto;
import com.hridoykrisna.me.JWTSecurity.project.model.dto.ResponseDto;
import com.hridoykrisna.me.JWTSecurity.project.service.ProductService;
import com.hridoykrisna.me.JWTSecurity.util.ResponseBuilder;
import com.hridoykrisna.me.JWTSecurity.util.UrlConstraint;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstraint.ProductManagement.ROOT)
public class ProductController {
    private final ProductService productService;

    @PostMapping(UrlConstraint.ProductManagement.CREATE)
    public ResponseDto createProduct(@Valid @RequestBody ProductDto productDto, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseBuilder.getFailureMessage(result, "Bean Binding Error");
        }
        return productService.save(productDto);
    }

    @PutMapping(UrlConstraint.ProductManagement.UPDATE)
    public ResponseDto updateProduct( @Valid @RequestBody ProductDto productDto, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseBuilder.getFailureMessage(result, "Bean Binding Error");
        }
        return productService.update(productDto);
    }

    @DeleteMapping(UrlConstraint.ProductManagement.DELETE)
    public ResponseDto deleteProduct(@PathVariable("id") int id) {
        return productService.delete(id);
    }

    @GetMapping(UrlConstraint.ProductManagement.DETAILS)
    public ResponseDto getProduct(@PathVariable("id") int id) {
        return productService.getDetails(id);
    }

    @GetMapping(UrlConstraint.ProductManagement.ALL_PRODCUTS)
    public ResponseDto getAllProduct() {
        return productService.getAll();
    }
}
