USE comaBem;

/*INSERÇÃO DE DADOS*/
INSERT INTO unidades (ds_unidade) VALUES ("Kilo");
INSERT INTO unidades (ds_unidade) VALUES ("Unidade");
INSERT INTO unidades (ds_unidade) VALUES ("litro");
INSERT INTO unidades (ds_unidade) VALUES ("Metro");
INSERT INTO unidades (ds_unidade) VALUES ("Duzia");

INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Carne", 30.00, 2, 1);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Oleo", 10.00, 1, 2);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("leite", 5.00, 1.5, 3);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Alface", 3.00, 1, 2);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Laranja", 8.00, 10, 5);

/*ALTERAÇÃO DE DADOS*/
UPDATE Produtos SET ds_produto = "Limão" WHERE cd_produto = 6;
UPDATE Produtos SET cd_unidade = 2 WHERE cd_produto = 1;
UPDATE Produtos SET vl_produto = 100.00 WHERE cd_produto = 1;


/*CONSULTA DADOS*/
SELECT * FROM Unidades;
SELECT * FROM produtos;
SELECT ds_produto, vl_produto, qt_produto FROM produtos ORDER BY ds_produto;

SELECT p.ds_produto AS 'Produto', u.ds_unidade AS 'Unidade'
FROM Produtos AS p
JOIN Unidades AS u ON p.cd_unidade = u.cd_unidade;

/*EXCLUSÃO DE DADOS*/
DELETE FROM Produtos WHERE cd_produto = 1;
DELETE FROM Produtos WHERE cd_produto = 5;


