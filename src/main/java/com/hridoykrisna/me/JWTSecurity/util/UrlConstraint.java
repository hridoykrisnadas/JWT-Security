package com.hridoykrisna.me.JWTSecurity.util;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UrlConstraint {
    public static final String API = "/api";
    public static final String VERSION = "/v1";

    public static class AuthManagement {
        public static final String ROOT = API+"/auth";
        public static final String REGISTER = "/register";
        public static final String LOGIN = "/login";
    }

    public static class ProductManagement {
        public static final String ROOT = API+VERSION+"/product";
        public static final String CREATE = "/create";
        public static final String UPDATE = "/update/{id}";
        public static final String DETAILS = "/details/{id}";
        public static final String DELETE = "/delete/{id}";
        public static final String ALL_PRODCUTS = "/all-product";
    }
}
