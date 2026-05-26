# 🛒 Sistema de Pedidos com Spring Boot e Design Patterns

Projeto desenvolvido com Spring Boot aplicando Design Patterns na prática.

---

## 🚀 Funcionalidades

- Criar pedidos via API REST
- Escolher forma de pagamento (PIX, Cartão, Boleto)
- Processamento usando padrões de projeto

---

## 🧠 Design Patterns usados

### Strategy
Permite trocar formas de pagamento sem alterar o código principal.

### Factory
Cria automaticamente o tipo de pagamento escolhido.

---

## 📌 Endpoint

### POST /pedidos

Exemplo de requisição:

```json
{
  "metodoPagamento": "pix",
  "valor": 100
}
