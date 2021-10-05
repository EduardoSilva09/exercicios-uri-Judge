//                       Tempo de Jogo
// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração 
// do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
// tendo uma duração mínima de 1 hora e máxima de 24 horas.
// 16 2
var input = require('fs').readFileSync('stdin', 'utf-8');
var [startHour, endHour] = input.split(' ').map(itens => parseInt(itens));

console.log(`O JOGO DUROU ${gameDuration()} HORA(S)`);

function gameDuration() {
    if (startHour == endHour) return 24;
    else if (startHour < endHour) return endHour - startHour;
    else return 24 - Math.abs(startHour - endHour);
}