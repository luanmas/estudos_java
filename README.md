
Sistema de Gerenciamento de Pedidos
Visão Geral
O Sistema de Gerenciamento de Pedidos é uma aplicação simples em Java desenvolvida para gerenciar informações de clientes e pedidos. Permite aos usuários inserir detalhes do cliente, criar pedidos e adicionar itens aos pedidos. A aplicação utiliza princípios de programação orientada a objetos para representar entidades como clientes, pedidos e produtos.

Funcionalidades
Informações do Cliente: Coleta e armazena detalhes do cliente, incluindo nome, e-mail e data de nascimento.

Criação de Pedidos: Facilita a criação de pedidos com informações como data do pedido, status e cliente associado.

Itens do Pedido: Permite aos usuários adicionar vários itens a um pedido, incluindo nome do produto, preço e quantidade.

Manipulação de Datas: Utiliza a classe SimpleDateFormat para analisar e manipular entradas de datas.

Enum para Status do Pedido: Usa um enum (OrderStatus) para representar diferentes status de pedidos.

Como Usar
Informações do Cliente:

Insira o nome do cliente, e-mail e data de nascimento quando solicitado.
Informações do Pedido:

Forneça o status do pedido (por exemplo, "PENDENTE", "ENTREGUE").
Especifique o número de itens no pedido.
Itens do Pedido:

Para cada item, insira o nome do produto, preço e quantidade.
Resumo:

A aplicação gera um resumo do pedido, exibindo detalhes do cliente e do pedido, bem como uma lista de itens pedidos.
Estrutura do Código
O projeto consiste nos seguintes componentes principais:

Pacote Entities:

Contém classes que representam entidades como Client, Order, OrderItem, Product e o enum OrderStatus.
Pacote Application:

A classe Program é o ponto de entrada da aplicação e contém a lógica de interação com o usuário.
Dependências
O projeto utiliza a biblioteca padrão do Java sem dependências externas.

Como Executar
Clone o repositório.
Abra o projeto em um ambiente de desenvolvimento Java (por exemplo, Eclipse, IntelliJ).
Execute a classe Program para iniciar a aplicação.
Observações
Certifique-se de que a entrada de data siga o formato "DD/MM/YYYY".
A aplicação assume entradas de usuário válidas e não inclui tratamento extensivo de erros.
Sinta-se à vontade para explorar e modificar o código conforme suas necessidades ou expandir sua funcionalidade
