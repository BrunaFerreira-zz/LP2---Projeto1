CREATE TABLE cliente(
    id_cliente INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    nomeCliente VARCHAR(50),
    email VARCHAR(30),
    telefone VARCHAR(30),
    CPF VARCHAR(15),
    endereco VARCHAR(200),
    usuario VARCHAR(15),
    senha VARCHAR(10)
);


CREATE TABLE boleto(
    id_boleto INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    dataVencimento DATE,
    numeroBoleto VARCHAR(50)
);

CREATE TABLE cartaoPag(
    id_cartaoPag INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    tipoCartao VARCHAR(10)
);

CREATE TABLE despacho(
    id_despacho INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    codLocalizador  NUMERIC(10),
    horaEnvio TIME,
    dataEnvio  DATE,
    previsaoEntrega DATE
);

CREATE TABLE estoque(
    id_estoque INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    qntItem NUMERIC(8),
    enderecoEstoque VARCHAR(200)
);

CREATE TABLE item(
    id_item INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
   codigoItem NUMERIC(10),
   precoItem NUMERIC(6,2),
   descricaoItem VARCHAR(300)
);


CREATE TABLE livro(
    id_livro INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    numeroSerie NUMERIC(10),
    ano NUMERIC(4),
    edicao NUMERIC(3),
    titulo VARCHAR(200),
    autor VARCHAR(200),
    editora VARCHAR(100),
    genero VARCHAR(100)
);

CREATE TABLE notaFiscal(
    id_notaFiscal INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    numeroNF NUMERIC(10),
    dataEmissao DATE,
    CNPJ VARCHAR(20)
);

CREATE TABLE pagamento(
    id_pagamento INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    valorTotal NUMERIC(8,2)
);


CREATE TABLE pedido(
    id_pedido INT NOT NULL PRIMARY KEY 
               GENERATED always AS IDENTITY(START WITH 1, increment BY 1),
    qntItemPedido NUMERIC(5),
    horaPedido TIME,
    dataPedido DATE,
    enderecoEntrega VARCHAR(200)
);
