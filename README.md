# Api rest ponto eletronico
--------------------------------------------------------------------------------------------------------------

O objetivo dessa atividade é ser uma ferramenta diagnóstica para o futuro aluno determinar se o seu nível de conhecimento é adequado para o ingresso direto na 2ª etapa do curso (Especialização). Ela também tem o objetivo de servir como um exercício de revisão dos conceitos que são abordados na 1ª etapa (Pré-Requisitos).


## Api Gestão
--------------------------------------------------------------------------------------------------------------
### Listagem de todos usuarios
'''json
GET /gestao/usuario
Exemplo GET http://localhost:8080/api/gestao/usuario
'''

### Consulta por id
'''
GET /gestao/usuario/:id_usuario
Exemplo GET http://localhost:8080/api/gestao/usuario/2
'''
> **:id_usuario:**	integer

### Consulta por nome
'''
GET /gestao/usuario/nome/:nome_usuario
Exemplo GET http://localhost:8080/api/gestao/usuario/nome/arthur
'''
> **:nome_usuario:**   String

### Criação de usuario
'''
POST gestao/usuario
Exemplo POST:
   URL:
      http://localhost:8080/api/gestao/usuario
   Headers:
      Content-Type = application/json
   Body:
   {
      "nome": "arthur",
      "cpf": "22910975859",
      "email":"art@gamil.com",
   }
'''
> **nome:**     String

> **cpf:**      String

> **email:**    String

### Edição usuario
#### PUT /gestao/usuario

**Exemplo PUT:**
   URL  
      http://localhost:8080/api/gestao/usuario  
   Headers  
      Content-Type = application/json  
   Body  

```json
{
   "id": 3,
   "nome": "arthur",
   "cpf": "2202001115",
   "email":"art@gmil.com",
}
```
<p> <em>id:</em>       integer</p>
<p> <em>nome:</em>     String</p>
<p> <em>cpf:</em>      String</p>
<p> <em>email:</em>    String</p>

## Api Ponto
-----------------------------------------------------------

### Listagem pontos batidos
#### GET /ponto
<p>
<em>Exemplo GET</em> http://localhost:8080/api/ponto
</p>

### Consulta por id
<p>
GET /ponto/:id_ponto
**Exemplo GET** http://localhost:8080/api/ponto/2
</p>
> **:id_ponto:**	integer

### Consulta por nome
```
GET /ponto/:id_nome
Exemplo GET http://localhost:8080/api/ponto/usuario/arthur
```
> **:id_nome:**	String

### Batendo ponto
'''json
POST /ponto
Exemplo POST:
   URL 
      http://localhost:8080/api/ponto
   headers
      Content-Type = application/json
   body
   {
       "nome": "arthur",
       "tipo": "saida"
   }
'''
> **nome:**    String

> **tipo:**    String