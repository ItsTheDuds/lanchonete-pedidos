# 🚀 Lanchonete Java – Projeto do SENAI

## Descrição
Este projeto consiste em um sistema de gerenciamento de pedidos para uma lanchonete, desenvolvido em Java como atividade prática durante uma prova do curso **Técnico em Desenvolvimento de Sistemas** do SENAI.  

O sistema permite:
- Gerenciar o cardápio da lanchonete (produtos e bebidas);
- Criar pedidos para clientes;
- Gerenciar a fila de pedidos;
- Atender pedidos e manter um histórico dos pedidos atendidos;
- Exibir pedidos detalhados com formatação de preços.

## Estrutura do Projeto
- **Produto.java** – Classe que representa os produtos do cardápio, com atributos `nome`, `preco`, `codigo` e `categoria`.  
- **Pedido.java** – Classe que representa um pedido de cliente, com lista de produtos, cálculo de total com desconto e método de exibição.  
- **Lanchonete.java** – Classe que gerencia o cardápio, a fila de pedidos e o histórico de pedidos atendidos.  
- **MenuLanchonete.java** – Classe principal com menu interativo, permitindo ao usuário listar cardápio, fazer pedidos, atender pedidos e verificar histórico.

## Funcionalidades
1. Adicionar produtos ao cardápio.
2. Buscar produtos pelo código.
3. Criar pedidos adicionando produtos do cardápio.
4. Enfileirar pedidos.
5. Atender pedidos na ordem de chegada.
6. Ver o último pedido atendido.
7. Listar cardápio completo.

## Tecnologias Utilizadas
- Linguagem: Java  
- Estruturas de dados: `HashMap`, `Queue` (LinkedList), `Stack`  

## Autor
Projeto desenvolvido pelo Eduardo dos Santos Martins – Curso Técnico em Desenvolvimento de Sistemas durante uma prova prática.
