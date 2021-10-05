//                          Intervalo
// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
// dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
// este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,
// deverá ser impressa a mensagem “Fora de intervalo”.

// O símbolo ( representa "maior que". Por exemplo:
// [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
// (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
// input = ['25.01'] , ['25.00']
var input = require('fs').readFileSync('../stdin', 'utf-8');
var lines = input.split(' ');

lines[0] = parseFloat(lines[0]);

var output = 'Fora de intervalo';

if (lines[0] >= 0) {
    
    if (lines[0] <= 25.00) {
        output = 'Intervalo [0,25]';
    } else if (lines[0] <= 50.00) {
        output = 'Intervalo (25,50]';
    } else if (lines[0] <= 75.00) {
        output = 'Intervalo (50,75]';
    } else if (lines[0] <= 100.00) {
        output = 'Intervalo (75,100]';
    }
}
console.log(output);


