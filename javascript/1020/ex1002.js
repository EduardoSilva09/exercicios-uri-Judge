// var input = require('fs').readFileSync('stdin', 'utf8');
// var lines = input.split('\n');//.map(item => (parseFloat(item)));
// console.log(typeof lines);
// var n = 3.14159;
// var raio = (n * (lines[0] * lines[0]));

// console.log(`A=${raio.toFixed(4)}`);

var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var area = 3.14159 * (Math.pow(parseFloat(lines[0]),2))
console.log(`A=${area.toFixed(4)}`);

// console.log(typeof lines);
// var raio = parseFloat(lines[0]);
// console.log(typeof raio);
// console.log(Math.pow(raio,2));