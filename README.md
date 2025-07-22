# bancodedados-sqlite-estudo
# 📱 App de Cadastro de Usuários com SQLite (Android + Java)

Este é um aplicativo Android simples de **cadastro e listagem de usuários**, desenvolvido em **Java** e utilizando o banco de dados **SQLite local**, sem necessidade de conexão com a internet. Ideal para aprender como funciona o armazenamento local no Android.

---

## ✨ Funcionalidades

- ✅ Cadastro de nome e e-mail
- ✅ Armazenamento persistente com SQLite
- ✅ Listagem dos usuários cadastrados
- ✅ Retorno automático dos dados ao reiniciar o app

---

## 🧠 Tecnologias Utilizadas

- Java (Android)
- Android SDK
- SQLite (via `SQLiteOpenHelper`)
- XML para UI
- `ListView` + `ArrayAdapter`

---

## 📸 Capturas de Tela

> *[adicione imagens se desejar]*  
- Formulário de cadastro  
- Lista de usuários cadastrados  

---

## 📂 Estrutura do Projeto

```plaintext
📁 app/
├── 📁 java/com/seuapp/sqlite/
│   ├── MainActivity.java
│   └── MeuBancoHelper.java
└── 📁 res/layout/
    └── activity_main.xml
