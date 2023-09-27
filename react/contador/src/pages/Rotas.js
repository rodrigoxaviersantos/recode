import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Contador from '../pages/Contador';
import Sobre from '../pages/Sobre';

function Rotas() {
  return (
    <Router>
      <Switch>
        <Route path="/" exact component={Contador} />
        <Route path="/sobre" component={Sobre} />
      </Switch>
    </Router>
  );
}

export default Rotas;
