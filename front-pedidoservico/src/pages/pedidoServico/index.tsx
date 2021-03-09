import React, { useEffect, useState, useRef, useCallback } from 'react';
import { FormHandles } from '@unform/core';
import { Form } from '@unform/web';

import api from '../../services/api';

import { Container, Content, Background, Title } from './style';
import Input from '../../components/input';

const PedidoServico: React.FC = () => {
  const formRef = useRef<FormHandles>(null);

 

  useEffect(() => {
    async function loadData(): Promise<void> {      
    
    }
    loadData();
  }, );

   const salvar = useCallback(async () => {  
  //   data.dataNascimento = new Date(data.dataNascimento);

  //   const response = await api.post(`/pessoa`, data);
    
  //   if(response.data){
  //     alert("Pessoa inserida com sucesso!");
  //   }
   },[]);

  return (
    <>
    <Container>
      <Content>
      <Title>Cadastro de Pedido Serviço</Title>  
          <Form ref={formRef} onSubmit={salvar}>   
            <label>Nome</label>        
            <Input
                name="Quantidade Hora"
                type="number"
                placeholder="quantidade hora"
              />           
            <button type="submit">Salvar</button>
          </Form>
      </Content>
      <Background />
    </Container>
    </>
  )
};

export default PedidoServico;