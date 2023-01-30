package com.egecoskun121.credit.model.entity;

public enum Role {
    ROLE_ADMIN, ROLE_USER;

    public String getAuthority() {
        return name();
    }
}
