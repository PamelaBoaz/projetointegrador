CREATE DATABASE RaizAgro;

CREATE TABLE tb_postagem (
	id bigint AUTO_INCREMENT,
	dataPost TIMESTAMP NOT NULL,
	descricao varchar(255) NOT NULL,
	foto blob ,
	localizacao varchar(255) NOT NULL,
	maduro BOOLEAN NOT NULL
	usuario_id bigint NOT NULL,
	tema_id bigint NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (usuario_id) REFERENCES tb_usuario(id),
	FOREIGN KEY (tema_id) REFERENCES tb_tema(id)
);

CREATE TABLE tb_tema (
	id bigint AUTO_INCREMENT,
	categoria varchar(255) NOT NULL,
	ativo BOOLEAN NOT NULL,
	descricao varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE tb_usuario (
	id bigint AUTO_INCREMENT,
	nomeCompleto varchar(255) NOT NULL,
	email varchar(255) NOT NULL UNIQUE,
	senha varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

