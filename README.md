# Proyecto Java de Consola - MVC, DAO, DI, Factory

Este proyecto fue desarrollado como ejercicio académico para aplicar explícitamente varios patrones arquitectónicos y de diseño en Java puro, sin frameworks externos.

## 📌 Objetivo

Implementar una aplicación de consola que gestione usuarios, utilizando:

- ✅ **MVC (Modelo-Vista-Controlador)**: separación de responsabilidades entre modelo, lógica de negocio y entrada/salida.
- ✅ **DAO (Data Access Object)**: acceso a datos encapsulado en una clase separada.
- ✅ **Inyección de dependencias**: aplicada manualmente por constructor para reducir acoplamiento.
- ✅ **Factory**: clase central (`AppFactory`) que se encarga de crear y conectar los objetos principales.

## 🧠 Estructura del proyecto

src/
├── modelo/ ← Clase Usuario (modelo de datos)
├── dao/ ← UsuarioDAO (gestión de datos en memoria)
├── servicio/ ← UsuarioService (lógica de negocio)
├── controlador/ ← UsuarioController (interacción con el usuario)
├── fabrica/ ← AppFactory (creación centralizada de dependencias)
└── Main.java ← Punto de entrada de la aplicación


## 🖥️ Funcionamiento

- La aplicación se ejecuta en consola.
- Permite crear usuarios y listarlos.
- Los datos se almacenan temporalmente en memoria (usando una lista).
- La estructura permite evolucionar fácilmente hacia una aplicación web o con base de datos real.

## 🛠️ Tecnologías

- Java Standard Edition (Java SE)
- NetBeans como entorno de desarrollo

- Alumno: Elías Moraez
- Año: 2025
