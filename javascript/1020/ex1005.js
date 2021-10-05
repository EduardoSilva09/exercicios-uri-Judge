var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var [A, B] = lines.map(item => (parseFloat(item)));
A *= 3.5;
B *= 7.5; 
console.log(`MEDIA = ${((A + B)/11).toFixed(5)}`);
