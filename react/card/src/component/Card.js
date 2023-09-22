import React from 'react';
// import './Card.css'; // Importe um arquivo de estilos para personalização (opcional)

function Card(props) {
  return (
    <div className="card">
      <h2 className="card-title">{props.title}</h2>
      <div className="card-image">
        <img src={"https://via.placeholder.com/300"} alt="Imagem do Card" />
      </div>
      <h3 className="card-subtitle">{props.subtitle}</h3>
      <p className="card-description">{props.description}</p>
    </div>
  );
}

export default Card;
