import './App.css';
import React, {useState} from "react"

const App = () => {
  const [valor, setValor] = useState(0)
  const [valor2, setValor2] = useState(0)
  const [soma, setSoma] = useState(0)
  const [taxaCambio, setTaxaCambio] = useState(5.5); // Taxa de câmbio: 1 real para 5.5 dólares


function somar() {
  setSoma(Number(valor) + Number(valor2))
}

function mudarTexto(event){
  setValor(event.target.value)
}

  function mudarTexto2(event){
    setValor2(event.target.value)
  }

   // Função para converter real para dólar
   function converterParaDolar() {
    const resultadoEmDolar = (soma / taxaCambio).toFixed(2); // Limita a 2 casas decimais
    return resultadoEmDolar;
  }

  return (
    <>
    <div className="App">
    <h1>Conversor de Moeda</h1>


     <input type='text' value={valor} onChange={mudarTexto}/><br/>
     {/* <input type='text' value={valor2} onChange={mudarTexto2}/> */}
     <button onClick={somar}>Converter</button>
     <p>Resultado em Dólar: US$ {converterParaDolar()}</p>
    </div>
    </>
  );
}

export default App;
