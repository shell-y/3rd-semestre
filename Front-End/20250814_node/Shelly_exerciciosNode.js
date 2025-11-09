//01
function retornarPrimeiro(lista) {
    return lista[0];
}
console.log('1)', retornarPrimeiro([10, 20, 30]));
//node exercicios.js no comando para testar

//02
function retornarTresUltimos(lista) {
    return lista.slice(-3);
}
console.log('2)', retornarTresUltimos([10, 20, 30, 40, 50, 60, 70]));

//03
function retornarQtdPares(lista) {
    return lista.filter(numeroAtual => numeroAtual % 2 === 0);
}
console.log('3)', retornarQtdPares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).length);

//04
function retornarQtdImpares(lista) {
    return lista.filter(numeroAtual => numeroAtual % 2 != 0).length;
}
console.log('4)', retornarQtdImpares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));

//05
function retornarNegativos(lista) {
    return lista.filter(n => n < 0);
}
console.log('5)', retornarNegativos([-1, 0, -5, 2, -4, 4, 5, -8, 9]).length);

//06
function retornarSoma(lista) {
    return lista.reduce(
        (acumulador, atual) => acumulador + atual, 0 //acumulador começa do 0
    );
}
console.log('6)', retornarSoma([1, 2, 3, 4, 5]));

//07
function retornarMaior(lista) {
    let maiorNumero = lista[0];
    return lista.reduce(
        //nº atual é MAIOR que acumulador? então, acumulador = atual, se não, mantém acumulador
        (acumulador, atual) => (atual > acumulador ? atual : acumulador), maiorNumero
    );
}
console.log('7)', retornarMaior([4, 8, 3, 24, 578, 6, 55, 2, 4, 0]));

//08
function retornarMenor(lista) {
    return lista.reduce(
        (acumulador, atual) => (atual < acumulador ? atual : acumulador), lista[0]
    );
}
console.log('8)', retornarMenor([4, 8, 3, -24, 578, 6, 55, 2, 4, -15, 0]));

//09
function retornarAnalisePositivos(lista) {
    return lista.every(
        n => n >= 0
    );
}
console.log('9)', retornarAnalisePositivos([4, 8, 3, 24, 578, 6, 55, 2, 4, 15, 0]));

//10
function retornarAparicoesValor(lista, valor) {
    return lista.filter(n => n === valor).length;
}
console.log('10)', retornarAparicoesValor([4, 8, 2, 3, -2, 2, 4, 578, 6, 55, 2, 4, 15, 0], 2));

//11
function retornarPares(lista) {
    return lista.filter(n => n % 2 === 0);
}
console.log('11)', retornarPares([4, 8, 2, 3, 4, 0, 6, 55]));

//12
function retornarImpares(lista) {
    return lista.filter(n => n % 2 != 0);
}
console.log('12)', retornarImpares([4, 8, 2, 3, 4, 0, 6, 55]));

//13
function retornarInverso(lista) {
    return lista.slice().reverse(); //slice() pois o reverse() altera o array original
}
console.log('13)', retornarInverso([6, 8, 2, 3, 0]));

//14
function retornarAnaliseRepetidos(lista) {
    return lista.some(
        (itemAtual, i) => lista.indexOf(itemAtual) !== i
        //lista.indexOf(valorASerProcurado)
        //se for diferente de i (índice da vez), então não apareceu ainda, retorna false
        /*retorna true caso algum index for realmente diferente do índice da vez,
        ou seja, encontrou um valor igual em outro índice*/
    );
}
console.log('14)', retornarAnaliseRepetidos([4, 8, 2, 3, 4, 0, 6, 55]));

//15
function retornarMedia(lista) {
    let somaItens = lista.reduce(
        (acumularValor, n) => acumularValor + n, 0
    );
    return somaItens / lista.length;
}
console.log('15)', retornarMedia([0, 4, 2, 2]));

//16
function retornarMaiores(lista, valor) {
    return lista.filter(
        n => n > valor
    );
}
console.log('16)', retornarMaiores([4, 8, 2, 3, 40, 0, 6, 55], 5));

//17
function retornarValoresUnicos(lista) {
    return lista.filter(
        (valorAtual, iAtual) => lista.indexOf(valorAtual) === iAtual
        //A 1ª vez que esse valor apareceu foi no índex igual ao iAtual? então, é true
        /* Caso queira remover todos os números que aparecem mais de uma vez, e não só manter a primeira ocorrência:
        return vetor.filter(n => vetor.indexOf(n) === vetor.lastIndexOf(n)); */
    );
}
console.log('17)', retornarValoresUnicos([4, 8, 2, 4, 5]));

//18
function verificarOrdemCrescente(lista) {
    if (lista.some(valorAtual => isNaN(valorAtual))) return `Lista Inválida`;

    return lista.every(
        (valorAtual, indexAtual) => indexAtual === 0 || lista[indexAtual - 1] <= valorAtual
        //Se o index for o 1º, ou seja, [0], considere válido automaticamente
    );
}
console.log('18a)', verificarOrdemCrescente([4, 8, 2, 4, 5]));
console.log('18b)', verificarOrdemCrescente([1, 2, 3, 4, 5]));
console.log('18c)', verificarOrdemCrescente([1, 2, 3, 'batata', 6]));

//19
function somarVetores(lista1, lista2) {
    if (lista1.length !== lista2.length) return `Vetores de tamanhos diferentes`;

    return lista1.map(
        (valorAtual, i) => valorAtual + lista2[i]
    );
}
console.log('19a)', somarVetores([1, 2, 4, 4, 5], [3, 7, 8, 3, 2]));
console.log('19b)', somarVetores([1, 2, 3, 4, 5], [5, 4, 3, 2]));

//20
function retornarNMaiores(lista, n) {
    return lista.sort((a, b) => b - a).slice(0, n);
    //Primeiro, ordenamos em ordem descrescente
    //Depois, exibimos apenas a quantidade de números solicitada: slice(0,n) -> começa no index 0, vai até [n]
    //OBS.: Não precisa copiar a lista com [...lista] pois o método .slice() já faz uma cópia
}
console.log('20)',retornarNMaiores([42, 1, 3, 12, 273, 19], 4));