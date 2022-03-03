# Documentação das questões elaboradas para o processo seletivo da Capgemini

### TECNOLOGIAS UTILIZADAS: JAVA

### INSTRUÇÕES DE USO

### Questão 01

- Ao rodar o programa, é necessário inserir o tamanho da escada desejada pelo usuário, sendo ele um número inteiro.

### Questão 02

- Ao rodar o programa, é necessário digitar a senha a ser testada pelo sistema onde irá ocorrer a solicitação feita pela questão 02, sendo ele em valor "String".

### Questão 03

- Ao rodar o programa, é necessário inserir a palavra que será utilizada para descobrir se suas substrings são anagramas ou não, sendo ele em valor "String".

### EXPLICAÇÃO SOBRE AS QUESTÕES

### Questão 01
Nessa primeira questão, eu iniciei pedindo ao usuário que digitasse o número referente ao tamanho da escada, armazenando ele em uma variável chamada "n". Após isso, eu inicializei em 1, uma variável chamada "cont" que servirá como um contador, e criei uma variável auxiliar chamada "aux", igualando ela a variável "n". Depois disso, criei um "for" para rodar a quantidade de vezes que o usuário digitou e dentro dele fiz mais dois "for", o primeiro inserindo espaços e diminuindo a quantidade que se repetem com a variável "aux" e o segundo inserindo os asteriscos e aumentando a quantidade que se repetem com a variável "cont".

### Questão 02
Nessa segunda questão, eu comecei inicializando uma variável do tipo "boolean" em "false" chamada "segura". Após isso, iniciei uma estrutura de repetição do tipo "While" com a condição de segura ser igual a "false". Com isso, o código pede ao usuário que digite uma senha, armazenando a resposta em uma variável do tipo "String" chamada "senha". Por fim, fiz uma estrutura de decisão dizendo que: 

- Se a senha for menor que 6 digitos, o código irá imprimir na tela a quantidade de números que faltam para a senha ser segura. E a variável "segura" continuará como "false", fazendo com que o código inicie do zero, pedindo novamente para que se digite uma senha.
- Se não, ou seja, se a senha for maior ou igual a 6 digitos o código irá imprimir na tela que a senha está segura. E a variável "segura" mudará de "false" para "true", fazendo com que não entre na estrutura de repetição, finalizando o código.

### Questão 03

ATENÇÃO: Infelizmente, não foi possível realizar a questão corretamente como solicitado no desafio, porém, consegui realizar a parte do código que descobre se há anagramas em substring de uma palavra. Além disso, inseri parte do meu pensamento, que não foi concluído, no comentário da questão dentro do código.

Nessa terceira questão, eu comecei declarando as variáveis "copiaPalavraAnagrama", "substringsAnagrama", "resultadoAnagrama", respectivamente, a primeira variável do tipo "String" será utilizada para armazenar o valor copiado de "palavraAnagrama" que será declarada futuramente, "substringAnagrama" que será utilizada para armazenar o valor das substrings e "resultadoAnagrama" que será utilizada para definir se a palavra será um anagrama ou não. Em seguida, é chamada a solicitação ao usuário para inserir o dado da palavra que ele deseja realizar o processo de descobrir os anagramas das substrings, onde o resultado será armazenado na variável "palavraAnagrama". Em seguida, é feita a passagem de valor da variável "palavraAnagrama" para "copiaPalavraAnagrama", depois disso, é realizado um lopping para ser realizada a lógica para descobrir se a palavra é um anagrama ou não, dentro desse looping há a declaração de "contadorAnagrama" e "caractereAnagrama" e, também, outro looping que será responsável por fazer a comparação de "caractereAnagrama" e de "copiaPalavraAnagrama".

Caso "caractereAnagrama" seja idêntico ao "charAt" na posição de contador secundário (variável responsável por realizar o looping secundário), "contadorAnagrama" recebe mais 1.
Se a variável "contadorAnagrama" for maior ou igual a 2, resultado "anagrama" irá receber mais 1.
