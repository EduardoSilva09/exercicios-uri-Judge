//                          Fórmula de Bhaskara
// Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
//  Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel
//  calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
// 
// input = ['10.0 20.1 5.1'], ['0.0 20.0 5.0']
var input = require('fs').readFileSync('../stdin', 'utf-8');
var lines = input.split(' ');
var [A, B, C] = lines.map(item => parseFloat(item));

var output = 'Impossivel calcular';

var delta = (Math.pow(B, 2) - 4 * A * C);

if ((delta > 0.0) && (A > 0) && (B > 0) && (C > 0)) {

    var xl = ((-(B) + Math.sqrt(delta)) / (2 * A));
    var x2l = ((-(B) - Math.sqrt(delta)) / (2 * A));
    
    output = `R1 = ${(xl).toFixed(5)}\nR2 = ${(x2l).toFixed(5)}`;
}

console.log(output);