//                         Coordenadas de um Ponto
// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de
// um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou
// se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
// Se o ponto estiver na origem, escreva a mensagem “Origem”.
// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
//input ['4.5 -2.2'],['0.1 0.1']

var input = require('fs').readFileSync('../stdin', 'utf-8');
var [x, y] = input.split(' ').map(item => parseFloat(item));
var output;

console.log(Coordinates());

function Coordinates(){
    Axel();
    Quadrant();
    return output;
}

function Axel() {
    if (x === 0.0 && y == x) {
        output = 'Origem';
    } else if (x === 0.0) {
        output = 'Eixo Y';
    } else if (y === 0.0) {
        output = 'Eixo X';
    }
}

function Quadrant() {
    if (x > 0.0 && y > 0.0) {
        output = 'Q1';
    } else if (x < 0.0 && y > 0.0) {
        output = 'Q2';
    } else if (x < 0.0 && y < 0.0) {
        output = 'Q3';
    } else if (x > 0.0 && y < 0.0) {
        output = 'Q4';
    }
}