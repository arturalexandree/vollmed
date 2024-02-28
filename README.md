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
            "nome": "Artur Alexandre",
            "email": "artur.alexandre@voll.med",
            "crm": "188456",
            "especialidade": "CARDIOLOGIA"
        },
        {
            "nome": "Rodrigo Ferreira",
            "email": "rodrigo.ferreira@voll.med",
            "crm": "123456",
            "especialidade": "ORTOPEDIA"
        }
    ]
    ```

## Contribuindo

Sinta-se à vontade para enviar pull requests e reportar problemas. Toda contribuição é bem-vinda!

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
