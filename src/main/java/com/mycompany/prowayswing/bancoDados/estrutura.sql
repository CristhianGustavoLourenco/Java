DROP DATABASE IF EXISTS locadora; -- Apagar o bd caso existir
CREATE DATABASE locadora; -- Criar o bd
USE locadora; -- Apontar para o bd

CREATE TABLE categoria(
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE filmes (
    id INT AUTO_INCREMENT NOT NULL,
    id_categoria INT NOT NULL,
    nome VARCHAR(100),

    FOREIGN KEY(id_categoria) REFERENCES categoria(id),
    PRIMARY KEY (id)
);

INSERT INTO  categoria(nome) VALUES
("Terror"),
("Ação"),
("Romance"),
("Comédia"),
("Drama"),
("Ficção Científica");

INSERT INTO filmes (id_categoria, nome) VALUES
(1,"IT: A coisa"),
(6,"Interestelar");