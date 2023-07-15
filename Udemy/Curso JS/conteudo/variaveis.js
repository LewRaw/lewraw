//Declaracao de variaveis
//Não podemos criar variáveis com palavras reservadas
//Variáveis precisam ter nomes significativos
//Não pode começar o nome de uma variável com um número
//Não podem conter espaços ou traços
//Utilizamos camelCase
//Case-sensitive
//Não podemos redeclarar variáveis com let
//NÃO UTILIZE VAR, UTILIZE LET.
let nomePessoa;
let nomeDevedor = 'Luiz';
const nomeCliente = 'Luiz'; //não pode alterar valor

//Conversao Numericos
let numeroInteiro = parseInt('5');
let numeroFloat = parseFloat('5.10');
let numeroQualquer = number('10.1');
let numeroString = numeroQualquer.toString();

//Manipulacao de String
document.body.innerHTML += 'Seu nome é: <strong>'+ nome +'</strong><br />';
//nome.length       
//nome[1]                       -Retorna a letra no indice informado
//nome.indexOf('a')             -Retorna o indice da PRIMEIRA letra A
//nome.lastIndexOf('a')         -Retorna o ULTIMO indice da letra A
//nome.slice(-3, nome.length)   -Retorna as ultimas 3 letras
//nome.split(';')               -Splita a cada ';'
//nome.toUpperCase()
//nome.toLowerCase()