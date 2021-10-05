//                               Média 3
// Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
// correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 
// 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média 
// acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, 
// imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, 
// imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 
// 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

// No caso do aluno estar em exame, leia um valor correspondente à nota do exame 
// obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela 
// nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente 
// calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média 
// final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou 
// menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente 
// na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

// input ['2.0 4.0 7.5 8.0 6.4'], ['2.0 6.5 4.0 9.0'], ['9.0 4.0 8.5 9.0']

var input = require('fs').readFileSync('../stdin', 'utf-8');
var lines = input.split('\n');

var [N1, N2, N3, N4] = lines[0].split(' ').map(items => parseFloat(items));

var output;
var average = (((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10);

console.log(`Media: ${average.toFixed(1)}\n` + CalcAverage());

function CalcAverage() {
    if (average >= 5.0 && (average <= 6.9)) { Exam() }
    else { Approved(average, 7.0) };
    return output;
}

function Approved(note, param) {
    output = `Aluno reprovado.`;

    if (note >= param) {
        output = `Aluno aprovado.`;
    }
    return output;
}

function Exam() {
    examNote = parseFloat(lines[1]);
    output = `Aluno em exame.\n`;
    output += `Nota do exame: ${examNote.toFixed(1)}\n`;
    output += `${Approved(examNote, 5.0)}\n`;
    output += `Media final: ${((average + examNote) / 2).toFixed(1)}`;
    return output;
}
