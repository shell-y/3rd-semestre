function filtrarNome(lista, letra) {
    return lista.filter(nome => nome.startsWith(letra));
}
console.log(filtrarNome(["Ana", "João", "Maria"], 'A'));

const filtrarNumeros = (lista, valor) => lista.filter(num => num > valor);
//mesma coisa que { return lista.filter(num => num > valor); }
console.log(filtrarNumeros([10,20,30,40,50], 25));