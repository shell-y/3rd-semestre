import { useState } from "react";

export function Calculadora() {
  const [numero1, setNumero1] = useState("");
  const [numero2, setNumero2] = useState("");
  const [operacao, setOperacao] = useState("+");
  const [resultado, setResultado] = useState(null);

  const calcular = () => {
    const n1 = parseFloat(numero1);
    const n2 = parseFloat(numero2);
    let res = 0;

    switch (operacao) {
      case "+":
        res = n1 + n2;
        break;
      case "-":
        res = n1 - n2;
        break;
      case "*":
        res = n1 * n2;
        break;
      case "/":
        res = n1 / n2;
        break;
      default:
        res = "Erro";
    }
    setResultado(res);
  };

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Calculadora</h2>
      <input
        type="number"
        placeholder="Primeiro número"
        value={numero1}
        onChange={(e) => setNumero1(e.target.value)}
      />
      <select value={operacao} onChange={(e) => setOperacao(e.target.value)}>
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">×</option>
        <option value="/">÷</option>
      </select>
      <input
        type="number"
        placeholder="Segundo número"
        value={numero2}
        onChange={(e) => setNumero2(e.target.value)}
      />
      <br />
      <button onClick={calcular} style={{cursor: "pointer"}}>Calcular</button>
      {resultado !== null && <h3>Resultado: {resultado}</h3>}
    </div>
  );
}
