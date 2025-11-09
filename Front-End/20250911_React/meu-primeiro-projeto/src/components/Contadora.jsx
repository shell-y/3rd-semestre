import { useState } from "react";

export function Contadora(){

    //const[valor inicial, função que vai atualizar o valor]
    const[contadora,setContadora] = useState(0)

    function incrementar(){
        setContadora(contadora+1)
    }

    return(
        <>
        <p
        className="bg-purple-100 text-violet-700 text-5xl mb-5
        rounded-full w-fit p-5 justify-self-center">
        {contadora}</p>

        <button className="bg-pink-500 p-2 rounded-sm font-semibold text-white cursor-pointer"
        onClick={incrementar}>
        INCREMENTAR
        </button>
        </>
    )
}