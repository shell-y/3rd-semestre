import React, { useEffect, useState } from "react";
import { Preview } from "./Preview";

export function CartaoApresentacao() {


  const [carta,setCarta] = useState({
    nome:"Shelly",
    cargo:"Chefe",
    contato:"+55 11 90123-4567",
    resumo:"Chefe com muito conhecimento e experiência",
    experiencia:"Muitas"
  });

  //function atualizarNome(evento){
    /*const cartaCopy = {...carta};
    cartaCopy.nome = evento.target.value;
    setCarta(cartaCopy);*/
    //setCarta({...carta,nome:evento.target.value}) }

  function atualizarCampos(evento,key){
    setCarta({...carta,[key]:evento.target.value})
  }

  useEffect(()=>{
    console.log("Mudou o estado")
  },[carta.experiencia])
  //Se alguma coisa acontecer em "experiencia", execute essa função que no caso chama o console

  return (
    <div className='flex mt-10'>
          <div className='w-80 mx-auto flex flex-col gap-2'>
            <div className='flex flex-col  text-left'>
              <label >Nome</label>
              <input type="text" onChange={(evento)=>atualizarCampos(evento,"nome")} className='border rounded-md border-blue-500 p-1'/>
            </div>
            
            <div className='flex flex-col  text-left'>
              <label >Cargo</label>
              <input type="text" onChange={(evento)=>atualizarCampos(evento,"cargo")} className='border rounded-md border-blue-500 p-1'/>
            </div>

            <div className='flex flex-col  text-left'>
              <label >Contato</label>
              <input type="text" onChange={(evento)=>atualizarCampos(evento,"contato")} className='border rounded-md border-blue-500 p-1'/>
            </div>

            <div className='flex flex-col  text-left'>
              <label >Resumo</label>
              <textarea type="text" onChange={(evento)=>atualizarCampos(evento,"resumo")} className='border rounded-md border-blue-500 p-1'/>
            </div>

            <div className='flex flex-col  text-left'>
              <label >Experiência</label>
              <textarea type="text" onChange={(evento)=>atualizarCampos(evento,"experiencia")} className='border rounded-md border-blue-500 p-1'/>
            </div>
          </div>
      
        <Preview {...carta}/>
      </div>
  );
}