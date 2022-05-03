# ApiStop

**API Desenvolvida em:**  Java 

**Frameworks:**           Spring Boot e Jpa.

A mesma trabalha com as categorias listadas abaixo:


# Categorias
"letra"
"nome" ,
"sobrenome" ,
"animal,
"artista" ,
"bebidas" ,
"banda" ,
"cor" ,

"cidade",
"comida",
"carro" ,
"doce" ,
"eletronico" ,
"esporte" ,
"flor" ,
"filme" ,

"frutaLegumeVerdura" ,
"idioma" ,
"jogo" ,
"marca" ,
"mse (minha sogra é)" ,

"musica" ,
"objeto"  ,
"profissao" ,
"pais",
"pch (parte do corpo humano)" ,

"site",
"time" ,
"verbo" ,
"vestuario" 

# Como usar

1. Inserir Dados

    - Para inserir dados na API basta chamar a rota usando método POST: 
      ```
      http://localhost:8080/api/stop/create
      ```
    - Ao chamar a rota enviar os dados no seguinte formato JSON:
     ```
          {
          "letra":" ",
          "nome" : "",
          "sobrenome" : " ",
          "animal" : " ",
          "artista" : "  ",
          "bebidas" : " ",
          "banda" : " ",
          "cor" : " ",
          "cidade" : " ",
          "comida" : " ",
          "carro" : " ",
          "doce" : " ",
          "eletronico" : " ",
          "esporte" : " ",
          "flor" : " ",
          "filme" : " " ,
          "frutaLegumeVerdura" : " ",
          "idioma" : " ",
          "jogo" : " ",
          "marca" : " ",
          "mse" : " ",
          "musica" : " ",
          "objeto" : " " ,
          "profissao" : " ",
          "pais" : " ",
          "pch" : " ",
          "site" : " ",
          "time" : " ",
          "verbo" : " "
          "vestuario" : " "
        }
    ```
    
2. Visualizar Dados

   - Para visualizar o as informações separadas por letra inicial basta usar a rota:
      ```
      http://localhost:8080/api/stop/letra/<LETRA>
      ```
      Obs.: No <LETRA> do link acima você deverá substituir pela letra do alfabeto que espera obter a resposta, exemplo:
      ```
      http://localhost:8080/api/stop/letra/a
      ```
