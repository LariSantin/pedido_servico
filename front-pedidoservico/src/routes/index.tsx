import React from 'react';
import {Switch, Route } from 'react-router-dom';

import Dashboard from '../pages/dashboard';
import PedidoServico from '../pages/pedidoServico';
import Servico from '../pages/servico';
import Profissional from '../pages/profissional';

const Routes: React.FC = () => ( 
  <Switch>
    <Route path="/" exact component={Dashboard} />
    <Route path="/pedidoservico" component={PedidoServico} />
    <Route path="/servico"  component={Servico} />
    <Route path="/profissional"  component={Profissional} />
  </Switch>
);

export default Routes;