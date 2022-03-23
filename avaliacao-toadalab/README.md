# Avaliação do ToadaLab

## Questão 1: *Git*
__a.__ Clone o projeto do repositório [5 pontos]\
__b.__ Crie uma nova branch com o nome _CPF_PrimeroNomeUltimoNome_. (Ex.: _12345678900_JoaoSilva_) **[5 pontos]**;\
__c.__ Ao terminar **CADA QUESTÃO**, faça o _staging_ e o _commit_ das mudanças com mensagem de sua escolha **[10 pontos]**;\
__d.__ Adicione as dependências do projeto à IDE (necessárias à realização da Questão 3) **[10 pontos]**.

## Questão 2: *Java*
*Para realização dessas questões, deve-se observar a classe Main.java.\
Não usar bibliotecas externas para a solução destas questões.*

__a.__ Elabore diagrama de classes dos modelos envolvidos na aplicação Java (e.g. Gerente, Vendedor, Colaborador, Cliente, ...) em ferramenta de sua escolha. [Recomenda-se o uso da ferramenta https://app.diagrams.net/]. Salve imagem na raiz do projeto com o nome diagrama_classes.png (pode ser outro formato de imagem). Esse arquivo deve ser versionado pelo GitLab junto com as respostas das outras questões **[15 pontos]**;\
__b.__ Ao cadastrar um novo Gerente de Vendas, existe um BUG, descubra qual é e aplique a correção **[5 pontos]**;\
__c.__ Implemente a função parseDate (essa função deve imprimir mensagem em caso de data inválida). O tipo de retorno da função deve ser observado de acordo com chamada desta **[10 pontos]**;\
__d.__ Ao efetuar as operações de registrar venda e autorizar venda, digite opção 10 na escolha de vendedor, cliente ou gerente autorizador. Isso deve disparar um erro. Descobrir a causa desse bug e solucioná-lo **[15 pontos]**;\
__e.__ Tente cadastrar um cliente ou colaborador com o CPF 30514486058. Deve ser apresentado uma exceção java.lang.NumberFormatException. Buscar solução para o bug **[30 pontos]**;\
__f.__ Ao efetuar a escolha de uma opção que deve ser processada como Inteiro, Float ou Long, é necessário fazer um parse na entrada. Porém, caso o usuário digite algo inválido (e.g. letras), será apresentada uma execeção java.lang.NumberFormatException. Nesse caso, essa entrada deve ser validada e o usuário deve ter a oportunidade de digitar o valor correto (o sistema não deve retornar à função principal) **[20 pontos *(30 pontos, se usar tratamento de exceção)*]**;\
__g.__ Na opção de Listar/Autorizar vendas, caso não existam vendas registradas, exibir mensagem que informe isso **[10 pontos]**;\
__h.__ A aplicação aceita entrada de CPF's inválidos. Implementar validação de CPF **[20 pontos (30 pontos, se usar tratamento de exceção)]**;\
__i.__ Exibir o tipo de vínculo do colaborador na função *printListPessoas* **[30 pontos]**;\
__j.__ Após cadastrar uma venda, ao tentar listar as vendas cadastradas. Acontece um erro. Descubra a causa e implemente a solução **[15 pontos]**.

## __Questão 3__: XPath
Para realização dessas questões, deve ser executada a classe MainXPath.java.\
O site está na URL https://www.tjma.jus.br/midia/toadalab/pagina/hotsite/500297
![Imagem do site do Toada Lab](/toadalab_site_tjma.png)
__a.__ Definir o valor da variável xPathMissao com o XPath completo de acordo com a figura acima  **[5 pontos]**;\
__b.__ Definir o valor da variável xPathVisao com o XPath completo de acordo com a figura acima  **[5 pontos]**;\
__c.__ Definir o valor da variável xPathValores com o XPath completo de acordo com a figura acima  **[5 pontos]**;\
__d.__ Definir o valor da variável xPathAumentarFonte com o XPath do elemento apontado na imagem, usando o id deste **[10 pontos]**;\
__e.__ Definir o valor da variável xPathIdiomaPtBr com o XPath completo de acordo com a figura acima, utilizando as classes dos elementos, sempre que possível (e.g. classe idioma) **[15 pontos]**;

_Output esperado do MainXPath_:
~~~
Missão: Desenvolvemos e difundimos práticas inovadoras, de forma colaborativa, com foco na efetividade dos serviços prestados pelo Poder Judiciário do MA.
Visão: Ser referência nacional na consolidação de uma cultura inovadora do Poder Judiciário.
Valores: Empatia, Horizontalidade, Diversidade, Inovação, Colaboração, Criatividade, Multidisciplinaridade.
Title da imagem de aumento de fonte: aumentar fonte
Alt do Idioma pt_BR: site em português
~~~
