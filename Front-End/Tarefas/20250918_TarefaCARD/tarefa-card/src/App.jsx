import { useState } from 'react'
import { Card } from './Card.jsx';

export function App() {
  const cards = [
    {
      titulo: "Dark",
      imagem: "https://i.pinimg.com/1200x/2e/c3/4e/2ec34ed3946efc909e9b8cf7896d5473.jpg",
      descricao: "Descrição card dark.",
      tipo: "dark",
      desabilitado: false
    },
    {
      titulo: "Disabled",
      imagem: "https://i.pinimg.com/1200x/55/cf/5b/55cf5b18f2817e434ade474ae77027cb.jpg",
      descricao: "Esse card está desabilitado.",
      tipo: "dark",
      desabilitado: true
    },
    {
      titulo: "Minimalist",
      imagem: "https://img.elo7.com.br/product/685x685/135D486/painel-marie-g-frete-gratis-festa-infantil-decoracao.jpg",
      descricao: "minimalista",
      tipo: "minimalist",
      desabilitado: false
    },
    {
      titulo: "Minimalist disabled",
      imagem: "https://i.pinimg.com/1200x/a1/27/dd/a127dd5e4802d4df4507231097380900.jpg",
      descricao: "minimalista",
      tipo: "minimalist",
      desabilitado: true
    }
  ];

  return (
    <div
      style={{
        background:"#FBE6FF",
        minHeight:"100vh",
        width:"100vw",
        boxSizing: "border-box",
        display: "flex",
        gap: "20px",
        justifyContent: "center",
        alignItems: "center",
        padding: "20px"
      }}
    >
      {cards.map((card, index) => (
        <Card
          key={index}
          titulo={card.titulo}
          imagem={card.imagem}
          descricao={card.descricao}
          tipo={card.tipo}
          desabilitado={card.desabilitado}
        />
      ))}
    </div>
  );
}

export default App
