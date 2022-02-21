# Documentação das questões elaboradas para o processo seletivo da Capgemini
### Questão 01
Nessa primeira questão, eu iniciei pedindo ao usuário que digitasse o número referente ao tamanho da escada, armazenando ele em uma variável chamada "n". Após isso, eu inicializei em 1, uma variável chamada "cont" que servirá como um contador, e criei uma variável auxiliar chamada "aux", igualando ela a variável "n". Depois disso, criei um "for" para rodar a quantidade de vezes que o usuário digitou e dentro dele fiz mais dois "for", o primeiro inserindo espaços e diminuindo a quantidade que se repetem com a variável "aux" e o segundo inserindo os asteriscos e aumentando a quantidade que se repetem com a variável "cont".

### Questão 02
Nessa segunda questão, eu comecei inicializando uma variável do tipo "boolean" em "false" chamada "segura". Após isso, iniciei uma estrutura de repetição do tipo "While" com a condição de segura ser igual a false. Com isso, o código pede ao usuário que digite uma senha, armazenando a resposta em uma variável do tipo "String" chamada "senha". Por fim, fiz uma estrutura de decisão dizendo que: 

- Se a senha for menor que 6 digitos, o código irá imprimir na tela a quantidade de números que faltam para a senha ser segura. E a variável "segura" continuará como "false", fazendo com que o código inicie do zero, pedindo novamente para que se digite uma senha.
- Se não, ou seja, se a senha for maior ou igual a 6 digitos o código irá imprimir na tela que a senha está segura. E a variável "segura" mudará de "false" para "true", fazendo com que não entre na estrutura de repetição, finalizando o código.
