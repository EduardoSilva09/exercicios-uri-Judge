//                                   Triângulo
// Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
// Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

// Perimetro = XX.X

// Em caso negativo, calcule a área do trapézio que tem A e B como base e C como 
// altura, mostrando a mensagem

// Area = XX.X
// Input ['6.0 4.0 2.0'], ['6.0 4.0 2.1']
var input = require('fs').readFileSync('stdin', 'utf-8');
let [A, B, C] = input.split(' ').map(item => parseFloat(item));

if (((A + B) <= C) || ((B + C) <= A) || ((A + C) <= B)) {
    console.log(`Area = ${(((A + B) * C) / 2).toFixed(1)}`)
} else {
    console.log(`Perimetro = ${(A + B + C).toFixed(1)}`)
}

// console.log(`Area = ${(((A + B) * C) / 2).toFixed(1)}`)
// console.log(`Perimetro = ${(A + B + C).toFixed(1)}`)

// console.log(A + B)
// console.log(C + B)
// console.log(A + C)
// console.log(A)
// console.log(B)
// console.log(C)

// console.log((A + B) <= C)
// console.log((B + C) <= A)
// console.log((A + C) <= B)
// console.log((A + B) <= C || ((B + C) <= A || ((A + C) <= B)))

// function notIsTriangle() {
//     return (((A + B) <= C) || ((B + C) <= A) || ((A + C) <= B));
    // ((Math.abs(B - C) < A < (B + C)) &&
    //         (Math.abs(A - C) < B < (A + C)) &&
    //         (Math.abs(A - B) < C < (A + B)));
// }