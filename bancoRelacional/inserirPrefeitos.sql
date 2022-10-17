select * from cidades;

insert into prefeitos (nome, cidade_id)
values
 ('Rodrigo Neves', 2),
 ('Raquel Lyra', 3),
 ('Zenaldo Coutinho', null);

select * from prefeitos;

insert into prefeitos (nome, cidade_id)
values ('Rafael Greca', null);

--erro de duplicidade, cidade 3 já tem prefeito registrado.
insert into prefeitos (nome, cidade_id)
values ('Rodrigo Pinheiro', 3);