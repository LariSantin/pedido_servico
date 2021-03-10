import React, { useEffect, useState, useRef, useCallback } from 'react';
import { FormHandles } from '@unform/core';
import { Form } from '@unform/web';


import { Container, Content, Background, Title } from './style';
import Input from '../../components/input';
import { Link } from 'react-router-dom';

const Servico: React.FC = () => {
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
return  (
  <>
    <Container>
      <Content>
      <Title>Cadastro de Pedido Serviço</Title>  
          <Form ref={formRef} onSubmit={salvar}>   
          <label>Nome</label>        
            <Input
              name="Nome"
              type="text"
              placeholder="nome"
            />    

            <label>Valor da hora</label>        
            <Input
              name="Valor da Hora"
              type="number"
              placeholder="valor hora"
            />           
            <button type="submit">Salvar</button>
             <Link to="/">
              <button>Voltar</button>
            </Link>
          </Form>
      </Content>
      <Background />
    </Container>
    </>
)
}

export default Servico;