package com.appvidafenix.api.models.Seguradora;
import java.util.ArrayList;

import com.appvidafenix.api.models.Coberturas.Coberturas;

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
public class seguradora {
    private int id;
    private String nome;
    ArrayList<Coberturas> coberturas = new ArrayList<>();

    public seguradora(DadosCadastroSeguradora dados){
        this.nome = dados.nome();
        this.coberturas = dados.coberturas();
    }
}
