import { useState, useEffect } from "react";

export function ExibirPersonagens() {
  const [personagens, setPersonagens] = useState([]);

  useEffect(() => {
    fetch("https://rickandmortyapi.com/api/character")
      .then((res) => res.json())
      .then((data) => setPersonagens(data.results))
      .catch((err) => console.error("Erro ao buscar personagens:", err));
  }, []);

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Personagens Rick & Morty</h2>
      <div
        style={{
          display: "flex",
          flexWrap: "wrap",
          justifyContent: "center",
          gap: "15px",
        }}
      >
        {personagens.map((p) => (
          <div
            key={p.id}
            style={{
              border: "1px solid #ccc",
              borderRadius: "10px",
              padding: "10px",
              width: "150px"
            }}
          >
            <img
              src={p.image}
              alt={p.name}
              style={{ width: "100%", borderRadius: "8px" }}
            />
            <p>{p.name}</p>
          </div>
        ))}
      </div>
    </div>
  );
}
