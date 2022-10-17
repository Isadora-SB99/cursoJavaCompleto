select * from estados;

insert into cidades (nome, area, estado_id)
values ('Campinas', 795, 25);

insert into cidades (nome, area, estado_id)
values ('Niterói', 133.9, 19);

insert into cidades (nome, area, estado_id)
values (
    'Caruaru',
     920.6,
     (select id from estados where sigla = 'PE')
);

select * from cidades;

insert into cidades (nome, area, estado_id)
values ('Juazeiro do Norte', 248.2,
 (select id from estados where sigla = 'CE'));

 select cid.nome as 'Cidade', est.nome as 'Estado'
  from cidades cid, estados est where cid.estado_id = est.id;