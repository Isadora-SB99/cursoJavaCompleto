update estados
set nome = 'Maranhão'
where sigla = 'MA';

select nome from estados where sigla = 'MA'

update estados
set nome = 'Paraná', populacao = 11.32
where sigla = 'PR';

select * from estados where sigla = 'PR';

--corrigindo erro na minha tabela
update estados set populacao = 0.8 where sigla = 'AP';