import { useState } from "react";

export function ListaFrutas(){

    const [frutas,setFrutas] = useState(["Maçã","Pera","Banana"]);

    function adicionar(){
        setFrutas([...frutas,"Cereja"]);
    }

    function remover(index){
        const frutasCopy = frutas.filter(
            (_fruta,indexFruta) => indexFruta != index
        );
        setFrutas(frutasCopy);
    }

    return(
        <>
        <h2 className=" bg-purple-100 text-violet-700 text-5xl pb-5
        rounded-t-3xl w-fit p-5 justify-self-center">Lista Frutas</h2>

        <ul className="mb-3 text-pink-500">
            {frutas.map(
                (fruta,index) => <li key={index}> { fruta }
                <button className="bg-pink-400 p-2 rounded-sm font-semibold text-white cursor-pointer ml-1.5"
                onClick={()=>remover(index)}>Remover</button>
                </li>
            )}
        </ul>
        <button className="bg-pink-500 p-2 rounded-sm font-semibold text-white cursor-pointer"
        onClick={adicionar}>Adicionar</button>
        
        </>
    )
}