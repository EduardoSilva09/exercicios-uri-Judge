var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var days = parseInt(lines);
var cont;

console.log(`${getDate(365)} ano(s)\n${getDate(30)} mes(es)\n${getDate(1)} dia(s)`);

function getDate(param) {
    cont = 0;
    while (days >= param) {
        days -= param;
        cont++;
    }
    return cont;
}

// console.log(`${getDate(365)} ano(s)`);
// console.log(`${getDate(30)} mes(es)`);
// console.log(`${getDate(1)} dia(s)`);