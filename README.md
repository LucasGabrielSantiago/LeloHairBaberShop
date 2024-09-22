**Hair Barber Shop**

# **Objetivo**

A aplicação consiste no gerenciamento dos clientes de uma barbearia, onde o proprietário e o cliente possuem perfis diferentes, que após  agendamento possa ser visualizado uma lista com os horários marcados, utilizando Java como principal linguagem de programação. A aplicação visa automatizar e otimizar o processo de agendamento, garantindo eficiência, escalabilidade e uma experiência de usuário.

## **Framework e bibliotecas**

Abaixo encontra-se quais bibliotecas, frameworks e afins que foram utilizados e qual sua funcionalidade no projeto.

* **Swing Framework:** é utilizado no gráfico para construção de GUIs , aplicada para exibir diálogos simples ao usuário e janelas de aplicações.  
* **Maven:** é uma ferramenta de automação de compilação e gerenciamento de dependências que facilita o desenvolvimento de projetos.

## **Definições de requisitos**

**Requisitos Funcionais**  
Essa parte consiste nos requisitos que descrevem as ações que um sistema deve ser capaz de executar.

* **Cadastro:** envolve o cadastro do cliente ou do proprietário para entrar no sistema.  
* **Agendamento:** consiste na área onde os clientes possam agendar um horário.  
* **Tela dos agendados:** mostra os horários e os nomes dos clientes que agendaram horário


**Requisitos não funcionais**  
Foca relacionados ao uso da aplicação em termos de desempenho, usabilidade

* **Escalabilidade**: A aplicação deve ser capaz de lidar com agendamentos simultâneos sem perda de desempenho.   
* **Privilégio Mínimo:** cada usuário deve  possuir acesso apenas no que é importante para o mesmo, ex.: clientes não devem saber o horário de outras pessoas, somente o próprio.

## **Database**

O banco de dados selecionado foi um o MySQL, que é empregado pela facilidade e usabilidade simples, o mesmo é empregado para armazenamento de forma relacional as informações do cadastro, login e o serviço prestado. Abaixo as informações que são operadas.

**Cadastro do cliente**

* Nome  
* Sexo  
* Data de nascimento  
* Telefone  
* E-mail  
* RG  
* Senha

**Login**

* Usuário  
* Senha

**Serviço Prestado**

* Tipo de serviço  
* Valor

## **Organização da arquitetura**

src/  
└── main/  
    └── java/  
        ├── DAO/  
        │   ├── conexao.java   \# Classe de conexão com o banco de dados  
        │   └── usuarioDAO.java    \# Classe de acesso a dados para o usuário  
        ├── DTO/  
        │   └── userDTO.java   \# Objeto de Transferência de Dados (DTO) para o usuário  
        ├── Model/  
        │   ├── Cliente.java    \# Classe de modelo que representa um Cliente  
        │   ├── Pessoa.java    \# Classe de modelo que representa uma Pessoa  
        │   ├── Servico.java   \# Classe de modelo que representa um Serviço  
        │   └── Usuario.java    \# Classe de modelo que representa um Usuário  
        └── View/  
            ├── imagens/  
            │   ├── AgendaFundo.png     \# Imagem de fundo para a agenda  
            │   └── barbershop.png      \# Imagem do barbershop (logotipo ou banner)  
            ├── Agenda.form             \# Arquivo de layout da interface gráfica da Agenda  
            ├── Agenda.java             \# Interface gráfica da Agenda  
            ├── Login.form              \# Arquivo de layout da interface gráfica de Login  
            ├── Login.java              \# Interface gráfica de Login  
            ├── MenuPrincipal.form      \# Arquivo de layout interface gráfica do Menu Principal  
            └── MenuPrincipal.java      \# Interface gráfica do Menu Principal  
        ├──target/   \# Contém os binários gerados após a compilação

## **Padrão de arquitetura**

O padrão de arquitetura aplicado foi o MVC(model, view, controller) que consiste na divisão das tarefas, abaixo explicação:

### **Model:**

* **Responsabilidade:** Esta pasta contém as classes responsáveis pela representação e manipulação dos dados da aplicação. Essas classes geralmente correspondem às entidades de negócios, como Cliente, Usuário, Pessoa e Serviço, e são usadas para armazenar e processar os dados recebidos da interface do usuário (View) ou do banco de dados.  
* **Aplicação:** As classes dentro de Model gerenciam a lógica de negócios relacionada a:  
  * Registro de clientes: Gerenciamento das informações de clientes, como nome, contato e histórico de serviços.  
  * Cadastro de usuários: Gerenciamento dos dados de usuários do sistema, como login e permissões.  
  * Serviços: Representação dos serviços prestados (ex.: corte de cabelo, barba, etc.), associando clientes e usuários.

* **Exemplo de classes:**  
  * Cliente.java: Contém as propriedades e métodos relacionados a um cliente.  
  * Pessoa.java: Pode ser uma classe base para Cliente e Usuario, contendo atributos comuns, como nome e endereço.  
  * Servico.java: Representa os serviços oferecidos no sistema.  
  * Usuario.java: Gerencia os dados e funcionalidades relacionadas aos usuários do sistema.

### **View:**

* **Responsabilidade:** A pasta View é dedicada à interação com o usuário (interface gráfica), contendo as telas e imagens utilizadas na aplicação. Aqui, os layouts da interface gráfica e os componentes visuais são definidos.  
* **Aplicação:** As classes e arquivos dentro da View são responsáveis por:  
  * Exibir as telas: Gerenciar a apresentação das telas de login, cadastro e menu principal da aplicação.  
  * Interagir com o usuário: Receber entradas do usuário, como nome de usuário, senha, e informações de cadastro, e exibir dados processados.  
  * Armazenar recursos gráficos: Como imagens usadas nas interfaces, banners, logotipos e fundos.  
* **Componentes principais:**  
  * Imagens: A pasta “imagens” contém arquivos gráficos que são usados nas telas, como AgendaFundo.png e barbershop.png.  
  * Telas:  
    * Agenda.form e Agenda.java: Interface e lógica da tela de agendamento.  
    * Login.form e Login.java: Interface e lógica da tela de login.  
    * MenuPrincipal.form e MenuPrincipal.java: Interface e lógica do menu principal da aplicação.

