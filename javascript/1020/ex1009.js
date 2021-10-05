var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
// var [A, B, C] = lines.map(item => (parseFloat(item)));
// var name = lines[0];
var salary = parseFloat(lines[1]);
var allSales = parseFloat(lines[2]);
console.log(`TOTAL = R$ ${(salary + (allSales * 0.15)).toFixed(2)}`);

// console.log(name +'\n' + salary +'\n'+ allSales); 
// console.log(`NUMBER = ${A} \nSALARY = U$ ${(B*C).toFixe
