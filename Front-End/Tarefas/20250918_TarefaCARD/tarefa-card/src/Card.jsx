import './Card.css'


export function Card(props) {
    return (
         
             <div className={`
                card
                ${props.tipo === "dark" ? "card-dark" : "card-minimalist"}
                ${props.desabilitado ? "card-disabled" : ""}
                `}>
                    <img src={props.imagem} alt={props.titulo} className="card-image" />
                    {props.tipo !== "minimalist" && (
                        <>
                            <h2 className="card-title">{props.titulo}</h2>
                            <p className="card-description">{props.descricao}</p>
                        </>
                    )}
                    <button className="card-button" disabled={props.desabilitado}>
                        Botão
                    </button>
                </div>
         
    );
}