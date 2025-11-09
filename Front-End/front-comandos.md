.: ANOTAÇÕES FRONT-END :.



##### .slice()

Serve para copiar uma parte de um array e retornar uma nova lista (sem alterar o array original).



 	array.slice(inicio, fim);



inicio → índice onde começa a cópia.

fim → índice onde termina (não incluído).

Se algum valor for negativo, ele é contado de trás para frente.



---



##### .reduce()

Percorre cada elemento do array e acumula um resultado usando uma função que você define.



 	array.reduce(function(acumulador, elemento, indice, arrayOriginal) {

  	// retorna o novo valor do acumulador

 	}, valorInicial);



acumulador → guarda o valor acumulado até o momento (o resultado que está sendo construído).

elemento → o valor atual do array sendo processado.

indice → posição do elemento atual (opcional).

arrayOriginal → o array completo (opcional).

valorInicial → opcional, valor inicial do acumulador (se não passar, o primeiro elemento do array será usado).



Exemplo de uso:

 	numeros.reduce((acum, n) => acum + n, 0);

acum → acumulador, guarda o resultado até agora.

n → elemento atual do array sendo processado.

0 → valor inicial do acumulador



---



##### .some()

Retorna true assim que encontra o primeiro elemento que satisfaz a condição.



 	array.some(function(elemento, indice, arrayOriginal) {

  	return condicao; // true ou false

 	});



elemento → o valor atual do array sendo processado.

indice → a posição atual (opcional).

arrayOriginal → o array completo (opcional).



---



##### .indexOf()

Procura o valor no array e indica o índice da primeira vez que ele aparece.



 	array.indexOf(valorASerProcurado);



---



##### .map()

Percorre todos os elementos de um array;

Aplica uma função a cada elemento;

Retorna um novo array com os resultados da função;



 	array.map(function(elemento, indice) {

 	return elementoTransformado;

 	});



elemento → o valor do elemento atual.

indice → a posição atual do elemento (opcional).



---



\[...lista] → cria uma cópia da lista para não alterar a original.

O ... “espalha” os elementos de um array ou objeto.

No caso de \[...lista], ele cria uma cópia de todos os elementos da lista dentro de um novo array.

