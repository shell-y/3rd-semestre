import { useState, useEffect } from "react";

export function Contador() {
  const [contador, setContador] = useState(0);

  useEffect(() => {
    document.title = `Contador: ${contador}`;
  }, [contador]);

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Contador</h2>
      <h3>{contador}</h3>
      <button onClick={() => setContador(contador - 1)} style={{cursor: "pointer"}}>-1</button>
      <br></br>
      <button onClick={() => setContador(contador + 1)} style={{cursor: "pointer"}}>+1</button>
    </div>
  );
}
