var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var N = parseFloat(lines);
var cont;

console.log(`${getTime(3600)}:${getTime(60)}:${getTime(1)}`);

function getTime(param) {
    cont = 0;
    while ( N >= param) {
        N -= param;
        cont ++;
    }
    return cont;
}