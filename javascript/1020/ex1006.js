var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var [A, B, C] = lines.map(item => (parseFloat(item)));
A *= 2;
B *= 3; 
C *= 5;
console.log(`MEDIA = ${((A + B + C)/10).toFixed(1)}`);
