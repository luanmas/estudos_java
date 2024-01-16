<h1>Sistema de Gerenciamento de Pedidos</h1>

    <h2>Visão Geral</h2>
    <p>O Sistema de Gerenciamento de Pedidos é uma aplicação Java console projetada para gerenciar informações de clientes e pedidos. Ele utiliza princípios de programação orientada a objetos para representar entidades como clientes, pedidos e produtos.</p>

    <h2>Funcionalidades</h2>
    <ul>
        <li><strong>Informações do Cliente:</strong> Coleta e armazena detalhes do cliente, incluindo nome, e-mail e data de nascimento.</li>
        <li><strong>Criação de Pedidos:</strong> Facilita a criação de pedidos com informações como data do pedido, status e cliente associado.</li>
        <li><strong>Itens do Pedido:</strong> Permite aos usuários adicionar vários itens a um pedido, incluindo nome do produto, preço e quantidade.</li>
        <li><strong>Manipulação de Datas:</strong> Utiliza a classe SimpleDateFormat para analisar e manipular entradas de datas.</li>
        <li><strong>Enum para Status do Pedido:</strong> Usa um enum (OrderStatus) para representar diferentes status de pedidos.</li>
    </ul>

    <h2>Como Usar</h2>
    <ol>
        <li><strong>Informações do Cliente:</strong></li>
        <ul>
            <li>Insira o nome do cliente, e-mail e data de nascimento quando solicitado.</li>
        </ul>
        <li><strong>Informações do Pedido:</strong></li>
        <ul>
            <li>Forneça o status do pedido (por exemplo, "PENDENTE", "ENTREGUE").</li>
            <li>Especifique o número de itens no pedido.</li>
        </ul>
        <li><strong>Itens do Pedido:</strong></li>
        <ul>
            <li>Para cada item, insira o nome do produto, preço e quantidade.</li>
        </ul>
        <li><strong>Resumo:</strong></li>
        <ul>
            <li>A aplicação gera um resumo do pedido, exibindo detalhes do cliente e do pedido, bem como uma lista de itens pedidos.</li>
        </ul>
    </ol>

    <h2>Estrutura do Código</h2>
    <p>O projeto consiste nos seguintes componentes principais:</p>
    <ul>
        <li><strong>Pacote Entities:</strong> Contém classes que representam entidades como Client, Order, OrderItem, Product e o enum OrderStatus.</li>
        <li><strong>Pacote Application:</strong> A classe Program é o ponto de entrada da aplicação e contém a lógica de interação com o usuário.</li>
    </ul>

    <h2>Dependências</h2>
    <p>O projeto utiliza a biblioteca padrão do Java sem dependências externas.</p>

    <h2>Como Executar</h2>
    <ol>
        <li>Clone o repositório.</li>
        <li>Abra o projeto em um ambiente de desenvolvimento Java (por exemplo, Eclipse, IntelliJ).</li>
        <li>Execute a classe <code>Program</code> para iniciar a aplicação.</li>
    </ol>

    <h2>Observações</h2>
    <ul>
        <li>Certifique-se de que a entrada de data siga o formato "DD/MM/YYYY".</li>
        <li>A aplicação assume entradas de usuário válidas e não inclui tratamento extensivo de erros.</li>
    </ul>

    <p>Sinta-se à vontade para explorar e modificar o código conforme suas necessidades ou expandir sua funcionalidade.</p>
