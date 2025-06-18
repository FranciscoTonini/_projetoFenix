package com.appvidafenix.api.models.Coberturas;
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
public class Coberturas {
    private int id;
    private String nomeCobertura;
    private String descricao;    
    private String vigencia;     
    private String exclusoes;    
    
    public Coberturas (DadosCadastroCoberturas dados){
        this.nomeCobertura = dados.nomeCobertura();
        this.descricao = dados.descricao();
        this.vigencia = dados.vigencia();
        this.exclusoes = dados.exclusoes();
    }
}
