import React from 'react';
import { Container } from './style';
import { Link } from 'react-router-dom';

const Dashboard: React.FC = () => {
return  (
  <Container>
     <Link to="/pedidoservico" >
      <button>Pedido Serviço</button>
     </Link>
    
     <Link to="/servico">
      <button>Serviço</button>
     </Link>
     <Link to="/profissional">
      <button>Profissional</button>
     </Link>
  </Container>
)
}

export default Dashboard;