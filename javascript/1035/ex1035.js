//                      Teste de Seleção 1
// Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que 
// C e se D for maior do que A, e a soma de C com D for maior que a soma
// de A e B e se C e D, ambos, forem positivos e se a variável A for par
// escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

// inupt ['5 6 7 8'], ['2 3 2 6']
var input = require('fs').readFileSync('../stdin', 'utf-8');
var lines = input.split(' ');
var [A, B, C, D] = lines.map(item => parseInt(item));

var output = "Valores nao aceitos";

if ((B > C) && (D > A) && ((C + D) > (A + B)) && ((C > 0) && (D > 0)) && ((A%2) == 0)) {
    output = "Valores aceitos";
}

console.log(output);

