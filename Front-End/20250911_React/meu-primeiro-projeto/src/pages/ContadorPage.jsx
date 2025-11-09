import React from 'react'
import { Contador } from '../components/Contador'
import { Link, useNavigate, useSearchParams } from 'react-router-dom'

export function ContadorPage() {
    const navigate = useNavigate();
    
    //[valor inicial, mudar estado] ~> _variavel para indicar que não vamos usar essa variável
    const [searchParams,setSearchParams] = useSearchParams();

    function redirecionar(){
        navigate("/lista-telefonica/1")
    }

    function enviarFiltro(){
        setSearchParams({
            nome:"Shelly",
            size:"12",
            page:"0"
        })
    }

    function enviarNome(){
        navigate("/card-naruto",{
            state:{
                nomer:"Shelly"
            }
        })
    }

    function voltarPaginaAnterior(){
        navigate(-1)
    }

  return (
    <>
    <Contador/>
    <br />
    <button className='cursor-pointer bg-sky-100 text-pink-300 px-2 rounded-3xl mb-1'
    onClick={enviarFiltro}>Aplicar Filtro</button>
    {/* <button className='cursor-pointer bg-fuchsia-100 text-violet-300 px-2 rounded-3xl' onClick={redirecionar}>Redirecionar programaticamente para a Lista Telefônica</button> */}
    <br /><br />
    <div className='text-fuchsia-300'>
        <p className='font-medium text-violet-300'>Filtros aplicados:</p>
        <p>Nome: {searchParams.get("nome")}</p>
        <p>Page: {searchParams.get("page")}</p>
        <p>Size: {searchParams.get("size")}</p>
    </div>
        <div className='flex flex-col gap-1.5 items-center mt-5'>
    {/* <button onClick={enviarNome} className='cursor-pointer bg-lime-100 text-pink-400 px-2 rounded-3xl'>Enviar Nome para o Card Naruto</button> */}
        <button className='cursor-pointer bg-fuchsia-100 text-violet-300 px-2 rounded-3xl' onClick={voltarPaginaAnterior}>Voltar</button>
        <Link className='cursor-pointer bg-violet-300 text-white px-2 mx-1.5 rounded-3xl' to={"/pilha"}>Pilha Stack</Link>
        <Link className='cursor-pointer bg-violet-300 text-white px-2 mx-1.5 rounded-3xl' to={"/card-naruto"}>Card Naruto</Link>
        <Link className='cursor-pointer bg-violet-300 text-white px-2 mx-1.5 rounded-3xl' to={"/lista-telefonica/1"}>Lista Telefônica</Link>
        </div>
    
    </>
  )
}
