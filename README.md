
<h1>POO - Desafio</h1>
<img width="200" src="https://icon.icepanel.io/Technology/svg/Unified-Modelling-Language-%28UML%29.svg">
<p>A Dio propôs em seu bootcamp de Java a criação de um desafio de projeto de <a href="https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo"><b>Modelagem e Diagramação de um Componente iPhone</b></a>.</p>

<b>Contexto<b/>
- Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

- ## Funcionalidades a Modelar

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
  
# Site utilizado para criação do UML.
<p>Para a criação do diagrama UML Utilizei o site <a href="https://app.diagrams.net/">Draw io</a> onde utilizei as ferramentas disponíveis para a criação do diagrama UML.</p>

<img src="https://raw.githubusercontent.com/Erick-aaooii/Iphone_represting_with_uml/main/imgs/Captura%20de%20Tela%20(85).png">
<p>Sua interface simples e minimalista me fez entender fácilmente como se usava suas ferramentas fora a incrível quantidade de templates que me foi dado para execução do projeto.</p>

# Explicação do UML do projeto.
Aqui esta a versão do diagrama UMl criado por mim para representar o código presente na pasta <a href="https://github.com/Erick-aaooii/Iphone_represting_with_uml/tree/main/src">src</a>

<img src="https://raw.githubusercontent.com/Erick-aaooii/Iphone_represting_with_uml/main/imgs/Iphone%20Diagram.drawio.png">
<p>Todas as interfaces que foram sugeridas pela dio foram colodadas dentros de uma pasta chamada <code>Apps</code>, onde é colocada todos os métodos necessários para as interfaces. Já no objeto <code>iphone</code> foi criado toda a lógica de cada método e como deveria agir quando acionado. Após isso é realizado a criação da classe <code>main</code> que molda toda a escolha do usuário e que define a entrada de dados do usuário para a escolha do app que deseja usar, de acordo com a escolha do usuário é dado como retorno a chamada do metódo iphone</p>
