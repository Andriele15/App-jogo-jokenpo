# **Jokenpo**

> Este projeto é um aplicativo Android simples que implementa o clássico jogo de Pedra, Papel e Tesoura.

## 📱 Descrição

O usuário pode interagir com a interface gráfica para escolher uma das três opções, enquanto o aplicativo gera aleatoriamente uma escolha do computador.
O jogo é divertido e fácil de usar, proporcionando uma experiência leve e agradável.

## 🔧 Funcionalidades

- [x] Interface Intuitiva: A interface apresenta uma visualização clara com botões de seleção para Pedra, Papel e Tesoura, além de exibir o resultado da partida e o placar.
- [x] Aleatoriedade: O computador faz uma escolha aleatória, garantindo que cada jogo seja único.
- [x] Placar: O aplicativo mantém um registro de vitórias, derrotas e empates, permitindo que o usuário acompanhe seu desempenho.
- [x] Reiniciar Jogo: Um botão para reiniciar o jogo e zerar o placar, facilitando novas rodadas.
- [x] Interface simples e intuitiva

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextViews** Usados para exibir instruções e resultados.
- [x] **Button**  Um botão para reiniciar o jogo.
- [X] **ImageViews** Representam as opções do jogo (Pedra, Papel e Tesoura) e o resultado da partida.

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/App-jogo-jokenpo.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/jokenpo
│ │ │ │ ├── MainActivity.java # Atividade principal 
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```
 
## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.
 
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário escolhe opção que ele quer clicando na imagem, e o app devolverá a resposta dele que é gerada aleatoriamente.

![jokenpo](https://github.com/user-attachments/assets/9e5c78d3-205b-47f0-bcf8-c9719f61b2aa)

2.**Demonstração do Jogo**

Após o resultado, ficará contando um placar. O usuário também poderá reiniciar o jogo se apertar no botão, fazendo a contagem do placar voltar a estaca zero.

![jokenpodemo](https://github.com/user-attachments/assets/df4677ff-4a19-4f70-92fd-7e6052a4e4c6)


## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença MIT

Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
