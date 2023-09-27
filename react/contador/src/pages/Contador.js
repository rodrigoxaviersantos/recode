import React, { useState } from 'react';
import '../App.css';

function Contador() {
  const [contador, setContador] = useState(0);

  const aumentarContador = () => {
    setContador(contador + 1);
  };

  const diminuirContador = () => {
    setContador(contador - 1);
  };

  return (
    <div>
      <h1>Contador</h1>
      <p>Valor do Contador: {contador}</p>
      <button onClick={aumentarContador}>Aumentar</button>
      <button onClick={diminuirContador}>Diminuir</button>
    </div>
  );
}

export default Contador;
