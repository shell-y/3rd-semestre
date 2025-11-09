import React from 'react'
import { CardNaruto } from '../components/CardNaruto'
import { Link, useLocation, useNavigate } from 'react-router-dom'

export function CardNarutoPage() {

  const navigate = useNavigate();
  const location = useLocation();


  function voltarPaginaAnterior(){
        navigate(-1)
    }

  return (
    <>
    <CardNaruto/>
    <div className='flex flex-col gap-1.5 items-center mt-5'>
    <button className='cursor-pointer bg-fuchsia-100 text-violet-300 px-2 rounded-3xl' onClick={voltarPaginaAnterior}>Voltar</button>
    <Link className='cursor-pointer bg-violet-300 text-white px-2 mx-1.5 rounded-3xl' to={"/lista-telefonica/1"}>Lista Telefônica</Link>
    <Link className='cursor-pointer bg-violet-300 text-white px-2 mx-1.5 rounded-3xl' to={"/contador"}>Contador</Link>
    <Link className='cursor-pointer bg-violet-300 text-white px-2 mx-1.5 rounded-3xl' to={"/pilha"}>Pilha Stack</Link>
    </div>
    </>
  )
}
