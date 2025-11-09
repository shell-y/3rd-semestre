import { useState } from "react";

export function ListaTelefonica() {
  const [nome, setNome] = useState("");
  const [telefone, setTelefone] = useState("");
  const [contatos, setContatos] = useState([]);

  const cadastrar = () => {
    const novoContato = { nome, telefone };
    setContatos([...contatos, novoContato]);
    setNome("");
    setTelefone("");
  };

  const excluir = (index) => {
    const novaLista = contatos.filter((_, i) => i !== index);
    setContatos(novaLista);
  };

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Lista Telefônica</h2>
      <input
        type="text"
        placeholder="Nome"
        value={nome}
        onChange={(e) => setNome(e.target.value)}
      />
      <input
        type="text"
        placeholder="Telefone"
        value={telefone}
        onChange={(e) => setTelefone(e.target.value)}
      />
      <br />
      <button onClick={cadastrar} style={{cursor: "pointer"}}>Cadastrar</button>

      <ul style={{ listStyle: "none", padding: 0 }}>
        {contatos.map((contato, index) => (
          <li key={index}>
            {contato.nome} - {contato.telefone}{" "}
            <button onClick={() => excluir(index)} style={{cursor: "pointer"}}>Excluir</button>
          </li>
        ))}
      </ul>
    </div>
  );
}
