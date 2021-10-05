var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var [X, Y] = lines.map(item => parseFloat(item));
console.log(`${(X / Y).toFixed(3)} km/l`);