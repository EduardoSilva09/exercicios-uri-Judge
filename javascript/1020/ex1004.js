var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var [A, B] = lines.map(item => (parseInt(item)));
console.log(`PROD = ${A * B}`);
