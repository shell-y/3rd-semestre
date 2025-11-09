import axios from "axios";
import { useEffect, useState } from "react";

export function ExibirPersonagem() {
    const [personagens, setPersonagens] = useState([]);

    useEffect(() => {
        axios.get("https://rickandmortyapi.com/api/character")
            .then((json) => {
                const resultado = json.data;
                const data = resultado.results.map(personagem => ({
                    id: personagem.id,
                    nome: personagem.name,
                    imagem: personagem.image
                }));
                setPersonagens(data);
            })
    }, [])

    return (
        <>
            {
                personagens.map((personagem) =>
                    <div key={personagem.id}>
                        <img src={personagem.imagem}/>
                        <h2>{personagem.nome}</h2>
                    </div>)
            }
        </>
    )

}//FIM FUNCTION

