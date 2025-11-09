import React from 'react'

export  function Preview(props) {
  return (
   <section className="max-w-2xl mx-auto p-6 bg-white rounded-xl shadow-md">
      <header className="border-b pb-4 mb-4">
        <h1 className="text-2xl font-bold">{props.nome}</h1>
        <p className="text-gray-600">{props.cargo}</p>
        <p className="text-sm text-gray-500">{props.contato}</p>
      </header>

      <section className="mb-4">
        <h2 className="font-semibold">Resumo</h2>
        <p className="text-sm text-gray-700 mt-1">
          {props.resumo}
        </p>
      </section>

      <section className="mb-4">
        <h2 className="font-semibold">Resumo de experiências</h2>
        <div className="mt-1">
        <p className="text-sm text-gray-700 mt-1">
          {props.experiencia}
        </p>
        </div>
      </section>
    </section>
  )
}
