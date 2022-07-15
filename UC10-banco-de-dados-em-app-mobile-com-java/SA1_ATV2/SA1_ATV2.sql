CREATE DATABASE ComaBem; 

USE ComaBem;

Create Table Unidades
(
	cd_unidade INT auto_increment PRIMARY KEY,
    ds_unidade VARCHAR(200) NOT NULL
);

CREATE TABLE Produtos (
	cd_produto INT AUTO_INCREMENT PRIMARY KEY,
    ds_produto VARCHAR(200) NOT NULL,
    vl_produto DOUBLE NOT NULL,
    qt_produto DOUBLE NOT NULL,
    cd_unidade INT NOT NULL,
    CONSTRAINT fk_produto_unidade FOREIGN KEY (cd_unidade) REFERENCES Unidades(cd_unidade)
);