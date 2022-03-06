# Documentação das questões elaboradas para o processo seletivo da Capgemini

### TECNOLOGIAS UTILIZADAS: JAVA

### INSTRUÇÕES DE USO

### Questão 01

- Ao rodar o programa, é necessário inserir um número à lista, para descobrir o valor da mediana.
 
### Questão 02

- Ao rodar o programa, é necessário digitar um valor à lista, para saber o número de elementos pares referente a diferença dos valores anteriores comparados.

### Questão 03

- Ao rodar o programa, é necessário inserir a palavra que será utilizada para descobrir se suas substrings são anagramas ou não, sendo ele em valor "String".

### EXPLICAÇÃO SOBRE AS QUESTÕES

### Questão 01
  Nessa primeira questão, eu iniciei declarando uma "ArrayList" do tipo "Integer" com o nome "numerosArrayList" e inicializei a variável "contador" e a variável "loopingArrayList" em zero. Como próximo passo, fiz um laço de repetição "While" com a condição de "loopingArrayList == 0", pedindo ao usuário que digitasse um número para adicionar a lista, armazenando ele em uma variável chamada "numero". Após isso, com o método "add" adicionei a variável "numero" em "numerosArrayList", coloquei o "contador" para somar 1 cada vez que o loop rodar e pedi ao usuário para digitar 1 caso ele quisesse encerrar o loop. Usei o "Colletions.sort()" para ordenar em crescente os valores da ArrayList "numerosArrayList" pedindo ao sistema para imprimir na tela o resultado. Fiz um "if" e "else" para verificar se o Array é par ou ímpar.
- Caso seja par, criei quatro variáveis, duas do tipo inteiro: "valorDoCentro" e "valorProximoAoCentro", e duas do tipo "float": "somaValoresDoCentro" e "valorMediana". "valorDoCentro" está armazenando a divisão do tamanho da "numerosArrayList" por 2; "valorProximoAoCentro" está armazenando "valorDoCentro" + 1; "somaValoresDoCentro" está armazenando a soma dos valores nas posiçôes centrais do "numeroArrayList"; "valorMediana" está armazenando a divisão de "somaValoresDoCentro" por 2. Imprimindo na tela o valor da mediana par.
- Caso seja ímpar, criei duas variáveis do tipo inteiro: "valorDoCentro" e "valorMediana". "valorDoCentro" está armazenando a divisão do tamanho da "numerosArrayList" por 2; "valorMediana" está armazenando o valor que está na posição central do "numerosArrayList". Imprimindo na tela o valor da mediana ímpar.

### Questão 02
Nessa segunda questão, eu iniciei declarando uma "ArrayList" do tipo "Integer" com o nome "arrayListNumeros" e inicializei as variáveis "contador", "loopingArrayList", "valorTotalDeNumerosDiferentes", "numeroArrayList" em zero, e declarei a variável "valorDiferenca".  Como próximo passo, fiz um laço de repetição "While" com a condição de "loopingArrayList == 0", pedindo ao usuário que digitasse um número para adicionar a lista, armazenando ele em uma variável chamada "numeroArrayList". Após isso, com o método "add" adicionei a variável "numeroArrayList" em "arrayListNumeros", coloquei o "contador" para somar 1 cada vez que o loop rodar e pedi ao usuário para digitar 1 caso ele quisesse encerrar o loop.
Pedi ao usuário que digitasse um valor, para saber o número de elementos pares, referente a diferença dos valores anteriores comparados e o armazenei na variável "valorDiferenca". Comecei com um laço de repetição "for", para correr o tamanho do "arrayListNumeros" e dentro dele criei uma variável chamada "valor" que contém o valor do "arrayListNumeros" na posição em que o "for" estiver correndo. Ainda dentro do "for" criei um "for each" com a variável auxiliar "array1", que executa uma estrutura de condição dizendo que se "valor" for igual a diferença de "array1" e "valorDiferenca" vai adicionar mais 1 na variável "valorTotalDeNumerosDiferentes" e imprimir na tela os valores que tem a diferença digitada pelo usuário "valorDiferenca" que estão armazenados em "array1" e "valor". Após o "for" o sistema irá imprimir na tela o total de valores que são da diferença "valorTotalDeNumerosDiferentes".

### Questão 03

ATENÇÃO: Infelizmente, não foi possível realizar a questão corretamente como solicitado no desafio, porém, consegui realizar a parte do código que descobre se há anagramas em substring de uma palavra. Além disso, inseri parte do meu pensamento, que não foi concluído, no comentário da questão dentro do código.

Nessa terceira questão, eu comecei declarando as variáveis "copiaPalavraAnagrama", "substringsAnagrama", "resultadoAnagrama", respectivamente, a primeira variável do tipo "String" será utilizada para armazenar o valor copiado de "palavraAnagrama" que será declarada futuramente, "substringAnagrama" que será utilizada para armazenar o valor das substrings e "resultadoAnagrama" que será utilizada para definir se a palavra será um anagrama ou não. Em seguida, é chamada a solicitação ao usuário para inserir o dado da palavra que ele deseja realizar o processo de descobrir os anagramas das substrings, onde o resultado será armazenado na variável "palavraAnagrama". Em seguida, é feita a passagem de valor da variável "palavraAnagrama" para "copiaPalavraAnagrama", depois disso, é realizado um lopping para ser realizada a lógica para descobrir se a palavra é um anagrama ou não, dentro desse looping há a declaração de "contadorAnagrama" e "caractereAnagrama" e, também, outro looping que será responsável por fazer a comparação de "caractereAnagrama" e de "copiaPalavraAnagrama".

Caso "caractereAnagrama" seja idêntico ao "charAt" na posição de contador secundário (variável responsável por realizar o looping secundário), "contadorAnagrama" recebe mais 1.
Se a variável "contadorAnagrama" for maior ou igual a 2, resultado "anagrama" irá receber mais 1.
