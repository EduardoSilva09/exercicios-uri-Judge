//                          Tipos de Triângulos
// Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente,
// de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo
// de triângulo que estes três lados formam, com base nos seguintes casos, sempre
// escrevendo uma mensagem adequada:
// se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
// se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
// se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
// se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
// se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
// se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
// inupt ['7.0 5.0 7.0'], ['6.0 6.0 10.0']
var input = require('fs').readFileSync('stdin', 'utf-8');
var [A, B, C] = input.split(' ').map(item => parseFloat(item));

if (A >= (B + C)) {  console.log('NAO FORMA TRIANGULO') }
if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) { 
    console.log('TRIANGULO RETANGULO') 
}
if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
     console.log('TRIANGULO OBTUSANGULO')
}
if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) { 
    console.log('TRIANGULO ACUTANGULO') 
}
if (A == B == C) {
     console.log('TRIANGULO EQUILATERO') 
}
if ((A == B != C) || (A != B == C) || (A == C != B)) { 
    console.log('TRIANGULO ISOSCELES') 
}