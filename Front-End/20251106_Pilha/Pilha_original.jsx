import { useState } from "react";
import tailwindcss from "@tailwindcss/vite";

export function Pilha() {
  const [pilha, setPilha] = useState(Array.from({ length: 10 }, () => null));
  /* Array.from({ length: 10 }) ~> Cria um array de 10 posições.
  * () => null ~> Inicializa cada posição com null (ao invés de undefined).
  * useState(...) ~> Então o estado inicial pilha será um array de 10 posições nulas — como se fossem 10 espaços “vazios” na pilha. */
  const [valor, setValor] = useState("");
  const [topo, setTopo] = useState(-1); //começa vazia
  const [mensagem, setMensagem] = useState("");

  // Verifica se a pilha está cheia
  function isFull() {
    return topo === pilha.length - 1;
  }

  // Verifica se a pilha está vazia
  function isEmpty() {
    return topo === -1;
  }

  // Insere um item no topo da pilha
  function push() {
    if(isFull()) {
        setMensagem("A pilha está cheia.");
        return;
    }

    const novaPilha = [...pilha]; //fazendo uma cópia da pilha
    //[topo + 1] aponta para o próximo espaço vazio no topo da pilha.
    novaPilha[topo + 1] = valor; //insere esse novo valor nessa posição (o próximo espaço vazio no topo)
    setPilha(novaPilha); //atualiza a lista da pilha para os novos valores
    setTopo(topo + 1); //atualiza a variável topo
    setMensagem(`O valor ${valor} foi adicionado.`);
  }

  // Remove o item do topo da pilha
  function pop() {
    if(isEmpty()) {
        setMensagem("A pilha está vazia.");
        return;
    }

    const novaPilha = [...pilha]; //fazendo uma cópia da pilha
    const valorRemovido = novaPilha[topo]; //salva o valor a ser removido para consulta
    novaPilha[topo] = null; //remove o valor presente no topo da pilha
    setPilha(novaPilha); //atualiza a lista da pilha para os novos valores
    setTopo(topo - 1); //atualiza a variável topo
    setMensagem(`O valor ${valorRemovido} foi removido.`);
  }

  // Mostra o item no topo da pilha
  function peek() {
    if(isEmpty()) {
        setMensagem("A pilha está vazia.");
        return;
    }
    setMensagem(`O valor do topo é: ${pilha[topo]}`)  
  }

  return (
    <div className="flex flex-col items-center mt-10 space-y-6">
      <h2 className="text-2xl font-bold text-gray-800">
        Pilha (Stack) - Capacidade: 10
      </h2>

      <div className="flex gap-2">
        <input
          type="text"
          value={valor}
          onChange={(e) => setValor(e.target.value)}
          placeholder="Novo elemento"
          className="border border-gray-400 rounded-lg px-3 py-1 focus:outline-none focus:ring-2 focus:ring-blue-400"/>
        <button
          onClick={push}
          className="bg-blue-500 hover:bg-blue-600 text-white px-3 py-1 rounded-lg">
          Push
        </button>
        <button
          onClick={pop}
          className="bg-red-500 hover:bg-red-600 text-white px-3 py-1 rounded-lg">
          Pop
        </button>
        <button
          onClick={peek}
          className="bg-yellow-500 hover:bg-yellow-600 text-white px-3 py-1 rounded-lg">
          Peek
        </button>
      </div>

      {mensagem && (
        <p className="text-sm text-gray-700 font-medium mt-2">{mensagem}</p>
      )}

      {/* <div className="flex col-reverse items-center mt-6"> */}
      <div className="flex">
        {pilha.map((item, i) => (
          <div
            key={i}
            className={`w-32 h-10 flex items-center justify-center rounded-lg border mb-1 ${i === topo ? "border-blue-500 bg-blue-100" : "border-gray-300"}`}>
            {item ?? ""}
          </div>
        ))}
      </div>

      
    </div>
  );
}
