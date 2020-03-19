# Atividade-Diagnostica
O objetivo dessa atividade é ser uma ferramenta diagnóstica para o futuro aluno determinar se o seu nível de conhecimento é adequado para o ingresso direto na 2ª etapa do curso (Especialização). Ela também tem o objetivo de servir como um exercício de revisão dos conceitos que são abordados na 1ª etapa (Pré-Requisitos).
Api Gestao
--------------------------------------------------------------------------------------------------------------
//Listagem
//http://localhost:8080/api/gestao/usuario


//Consulta por id
//http://localhost:8080/api/gestao/usuario/2


//Consulta por nome
//http://localhost:8080/api/gestao/usuario/nome/arthur

//criaçao
  /*
        URL http://localhost:8080/api/gestao/usuario
        headers
        Content-Type = application/json
        body
        {
            "nome": "arthur",
            "cpf": "2202001115",
            "email":"art@gmil.com",
            "data_cadastro": "20/03/2020"
        }
   */
   
put
// edicao usuario
/*
   URL
      http://localhost:8080/api/gestao/usuario
   headers
      Content-Type = application/json
   body
      {
          "id": 3,
          "nome": "arthur",
          "cpf": "2202001115",
          "email":"art@gmil.com",
          "data_cadastro": "20/03/2020"
      }
*/

Api Ponto
-----------------------------------------------------------
gets
//Listagem
//http://localhost:8080/api/ponto

//Consulta por id
//http://localhost:8080/api/ponto/2

//Consulta por nome
// http://localhost:8080/api/ponto/usuario/arthur
    
post
//criaçao
/*
   URL 
      http://localhost:8080/api/ponto
   headers
      Content-Type = application/json
   body
   {
       "nome": "arthur",
       "data": "20/03/2020",
       "tipo": "saida"
   }
*/
