//                         Sort Simples
// Leia 3 valores inteiros e ordene-os em ordem crescente. No final,
// mostre os valores em ordem crescente, uma linha em branco e em seguida,
// os valores na sequência como foram lidos.
// input =['7 21 -14'], ['-14 21 7']
var input = require('fs').readFileSync('stdin', 'utf-8');
let lines = input.split(' ').map(item => parseInt(item));
var [A, B, C] = lines;
var insertionOrder = `${A}\n${B}\n${C}`;

C = MaiorABC(A,B,C);
lines.splice(lines.indexOf(C),1);
B = MaiorAB(lines[0], lines[1]);
lines.splice(lines.indexOf(B),1);
A = lines[0];
 
console.log(`${A}\n${B}\n${C}\n`);
console.log(insertionOrder);

function MaiorABC(A, B, C) {
    var aux = MaiorAB(A,B);
    return MaiorAB(aux,C);
}

function MaiorAB(A,B){
    return ((A + B + Math.abs(A-B))/2);
}

// var aux = [];

// console.log(MaiorABC(A, B, C))
// lines[2] = MaiorABC(A, B, C);

// C = MaiorABC(A,B,C);
// console.log(lines.splice(lines.indexOf(C-1),1));
// B = MaiorAB(lines[0], lines[1])

// console.log(C)
// console.log(lines.indexOf(C))
// console.log(B)
// console.log(lines[0])
// console.log(lines[1])
// console.log(lines[2])

// lines[1] = MaiorAB(lines[0],lines[1])
// outputOrder = `${A}\n${B}\n${C}`
// console.log(lines);





// if (A < B && B < C){
//     outputOrder = `${C}\n${B}\n${A}`;
// } else if (A > B && B > C){
//     outputOrder = `${A}\n${B}\n${C}`;
// }


// A = Math.min(lines);
// C = Math.max(lines);
// B = lines.splice(lines.indexOf(A), 1); 
// B =  B.splice(B.indexOf(C), 1)
// outputOrder = `${A}\n${B}\n${C}`;

// console.log(insertionOrder);
// console.log(outputOrder);