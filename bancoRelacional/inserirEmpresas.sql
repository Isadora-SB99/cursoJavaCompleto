insert into empresas (nome, cnpj)
values
    ('Bradesco', 95694186000132),
    ('Vale', 27887148000146),
    ('Cielo', 01598317000134);

alter table empresas modify cnpj VARCHAR(18);

select * from empresas;

update empresas
set cnpj = '01598317000134'
where nome = 'Cielo';

desc empresas;
desc prefeitos;

select * from cidades;

insert into empresas_unidades (empresa_id, cidade_id, sede)
values (1, 1, 1), (1, 2, 0), (2, 1, 0), (2, 2, 1);