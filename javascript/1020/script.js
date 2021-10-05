// require("fs") - é uma palavra reservada do node que serve para fazermos requisições de módulos
//o nome do módulo  que fizemos requisição é o fs(file system) para ler o conteúdo do arquivo
// readFileSync("Nome do arquivo a ser lido", "tipo de encoding desse arquivo") - método sincrono
var input = require("fs").readFileSync("stdin", "utf8"); // lê o conteúdo e armazena na variavel
console.log(typeof input); // Imprime o valor na tela

// manipulando strings
var linhas = input.split(" ");// split recebe como parametro o separador das informações 
console.log(linhas);
console.log(linhas[1]);

//criando o vetor e armazenando as informações dele dentro das respectivas variaveis
var [x, y, z] = input.split(" ");// split recebe como parametro o separador das informações 
console.log(x);
console.log(y);
console.log(z);

//fazer o mapeamento - por padrão o split retorna uma string
var [x, y, z] = input.split(" ").map(item => parseInt(item));// no map recebe o item e ele retorna o valor inteiro
console.log(typeof x);
console.log(y);
console.log(z);
console.log(x +  y);

