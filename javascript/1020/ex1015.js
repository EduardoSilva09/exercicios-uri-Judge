var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var [x1, y1] = lines[0].split(' ').map(item => parseFloat(item));
var [x2, y2] = lines[1].split(' ').map(item => parseFloat(item));
//raiz(x2-x1)^2 + (y2-y1)^2
console.log(Math.hypot((x2-x1),(y2-y1)).toFixed(4));