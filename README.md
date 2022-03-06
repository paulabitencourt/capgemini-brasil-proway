# Documentação das questões elaboradas para o processo seletivo da Capgemini

### TECNOLOGIAS UTILIZADAS: JAVA

### INSTRUÇÕES DE USO

### Questão 01

- Ao rodar o programa, é necessário inserir um número à lista, para descobrir o valor da mediana.
 
### Questão 02

- Ao rodar o programa, é necessário digitar um valor à lista, para saber o número de elementos pares referente a diferença dos valores anteriores comparados.

### Questão 03

- Ao rodar o programa, é necessário inserir a frase que será utilizada para ser encriptada.

### EXPLICAÇÃO SOBRE AS QUESTÕES

### Questão 01
  Nessa primeira questão, eu iniciei declarando uma "ArrayList" do tipo "Integer" com o nome "numerosArrayList" e inicializei a variável "contador" e a variável "loopingArrayList" em zero. Como próximo passo, fiz um laço de repetição "While" com a condição de "loopingArrayList == 0", pedindo ao usuário que digitasse um número para adicionar a lista, armazenando ele em uma variável chamada "numero". Após isso, com o método "add" adicionei a variável "numero" em "numerosArrayList", coloquei o "contador" para somar 1 cada vez que o loop rodar e pedi ao usuário para digitar 1 caso ele quisesse encerrar o loop. Usei o "Colletions.sort()" para ordenar em crescente os valores da ArrayList "numerosArrayList" pedindo ao sistema para imprimir na tela o resultado. Fiz um "if" e "else" para verificar se o Array é par ou ímpar.
- Caso seja par, criei quatro variáveis, duas do tipo inteiro: "valorDoCentro" e "valorProximoAoCentro", e duas do tipo "float": "somaValoresDoCentro" e "valorMediana". "valorDoCentro" está armazenando a divisão do tamanho da "numerosArrayList" por 2; "valorProximoAoCentro" está armazenando "valorDoCentro" + 1; "somaValoresDoCentro" está armazenando a soma dos valores nas posiçôes centrais do "numeroArrayList"; "valorMediana" está armazenando a divisão de "somaValoresDoCentro" por 2. Imprimindo na tela o valor da mediana par.
- Caso seja ímpar, criei duas variáveis do tipo inteiro: "valorDoCentro" e "valorMediana". "valorDoCentro" está armazenando a divisão do tamanho da "numerosArrayList" por 2; "valorMediana" está armazenando o valor que está na posição central do "numerosArrayList". Imprimindo na tela o valor da mediana ímpar.

### Questão 02
  Nessa segunda questão, eu iniciei declarando uma "ArrayList" do tipo "Integer" com o nome "arrayListNumeros" e inicializei as variáveis "contador", "loopingArrayList", "valorTotalDeNumerosDiferentes", "numeroArrayList" em zero, e declarei a variável "valorDiferenca".  Como próximo passo, fiz um laço de repetição "While" com a condição de "loopingArrayList == 0", pedindo ao usuário que digitasse um número para adicionar a lista, armazenando ele em uma variável chamada "numeroArrayList". Após isso, com o método "add" adicionei a variável "numeroArrayList" em "arrayListNumeros", coloquei o "contador" para somar 1 cada vez que o loop rodar e pedi ao usuário para digitar 1 caso ele quisesse encerrar o loop.
  Pedi ao usuário que digitasse um valor, para saber o número de elementos pares, referente a diferença dos valores anteriores comparados e o armazenei na variável "valorDiferenca". Comecei com um laço de repetição "for", para correr o tamanho do "arrayListNumeros" e dentro dele criei uma variável chamada "valor" que contém o valor do "arrayListNumeros" na posição em que o "for" estiver correndo. Ainda dentro do "for" criei um "for each" com a variável auxiliar "array1", que executa uma estrutura de condição dizendo que se "valor" for igual a diferença de "array1" e "valorDiferenca" vai adicionar mais 1 na variável "valorTotalDeNumerosDiferentes" e imprimir na tela os valores que tem a diferença digitada pelo usuário "valorDiferenca" que estão armazenados em "array1" e "valor". Após o "for" o sistema irá imprimir na tela o total de valores que são da diferença "valorTotalDeNumerosDiferentes".

### Questão 03

ATENÇÃO: Infelizmente, não foi possível realizar a questão corretamente como solicitado no desafio, pois foi encontrada uma dificuldade no momento de inserir os dados dentro da matriz, assim, impossibilitando a continuação da questão, causada pelo ciclo de diferentes loopings. Consegui realizar a parte de remover os espaços da frase, inserida na "string" e separar a frase em um "for" convertendo ela em vários "char".

  Nessa terceira questão, eu comecei declarando as variáveis do tipo "String", "palavra" e "palavraSemEspacos"; do tipo "int", "tamanhoPalavraSemEspacos" e "tamanhoMatriz"; do tipo "double", "raizDotamanhoPalavraSemEspacos" e "conversaoParaInteiro"; e do tipo "char", "caracterePalavra". Respectivamente, a primeira variável, será utilizada para armazenar a palavra que será digitado pelo usuário, a segunda variável será utilizada para remover os espaços dessa string, a terceira variável será utilizada para guardar o tamanho da string sem os espaços. A variável "raizDotamanhoPalavraSemEspacos" está sendo utilizada para armazenar a raiz quadrada da variável "tamanhoPalavraSemEspacos", já a variável "conversaoParaInteiro" está arredondando para o maior resultado da variável "raizDotamanhoPalavraSemEspacos". Por último, a variável "tamanhoMatriz" está recebendo a conversão para inteiro da variável "conversaoParaInteiro" que até então é um "double".
  Depois disso, criei uma matriz do tipo "char" chamada "matrizPalavra" que recebe como tamanho a variável "tamanhoMatriz". Fiz um "for" com o tamanho de "palavraSemEspaco" para armazenar dentro da variável "caracterePalavra" cada caractere da string "palavraSemEspaco" e imprimir na tela. Após isso, criei outro "for" com um "for" dentro para tentar acessar cada array da minha matriz, imprimindo eles na tela.
