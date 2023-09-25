import './App.css';
import React from 'react';
import Menu from './components/Menu';
import Card from './components/Card'
import Footer from './components/Footer';

function App() {
  return (
    <div className="container">

      <Menu />
      <div className='row mt-4'>
        <Card title="Card 1" description="Descrição do Card 1" />
        <Card title="Card 2" description="Descrição do Card 2" />
        <Card title="Card 3" description="Descrição do Card 3" />
      </div>
      <Footer />
    
    </div>
  );
}

export default App;
