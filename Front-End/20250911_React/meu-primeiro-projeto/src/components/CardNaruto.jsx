export function CardNaruto(){
    return (
    <main className="justify-self-center w-sm text-left border-0 flex-col gap-2 p-4 shadow-lg rounded-lg">
      <header>
        <span className="text-sm font-medium text-gray-500"
        >15 de Abril, 2025 - 18:35</span>
      </header>
      <section>
        <h2 className="font-semibold text-xl my-1">Tailwind é sensacional!</h2>
        <p className="text-gray-500">
          Tailwind simplesmente mudou a maneira como eu construo interfaces! A
          versatilidade e a liberdade para estilizar meus componentes são os
          grandes diferenciais dessa ferramenta.
        </p>
      </section>
      <footer
      className="flex items-center mt-2"
      >
        <img
          src="https://tiermaker.com/images/chart/chart/naruto-classico--sem-figurantes--filosofisica--395963/capajpg.png"
          alt="Imagem de perfil João Pedro"
          className="w-10 h-10 rounded-full mr-2"
        />
        <div>
          <h3 className="font-semibold">João Pedro</h3>
          <p>Engenheiro de Software</p>
        </div>
      </footer>
    </main>
  );
}