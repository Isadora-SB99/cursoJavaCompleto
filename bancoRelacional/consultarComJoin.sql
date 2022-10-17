select 
    e.nome as 'Estado',
    c.nome as 'Cidade',
    regiao as 'Região'
from estados e, cidades c where c.estado_id = e.id;

select
    c.nome as Cidade,
    e.nome as Estado,
    regiao as Região
from estados e 
inner join cidades c on e.id = c.estado_id