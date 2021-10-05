var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');
var [v1, v2, v3] = lines.map(item => parseFloat(item));

aux = MaiorAB(v1, v2);
aux = MaiorAB(aux, v3);

console.log(`${aux} eh o maior`);
// console.log(Math.max(v1,v2,v3));

function MaiorAB(A,B){
    return ((A + B + Math.abs(A-B))/2);
}