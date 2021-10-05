// var input = require('fs').readFileSync('stdin', 'utf8');
// var lines = input.split('\n');
// var R = lines.map(item => parseInt(item));
// console.log(calculationSphere(R));

// function calculationSphere(raio) {
//     return `VOLUME = ${((4.0 / 3) * 3.14159 * Math.pow(raio, 3)).toFixed(3)}`;
// }

var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
// var R = parseInt(lines[0]);
console.log(`VOLUME = ${((4.0 / 3) * 3.14159 * Math.pow(parseInt(lines[0]), 3)).toFixed(3)}`);

function calculationSphere(raio) {
    return `VOLUME = ${((4.0 / 3) * 3.14159 * Math.pow(raio, 3)).toFixed(3)}`;
}