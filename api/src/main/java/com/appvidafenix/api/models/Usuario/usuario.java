package com.appvidafenix.api.models.Usuario;

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
    private int id;
    private boolean adm;
    private String nome;
    private String email;
    private String senha;
    private String numeroTelefone;

    public usuario(DadosCadastroUsuario dados){
        this.adm = dados.adm();
        this.nome = dados.nome();
        this.email = dados.email();
        this.senha = dados.senha();
        this.numeroTelefone = dados.numeroTelefone();
    }
}
