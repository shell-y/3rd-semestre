// NÃO UTILIZAR "document.querySelector" NEM "document.querySelector"

import axios from "axios";
import { useEffect, useState } from "react";

export function GerenciamentoUsuarios() {

  const [usuarios,setUsuarios] = useState([]);
  
  function buscarUsuarios() {
    axios.get("http://localhost:3000/usuarios")
    .then(resposta => {
      setUsuarios(resposta.data)
    })
    .catch((error) => console.log('erro ao buscar usuários',error));
  }

  function criarUsuario() {
    axios.post("http://localhost:3000/usuarios",{
      nome:"Shellyyy",
      email:"shelly@email.com"
    })
    .then((res)=>{
      buscarUsuarios()
    })
  }

  function atualizarUsuario() {
    axios.patch("http://localhost:3000/usuarios/3",{
      nome:"Regine"
    })
    .then(()=>{
      buscarUsuarios()
    })
  }

  function removerUsuario() {
    axios.delete("http://localhost:3000/usuarios/6")
    .then(()=>(
      buscarUsuarios()
    ))
  }

  useEffect(()=>{
    buscarUsuarios()
  },[])

  return (
    <main className="min-h-screen bg-gray-200 flex flex-col items-center py-10 px-4">

      <header className="text-2xl font-bold text-blue-700 mb-8">
        Formulário de Usuários
      </header>

      <section className="bg-white shadow-lg border border-gray-200 rounded-2xl p-6 w-full max-w-md flex flex-col gap-4">
        <div>
          <label className="flex flex-col">
            <span className="text-sm font-semibold text-gray-700 mb-1">
              Nome:
            </span>
            <input
              onChange={() => { /* alterar valor */ }}
              type="text"
              placeholder="Digite o nome"
              className="border border-gray-300 rounded-lg px-3 py-2 text-gray-800 focus:outline-none focus:ring-2 focus:ring-blue-400 focus:border-transparent"
            />
          </label>
        </div>

        <div>
          <label className="flex flex-col">
            <span className="text-sm font-semibold text-gray-700 mb-1">
              Email:
            </span>
            <input
              onChange={() => { /* alterar valor */ }}
              type="text"
              placeholder="Digite o email"
              className="border border-gray-300 rounded-lg px-3 py-2 text-gray-800 focus:outline-none focus:ring-2 focus:ring-blue-400 focus:border-transparent"
            />
          </label>
        </div>

        <button className="" onClick={criarUsuario}>
          Adicionar Usuário
        </button>
        <button className="" onClick={atualizarUsuario}>
          Atualizar Usuário
        </button>
        <button className="" onClick={removerUsuario}>
          Remover Usuário
        </button>
      </section>

      <section className="mt-10 w-full max-w-md">
        {usuarios.map((user)=><div>{user.nome}</div>)}
      </section>
    </main>
  );
}
