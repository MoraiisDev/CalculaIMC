# CalculaIMC

Projeto desenvolvido em Java com Spring Boot que realiza o cálculo do IMC (Índice de Massa Corporal) com base no peso e altura informados pelo usuário. Após o cálculo, o sistema classifica o IMC e exibe o resultado em uma página HTML com uma mensagem positiva e educativa, além de permitir novo cálculo e acesso a informações sobre cada classificação.

## 🚀 Funcionalidades

- Entrada de **peso (kg)** e **altura (cm)** via formulário;
- Cálculo do IMC e classificação;
- Exibição dos dados na tela de resultado:
  - Nome
  - Peso
  - Altura
  - Classificação
  - Mensagem positiva
  - Link de apoio com mais informações sobre a classificação
  - Botão para realizar um novo cálculo.

## 📊 Classificações de IMC

| Classificação          | IMC (kg/m²)      |
|------------------------|------------------|
| Abaixo do peso         | Menor que 18.5   |
| Peso normal            | 18.5 a 24.9      |
| Sobrepeso              | 25 a 29.9        |
| Obesidade              | Maior que 30     |

Cada classificação possui um link de apoio com informações adicionais.

## 🛠 Tecnologias utilizadas

- Java 17
- Spring Boot
- Thymeleaf (template engine)
- HTML5, CSS e JavaScript (formatação dinâmica dos campos)
- Maven

## ▶️ Como executar

1. Clone o repositório:
   ```git clone (https://github.com/MoraiisDev/CalculaIMC.git)```
   
3. Acesse o diretório:
   ```cd CalculaIMC```

4. Execute o projeto:
   ```./mvnw spring-boot:run``` ou rode ```CalculaImcApplication.java via IDE```

5. Acesse no navegador:
   ```http://localhost:5000```
