var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
console.log(SimpleCalculation(lines));
// console.log(codPiece + '\n ' + amountParts + '\n ' + unitPrice);
// console.log(codPiece1 + '\n ' + amountParts1 + '\n ' + unitPrice1);
// console.log(lines[1])
// console.log();

function SimpleCalculation(Values) {
    var [
        codPiece,
        amountParts,
        unitPrice
    ] = Values[0].split(' ').map(item => parseFloat(item));

    var [
        codPiece1,
        amountParts1,
        unitPrice1
    ] = Values[1].split(' ').map(item => parseFloat(item));

    var totalValue = amountParts * unitPrice;
    totalValue += amountParts1 * unitPrice1;

    return `VALOR A PAGAR: R$ ${totalValue.toFixed(2)}`;
}