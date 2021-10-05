var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var [A, B, C] = lines.map(item => (parseFloat(item)));
console.log(`NUMBER = ${A} \nSALARY = U$ ${(B*C).toFixed(2)}`);