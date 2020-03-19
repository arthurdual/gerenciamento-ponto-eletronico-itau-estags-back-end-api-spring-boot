# ApiRest ponto eletronico
## Api Gestão
--------------------------------------------------------------------------------------------------------------
## Listagem de todos usuarios  
#### GET /gestao/usuario  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/gestao/usuario  

## Consulta por id  
#### GET /gestao/usuario/:id_usuario  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/gestao/usuario/2  
**:id_usuario**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;integer  

## Consulta por nome  
#### GET /gestao/usuario/nome/:nome_usuario  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/gestao/usuario/nome/arthur  
**:nome_usuario**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  

## Criação de usuario  
#### POST gestao/usuario  

**Exemplo POST:**  
   **URL:**  
&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/gestao/usuario  
   **Headers:**  
&nbsp;&nbsp;&nbsp;&nbsp;Content-Type = application/json  
   **Body:**  
```json
{
   "nome": "arthur",
   "cpf": "22910975859",
   "email":"art@gamil.com",
}
```
**nome**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**cpf**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**email**&nbsp;&nbsp;&nbsp;&nbsp;String  

## Edição usuario  
#### PUT /gestao/usuario  

**Exemplo PUT:**  
   **URL**  
&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/gestao/usuario  
   **Headers**  
&nbsp;&nbsp;&nbsp;&nbsp;Content-Type = application/json  
   **Body**  
```json
{
   "id": 3,
   "nome": "arthur",
   "cpf": "2202001115",
   "email":"art@gmil.com",
}
```
**id**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;integer  
**nome**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**cpf**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**email**&nbsp;&nbsp;&nbsp;&nbsp;String  

## Api Ponto
-----------------------------------------------------------

## Listagem pontos batidos  
#### GET /ponto  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/ponto  

## Consulta por id  
#### GET /ponto/:id_ponto  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/ponto/2  
**:id_ponto**&nbsp;&nbsp;&nbsp;&nbsp;integer  

## Consulta por nome  
#### GET /ponto/:id_nome  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/ponto/usuario/arthur  
**:id_nome**&nbsp;&nbsp;&nbsp;&nbsp;String  

## Batendo ponto  
#### POST /ponto  
**Exemplo POST:**  
   **URL**  
&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/api/ponto  
   **headers**  
&nbsp;&nbsp;&nbsp;&nbsp;Content-Type = application/json  
   **Body**  
```json
{
   "nome": "arthur",
   "tipo": "saida"
}
```
**nome**&nbsp;&nbsp;&nbsp;&nbsp;String  
**tipo**&nbsp;&nbsp;&nbsp;&nbsp;String  