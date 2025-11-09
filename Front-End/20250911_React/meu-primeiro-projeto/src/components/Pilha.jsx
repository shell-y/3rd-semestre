import { useState, useRef, useEffect } from "react";

export function Pilha() {
  const [capacidade, setCapacidade] = useState(0);
  const [pilha, setPilha] = useState(Array.from({ length: Number(capacidade) }, () => null));
  /* Array.from({ length: 10 }) ~> Cria um array de 10 posições.
  * () => null ~> Inicializa cada posição com null (ao invés de undefined).
  * useState(...) ~> Então o estado inicial pilha será um array de 10 posições nulas — como se fossem 10 espaços “vazios” na pilha. */
  const [valor, setValor] = useState("");
  const [topo, setTopo] = useState(-1); //começa vazia
  const [mensagem, setMensagem] = useState("");

  const espacosDisponiveis = capacidade - (topo + 1);
  const inputRef = useRef(null);

  useEffect(() => {
    setPilha(Array.from({ length: Number(capacidade) }, () => null));
    setTopo(-1);
    setMensagem("");
  }, [capacidade]);


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
    if (isFull()) {
      setMensagem("A pilha está cheia.");
      return;
    }

    if(valor === ""){
      setMensagem("Digite um valor!");
      return;
    }

    const novaPilha = [...pilha]; //fazendo uma cópia da pilha
    //[topo + 1] aponta para o próximo espaço vazio no topo da pilha.
    novaPilha[topo + 1] = valor; //insere esse novo valor nessa posição (o próximo espaço vazio no topo)
    setPilha(novaPilha); //atualiza a lista da pilha para os novos valores
    setTopo(topo + 1); //atualiza a variável topo
    setMensagem(`O valor ${valor} foi adicionado.`);
    setValor("");
    inputRef.current.focus();
  }

  // Remove o item do topo da pilha
  function pop() {
    if (isEmpty()) {
      setMensagem("A pilha está vazia.");
      return;
    }

    const novaPilha = [...pilha]; //fazendo uma cópia da pilha
    const valorRemovido = novaPilha[topo]; //salva o valor a ser removido para consulta
    novaPilha[topo] = null; //remove o valor presente no topo da pilha
    setPilha(novaPilha); //atualiza a lista da pilha para os novos valores
    setTopo(topo - 1); //atualiza a variável topo
    setMensagem(`O valor ${valorRemovido} foi removido.`);
    setValor("");
    inputRef.current.focus();
  }

  // Mostra o item no topo da pilha
  function peek() {
    if (isEmpty()) {
      setMensagem("A pilha está vazia.");
      return;
    }
    setMensagem(`O valor do topo é: ${pilha[topo]}`);
    inputRef.current.focus();
  }

  function conferirCapacidade(e) {
    const capacity = Number(e.target.value);
    if (capacity >= 0 && capacity <= 10) {
      setCapacidade(capacity);
    }else{
      setMensagem("O valor não deve ser maior que 10!");
    }
  }

  return (
    <div className="flex flex-col items-center mt-10 space-y-6">
      <h2 className="text-2xl font-bold text-slate-700">
        Pilha (Stack)
      </h2>
      <div>
        <h3 className="text-sm uppercase text-slate-600 font-bold">Definir capacidade total: <input
          type="number"
          min={0}
          max={10}
          value={capacidade}
          onChange={conferirCapacidade}
          ref={inputRef}
          className="w-12
          border border-gray-400 rounded-lg py-1
          text-center font-normal
          focus:outline-none focus:ring-2 focus:ring-blue-400"/>
        </h3>
        <h3 className="text-sm uppercase text-slate-600">Capacidade restante: {espacosDisponiveis}</h3>
      </div>

      <div className="flex gap-2">
        <input
          type="text"
          value={valor}
          onChange={(e) => setValor(e.target.value)}
          placeholder="Novo elemento"
          ref={inputRef}
          className="border border-gray-400 rounded-lg px-3 py-1 focus:outline-none focus:ring-2 focus:ring-blue-400" />
        <button
          onClick={push}
          className="bg-fuchsia-300 shadow-inner shadow-fuchsia-200 text-white text-shadow-xs
          px-3 py-1 rounded-lg
          hover:cursor-pointer hover:bg-fuchsia-200 hover:shadow-fuchsia-300">
          Push
        </button>
        <button
          onClick={pop}
          className="bg-blue-300 shadow-inner shadow-blue-200 text-white text-shadow-xs
          px-3 py-1 rounded-lg
          hover:cursor-pointer hover:bg-blue-200 hover:shadow-blue-300">
          Pop
        </button>
        <button
          onClick={peek}
          className="bg-indigo-300 shadow-inner shadow-indigo-200 text-white text-shadow-xs
          px-3 py-1 rounded-lg
          hover:cursor-pointer hover:bg-indigo-200 hover:shadow-indigo-300">
          Peek
        </button>
      </div>

        {mensagem && (
          <p className="text-sm text-gray-700 font-medium mb-2">{mensagem}</p>
        )}
        <div className="flex flex-col-reverse">
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
