package com.appvidafenix.api.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class usuario {
    private String nome;
    private String email;
    private String senha;
    private String numeroTelefone;
}
