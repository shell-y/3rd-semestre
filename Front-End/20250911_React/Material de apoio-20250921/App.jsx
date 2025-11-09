import './App.css'
import { Botao } from './components/Botao';
import { Imagem } from './components/Imagem';
import { ListaTarefas } from './components/ListaTarefas';
import { Saudacao } from './components/Saudacao';

function App() {

  const nome = "Pedro";
  const idade = 40;
  const isLogado = true; 
  const tarefas = [ 
    {
    "id": 1,
    "nome": "Estudar React",
    "concluida": true
    },
    {
      "id": 2,
      "nome": "Fazer exercícios",
      "concluida": false
    },
    {
      "id": 3,
      "nome": "Ler um livro",
      "concluida": true
    },
    {
      "id": 4,
      "nome": "Praticar esportes",
      "concluida": false
    }
]


  // < 10 anos - Olá pequeno gafanhoto
  // < 20 anos - Olá Guerreiro
  // < 30 anos - Olá pai de familia
  // > 30 - Olá ancião
  

  return (
    <div>
    <Saudacao isLogado={isLogado} idade={idade} nome={nome} />
    <Imagem isLogado={isLogado}/>
     <br/>
     <br/>
     <Botao>
        {isLogado ? "Sair": "Entrar"} Teste
        <ul>
          <li>Teste</li>
        </ul>
     </Botao>
     <ListaTarefas tarefas={tarefas}/>
    </div>
  )
}

export default App
