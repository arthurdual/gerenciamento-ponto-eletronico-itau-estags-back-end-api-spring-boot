# ApiRest ponto eletronico  
**Foi feito o deploy desta API na HEROKU e pode ser acessada facilmente pelo seu Swagger na sequinte URL:** https://apirest-pontoeletronico.herokuapp.com/swagger-ui.html  
O **Swagger** da api localhost também pode ser acessada na seguinte URL:&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/swagger-ui.html  
> **Swagger** É um aplicativo que converte as anotações do próprio Swagger contidas no código fonte das APIs REST em uma documentação interativa.  
## Api Gestão  
## Listagem de todos usuarios  
#### GET /gestao/usuario  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/gestao/usuario   
##### Response Body  
```json
[
   {
        "id": 7,
        "nome": "Zé",
        "cpf": "2202001115",
        "email": "art@gmil.com",
        "data_cadastro": "2020-03-24T12:12:35",
        "data_cadastroUpdate": "2020-03-24T12:13:13"
    },
    {
        "id": 8,
        "nome": "arthur",
        "cpf": "22910975859",
        "email": "art@gamil.com",
        "data_cadastro": "2020-03-24T12:12:38",
        "data_cadastroUpdate": "2020-03-24T12:12:38"
    }
]
```
## Consulta por id  
#### GET /gestao/usuario/:id_usuario  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/gestao/usuario/10  
**:id_usuario**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;integer  
##### Response Body  
```json
{
    "id": 10,
    "nome": "arthur",
    "cpf": "22910975859",
    "email": "art@gamil.com",
    "data_cadastro": "2020-03-24T12:17:18",
    "data_cadastroUpdate": "2020-03-24T12:17:18"
}
```
## Consulta por nome  
#### GET /gestao/usuario/nome/:nome_usuario  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/gestao/usuario/nome/arthur   
**:nome_usuario**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
##### Response Body  
```json
{
   "id": 8,
   "nome": "arthur",
   "cpf": "22910975859",
   "email": "art@gamil.com",
   "data_cadastro": "2020-03-24T12:12:38",
   "data_cadastroUpdate": "2020-03-24T12:12:38"
}
```
## Criação de usuario  
#### POST gestao/usuario  

**Exemplo POST:**  
   **URL:**  
&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/gestao/usuario  
   **Headers:**  
&nbsp;&nbsp;&nbsp;&nbsp;Content-Type = application/json  
   **Body:**  
```json
{
   "nome": "arthur",
   "cpf": "22910975859",
   "email":"art@gamil.com"
}
```
**nome**&nbsp;&nbsp;&nbsp;&nbsp;String  
**cpf**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**email**&nbsp;&nbsp;&nbsp;&nbsp;String  

##### Response Body  
```json
{
    "id": 10,
    "nome": "arthur",
    "cpf": "22910975859",
    "email": "art@gamil.com",
    "data_cadastro": "2020-03-24T12:17:18.021",
    "data_cadastroUpdate": "2020-03-24T12:17:18.021"
}
```

## Edição usuario  
#### PUT /gestao/usuario  

**Exemplo PUT:**  
   **URL**  
&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/gestao/usuario  
   **Headers**  
&nbsp;&nbsp;&nbsp;&nbsp;Content-Type = application/json  
   **Body**  
```json
{
    "id": 7,
    "nome": "Zé",
    "cpf": "2202001115",
    "email":"art@gmil.com"
}
```
**id**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;integer  
**nome**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**cpf**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
**email**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  

##### Response Body  
```json
{
    "id": 7,
    "nome": "Zé",
    "cpf": "2202001115",
    "email": "art@gmil.com",
    "data_cadastro": null,
    "data_cadastroUpdate": "2020-03-24T12:13:13.988"
}
```
> **OBS:** apesar da data de cadastro retornar null, ela não foi alterada.  
## Api Ponto  
## Listagem pontos batidos  
#### GET /ponto  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/ponto  
##### Response Body  
```json
{
    "id": 5,
    "nome": "arthur",
    "data": "2020-03-24T12:05:48.785",
    "tipo": "saida"
}
```
## Consulta por id  
#### GET /ponto/:id_ponto  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/ponto/2  
**:id_ponto**&nbsp;&nbsp;&nbsp;&nbsp;integer  
##### Response Body  
```json
{
    "id": 2,
    "nome": "arthur",
    "data": "2020-03-24T12:05:18",
    "tipo": "entrada"
}
```
## Consulta por nome  
#### GET /ponto/:id_nome  
**Exemplo GET**&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/ponto/usuario/arthur  
**:id_nome**&nbsp;&nbsp;&nbsp;&nbsp;String  
##### Response Body    
```json
[
    {
        "id": 2,
        "nome": "arthur",
        "data": "2020-03-24T12:05:18",
        "tipo": "entrada"
    },
    {
        "id": 3,
        "nome": "arthur",
        "data": "2020-03-24T12:05:28",
        "tipo": "saida"
    }
]
```

## Batendo ponto  
#### POST /ponto  
**Exemplo POST:**  
   **URL**  
&nbsp;&nbsp;&nbsp;&nbsp;https://apirest-pontoeletronico.herokuapp.com/api/ponto  
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
**tipo**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String  
##### Response Body  
```json
{
    "id": 5,
    "nome": "arthur",
    "data": "2020-03-24T12:05:48.785",
    "tipo": "saida"
}
```