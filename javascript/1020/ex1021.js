var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var N = parseFloat(lines);

console.log('NOTAS:');
console.log(`${getBallot(50)} nota(s) de R$ 50.00`);
console.log(`${getBallot(20)} nota(s) de R$ 20.00`);
console.log(`${getBallot(10)} nota(s) de R$ 10.00`);
console.log(`${getBallot(5)} nota(s) de R$ 5.00`);
console.log(`${getBallot(2)} nota(s) de R$ 2.00`);
console.log('MOEDAS:');
console.log(`${getBallot(1.00)} moeda(s) de R$ 1.00`);
console.log(`${getBallot(0.50)} moeda(s) de R$ 0.50`);
console.log(`${getBallot(0.25)} moeda(s) de R$ 0.25`);  
console.log(`${getBallot(0.10)} moeda(s) de R$ 0.10`);
console.log(`${getBallot(0.05)} moeda(s) de R$ 0.05`);
console.log(`${getBallot(0.01)} moeda(s) de R$ 0.01`);

function getBallot(param) {
    var cont = 0;
    while (N >= param) {
        N -= param;
        cont ++;
    }
    return cont;
};