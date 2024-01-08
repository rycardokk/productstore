# CRUD de Produtos com Spring Boot e Thymeleaf

Este é um projeto básico de CRUD (Create, Read, Update, Delete) para gerenciar uma tabela de produtos usando Spring Boot e Thymeleaf. O aplicativo web permite a visualização, adição, edição e exclusão de produtos.

Requisitos
Certifique-se de ter o seguinte instalado em sua máquina:

Java 11 ou superior
Maven

# Configuração do Ambiente de Desenvolvimento
1. Clone o repositório
git clone https://github.com/rycardokk/productstore.git

Estrutura do Projeto
src/main/java/com/ecommerce/productstore: Contém os arquivos Java, incluindo controladores, entidades e a classe principal do Spring Boot.

src/main/resources/templates/product: Contém os arquivos Thymeleaf para as páginas HTML relacionadas aos produtos.

Funcionalidades
Listar Produtos: Visualizar uma lista de produtos existentes.
Adicionar Produto: Adicionar um novo produto fornecendo nome, preço e descrição.
Editar Produto: Editar as informações de um produto existente.
Excluir Produto: Excluir um produto da lista.

Páginas Thymeleaf
home.html: Página principal com uma bio sobre a empresa
productList: Página principal que exibe a lista de produtos.
productRegister.html: Página para adicionar um novo produto.
productEdit.html: Página para editar informações de um produto existente.

