var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');
var [A, B, C] = lines.map(item => parseFloat(item));
// a) a área do triângulo retângulo que tem A por base e C por altura.
console.log(`TRIANGULO: ${((A * C) / 2).toFixed(3)}`);
// b) a área do círculo de raio C. (pi = 3.14159)
console.log(`CIRCULO: ${(3.14159 * Math.pow(C, 2)).toFixed(3)}`);
// c) a área do trapézio que tem A e B por bases e C por altura.
console.log(`TRAPEZIO: ${(((A + B) / 2) * C).toFixed(3)}`);
// d) a área do quadrado que tem lado B.
console.log(`QUADRADO: ${(B * B).toFixed(3)}`);
// e) a área do retângulo que tem lados A e B. 
console.log(`RETANGULO: ${(A * B).toFixed(3)}`);