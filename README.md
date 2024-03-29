# API Rest da Aplicação Voll.med

Esta é uma API RESTful para a aplicação Voll.med, destinada ao cadastro e gerenciamento de médicos.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.3
- Spring Web
- Spring Data JPA
- Validação de dados
- Flyway para migração de banco de dados
- MySQL Connector
- Lombok (opcional)
- Spring Boot Test para testes
- Autenticação JWT com Java JWT 4.2.1
- Segurança com Spring Boot Starter Security

## Configuração do Ambiente de Desenvolvimento

1. **Clonar o Repositório:** Use o seguinte comando para clonar o repositório:

    ```
    git clone https://seu-repositorio.git
    ```

2. **Configuração do Banco de Dados:** Configure as propriedades do banco de dados no arquivo `application.properties` ou `application.yml`.

3. **Executar o Projeto:** Use sua IDE preferida para importar o projeto e execute-o. Você também pode usar o Maven:

    ```
    mvn spring-boot:run
    ```
## Mecanismo de Autenticação

Todas as requisições, exceto o login, estão bloqueadas no sistema. Para liberar as requisições, é necessário fazer login com as seguintes credenciais:

```json
{
    "login": "ana.souza@voll.med",
    "senha": "123456"
}
```
Após o login bem-sucedido, você receberá um token JWT. Nas próximas requisições, é necessário enviar o token JWT junto com a requisição para obter acesso às funcionalidades do sistema.


## Endpoints

### Cadastrar Médico

- **URL:** `/medicos`
- **Método:** `POST`
- **Corpo da Requisição:**

    ```json
    {
        "nome": "Artur Alexandre",
        "email": "artur.alexandre@voll.med",
        "crm": "188456",
        "telefone": "83991524004",
        "especialidade": "CARDIOLOGIA",
        "endereco": {
            "logradouro": "rua 1",
            "bairro": "bairro",
            "cep": "12345678",
            "cidade": "Brasilia",
            "uf": "DF",
            "numero": "1",
            "complemento": "complemento"
        }
    }
    ```

- **Resposta de Sucesso:** `200 OK`
- **Resposta de Erro:** `400 Bad Request` se os dados fornecidos forem inválidos.

### Listar Médicos

- **URL:** `/medicos`
- **Método:** `GET`
- **Resposta de Sucesso:** `200 OK` com a lista de médicos no formato JSON.
  ```json
  [
		{
			"id": 3,
			"nome": "Artur Alexandre",
			"email": "artur.alexandre@voll.med",
			"crm": "188456",
			"especialidade": "CARDIOLOGIA"
		},
		{
			"id": 1,
			"nome": "Rodrigo Ferreira",
			"email": "rodrigo.ferreira@voll.med",
			"crm": "123456",
			"especialidade": "ORTOPEDIA"
		}
	]
    ```
 ### Atualização de Informações do Médico



- **URL**: `/medicos`
- **Método**: PUT
- **Corpo da Requisição**: JSON contendo os dados de atualização do médico, incluindo o ID.
- **Resposta de Sucesso**: 200 OK se a atualização for bem-sucedida.

### Requisição

```http
PUT /medicos HTTP/1.1
Content-Type: application/json

{
  "id": 123,
  "nome": "Novo Nome do Médico",
  "telefone": "11987654321",
  "endereco": {
    "logradouro": "Nova Rua",
    "bairro": "Novo Bairro",
    "cep": "12345678",
    "cidade": "Nova Cidade",
    "uf": "NC",
    "numero": "10",
    "complemento": "Novo Complemento"
  }
}

```
## Desativação de Médico

Marca um médico como inativo no sistema.

- **URL**: `/medicos/{id}`
- **Método**: DELETE
- **Parâmetros de Path**: 
  - `id`: O ID do médico que será marcado como inativo.
- **Resposta de Sucesso**: 204 No Content se a operação for bem-sucedida.

### Requisição

```http
DELETE /medicos/{id} HTTP/1.1
```
## Contribuindo

Sinta-se à vontade para enviar pull requests e reportar problemas. Toda contribuição é bem-vinda!

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
