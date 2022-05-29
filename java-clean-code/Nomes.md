# Nomes
### Use nomes que Revelem seu proposito
O nome de uma variavel, funcao ou classe deve responder a todas
as grandes questoes. Ela deve lhe dizer porque existe, o que faz
e como eh usada. Se um nome requer um comentario, entao ele nao
revela seu proposito.

Exemplo:

#### Codigo Ruim

```int d; // tempo decorrido em dias```

#### Codigo Limpo

    int tempoDecorridoEmDias;
    int diasDesdeCriacao;
    int diasDesdeModificacao;
    int idadeArquivoEmDias;

Mais exemplos:

[exemplo.celulasMarcadas](src/main/java/io.red.variaveis)
 
### Evite Informacoes Erradas
 Programadores devem evitar passar dicas ou informacoes erradas, falsas ou confusas. Evite palavras ou abreviacoes que podem levar a ma interpretacao.

Exemplo: 

```String pd```

```String produtoDetalhes```
