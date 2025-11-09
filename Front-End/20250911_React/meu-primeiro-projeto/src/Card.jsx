export function Card(props){

    function getBackground(){
        if(props.desabilitado) return "gray";
        if(props.type ==="dark") return "#222";
        return white
    }

    const styleCard={
        background:props.type === "dark" && "#222",
        // o mesmo que ~> background:props.type === "dark" ? "#222" : "white"
        color:props.type === "dark" ? "white" : "#222"
    }

    const isMinimalista = props.type === "minimalista"

    const styleBotao = {
        background: props.desabilitado ? "gray" : "pink"
    }

    return <section style={styleCard}>
        <br />
        <br />
        <img src={props.imagem} />
        <br />
        { !isMinimalista && //é true? então exibe o que vem a seguir, se não, para aqui
        <>
        <h2>{props.titulo}</h2>
        <p>{props.descricao}</p>
        </>
        }
        <button style={styleBotao}>Clique aqui</button>
    </section>
}