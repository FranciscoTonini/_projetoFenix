package com.appvidafenix.api.models.Seguradora;

import java.util.ArrayList;

import com.appvidafenix.api.models.Coberturas.Coberturas;

public record DadosCadastroSeguradora(
    String nome,
    ArrayList<Coberturas> coberturas
) {
    
}
