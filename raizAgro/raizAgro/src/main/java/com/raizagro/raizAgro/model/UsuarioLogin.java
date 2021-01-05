package com.raizagro.raizAgro.model;

public class UsuarioLogin {

	private String nomeCompleto;

	private String email;

	private String usuario;

	private String senha;

	private String token;

	public String getNome() {
		return nomeCompleto;
	}

	public void setNome(String nome) {
		this.nomeCompleto = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
