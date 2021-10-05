//                          Lanche
// Com base na tabela abaixo, escreva um programa que leia o código de
// um item e a quantidade deste item. A seguir, calcule e mostre o valor
// da conta a pagar.
//input = ['3 2'], ['4 3']
var input = require('fs').readFileSync('../stdin', 'utf-8');
var lines = input.split(' ');

var [cod, amount] = lines.map(item => parseInt(item));

const CachorroQuente = 1;
const XSalada = 2;
const XBacon = 3;
const TorradaSimples = 4;
const Refrigerante = 5;


switch (cod) {
    case CachorroQuente:
        calcTotal(4.0);
        break;
    case XSalada:
        calcTotal(4.50);
        break;
    case XBacon:
        calcTotal(5.00);
        break;
    case TorradaSimples:
        calcTotal(2.0);
        break;
    case Refrigerante:
        calcTotal(1.50);
        break;
}
function calcTotal(value) {
    console.log(`Total: R$ ${(value * amount).toFixed(2)}`);
}