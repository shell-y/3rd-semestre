function cumprimentar(falarFn) {
    console.log("Opa! Bão?");
    falarFn();
}

/*
cumprimentar(function () { //função anônima
    console.log("pessoa culta")
});

cumprimentar(() => { //arrow function
    console.log("pessoa culta")
});
*/

const somar = (num1, num2) => num1 + num2;
//ou
const somar2 = (num1, num2) => {
    let resultado = num1 + num2;
    console.log(resultado);
};

async function buscarDados() {
    // setTimeout(() => console.log("Os dados chegaram!"), 3000)
    const response = await fetch("http://pokeapi.co/api/v2/pokemon/ditto",{method:"GET"})
    const data = await response.json();
    return data;
}

// async function exibirDados() {
//     await buscarDados();
//     console.log("Buscou dados")
// }