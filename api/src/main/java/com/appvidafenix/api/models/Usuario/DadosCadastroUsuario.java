package com.appvidafenix.api.models.Usuario;

public record DadosCadastroUsuario(
    String nome,
    String email,
    String senha,
    String numeroTelefone,
    boolean adm
) {
    
}
