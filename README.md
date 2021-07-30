# imoveis

## EndPoints

### Lista com todos os usuarios
localhost:8080/pessoas

### Busca de um usuário
localhost:8080/pessoas/{id}

### Inserir um novo usuario
localhost:8080/pessoas

{
    "nome": "Seunome",
    "dataNascimento": "12-12-2014"
}

### Editar um usuario
localhost:8080/pessoas/{id}

{
    "nome": "Novonome",
    "dataNascimento": "12-12-2003"
}

### Lista de endereços
localhost:8080/enderecos

### Inserir um endereço
localhost:8080/enderecos

{
        "logradouro": "Rua pracima",
        "cep": "00000000",
        "numero": 1234,
        "cidade": "Santos",
        "pessoa": {
            "id": 1
        }
}
