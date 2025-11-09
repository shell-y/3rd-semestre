//************************* MAP
const pessoas = [{
    nome: "Fulano",
    endereco: "Rua A"
},
{
    nome: "Ciclano",
    endereco: "Rua B"
},
{
    nome: "Beltrano",
    endereco: "Rua C"
}];

const nomes = pessoas.map(
    (pessoa) => pessoa.nome
);
console.log(nomes);

const numeros = [10, 20, 30];

const numerosTriplicados = numeros.map(
    (cadaNumeroDaLista) => cadaNumeroDaLista * 3
);
console.log("Números Triplicados", numerosTriplicados);

//*************************FILTER

const numerosPares = numeros.filter(
    numeroAtual => numeroAtual % 2 === 0
);
console.log("Números pares", numerosPares);

//*************************FIND

const animais = ["Elefante", "Papagaio", "Macaco", "Capivara"];

const buscarCapivara = animais.find(
    element => element === "Capivara"
);
console.log("Achou a", buscarCapivara);

//*************************REDUCE

function exercicio17(vetor) {
    const vetorSemDuplicatas = vetor.reduce(
        (auxiliar, valorAtual) => {
            if (!auxiliar.includes(valorAtual)) {
                auxiliar.push(valorAtual)
            }
            return auxiliar;
        }, [] //[] o valor inicial é um vetor vazio
    )
    return vetorSemDuplicatas;
}

console.log("Lista sem duplicatas:",exercicio17([1,1,2,3,4,5,4]));