var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var [v1, v2] = lines.map(item => parseInt(item));

console.log(((v1 / 12) * v2).toFixed(3));