var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var value = parseInt(lines);

console.log(value);
console.log(`${biggerThen(100)} nota(s) de R$ 100,00`);
console.log(`${biggerThen(50)} nota(s) de R$ 50,00`);
console.log(`${biggerThen(20)} nota(s) de R$ 20,00`);
console.log(`${biggerThen(10)} nota(s) de R$ 10,00`);
console.log(`${biggerThen(5)} nota(s) de R$ 5,00`);
console.log(`${biggerThen(2)} nota(s) de R$ 2,00`);
console.log(`${biggerThen(1)} nota(s) de R$ 1,00`);

function biggerThen(param) {
    var cont = 0;
    while (value >= param) {
        value -= param;
        cont ++;
    }
    return cont;
}