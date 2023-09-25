import React, { useState } from "react";
import "./App.css";

function App() {
  const [numero1, setNumero1] = useState(0);
  const [numero2, setNumero2] = useState(0);
  const [operacao, setOperacao] = useState("soma");
  const [resultado, setResultado] = useState(0);

  const calcular = () => {
    if (operacao === "soma") {
      setResultado(numero1 + numero2);
    } else if (operacao === "subtracao") {
      setResultado(numero1 - numero2);
    } else if (operacao === "multiplicacao") {
      setResultado(numero1 * numero2);
    } else if (operacao === "divisao" && numero2 !== 0) {
      setResultado(numero1 / numero2);
    } else {
      setResultado("Erro: divisão por zero");
    }
  };

  return (
    <div className="App">
      <div className="card">
        <h2>Calculadora</h2>
        <input
          type="number"
          placeholder="Número 1"
          value={numero1}
          onChange={(e) => setNumero1(Number(e.target.value))}
        /> 
        <input
          type="number"
          placeholder="Número 2"
          value={numero2}
          onChange={(e) => setNumero2(Number(e.target.value))}
        />
        <select onChange={(e) => setOperacao(e.target.value)}>
          <option value="soma">Soma (+)</option>
          <option value="subtracao">Subtração (-)</option>
          <option value="multiplicacao">Multiplicação (*)</option>
          <option value="divisao">Divisão (/)</option>
        </select>
        <button onClick={calcular}>Calcular</button>
        <p>Resultado: {resultado}</p>
      </div>
    </div>
  );
}

export default App;
