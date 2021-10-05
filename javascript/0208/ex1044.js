//                                  Múltiplos
// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
// "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
// múltiplos entre si.
// input ['6 24'], ['6 25']
var input = require('fs').readFileSync('stdin', 'utf-8');
var [A, B] = input.split(' ').map(itens => parseInt(itens));
var output = 'Nao sao Multiplos';
var x = MaiorAB(A, B);

console.log(isMutiple(A, B));

function isMutiple(A, B) {
    for (i = 0; i < x; i++) {
        if ((A % B == 0) || (B % A == 0)) {
            output = 'Sao Multiplos';
        }
    }
    return output;
}

function MaiorAB(A, B) {
    return ((A + B + Math.abs(A - B)) / 2);
}