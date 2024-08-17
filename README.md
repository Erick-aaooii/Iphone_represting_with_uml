# POO - Desafio

<img width="200" src="https://icon.icepanel.io/Technology/svg/Unified-Modelling-Language-%28UML%29.svg">

A DIO propôs, em seu bootcamp de Java, a criação de um desafio de projeto de [**Modelagem e Diagramação de um Componente iPhone**](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo).

## Contexto

Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

## Funcionalidades a Modelar

1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`

2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## Objetivo

1. **Criar um Diagrama UML**
   - Crie um diagrama UML que represente as funcionalidades descritas acima. Utilize uma ferramenta UML de sua preferência.

2. **Implementar as Classes e Interfaces**
   - Opcionalmente, implemente as classes e interfaces correspondentes em Java, conforme representado no diagrama UML.

## Site Utilizado para Criação do UML

Para a criação do diagrama UML, utilizei o site [Draw.io](https://app.diagrams.net/), onde explorei as ferramentas disponíveis para a criação do diagrama UML.

<img src="https://raw.githubusercontent.com/Erick-aaooii/Iphone_represting_with_uml/main/imgs/Captura%20de%20Tela%20(85).png">

Sua interface simples e minimalista facilitou o uso das ferramentas, além da incrível quantidade de templates disponíveis para a execução do projeto.

## Explicação do UML do Projeto

Aqui está a versão do diagrama UML criado por mim para representar o código presente na pasta [`src`](https://github.com/Erick-aaooii/Iphone_represting_with_uml/tree/main/src).

<img src="https://raw.githubusercontent.com/Erick-aaooii/Iphone_represting_with_uml/main/imgs/Iphone%20Diagram.drawio.png">

Todas as interfaces sugeridas pela DIO foram organizadas dentro de uma pasta chamada `Apps`, onde estão implementados todos os métodos necessários para as interfaces. Já no objeto `iPhone`, foi criada toda a lógica de cada método, definindo como eles devem se comportar quando acionados. Após isso, foi criada a classe `Main`, que molda toda a escolha do usuário e define a entrada de dados para a seleção do aplicativo que ele deseja usar. De acordo com a escolha do usuário, é realizada a chamada do método correspondente no `iPhone`.
