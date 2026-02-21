# 🏦 Mini Bank System — Proyecto Colaborativo Java

Bienvenido 👋

Este repositorio es un **proyecto educativo y colaborativo** creado para aprender desarrollo backend en Java mientras construimos un sistema paso a paso.

⚠️ **Este NO es un sistema bancario real.**
El objetivo principal es **aprender Programación Orientada a Objetos, Interfaces y buenas prácticas** trabajando en equipo.

---

## 🎯 Objetivo del Proyecto

Construir un pequeño sistema bancario mientras aprendemos cómo se organizan proyectos reales en Java.

**Contribuir:** 
* 🗺️ [ROADMAP del Proyecto](ROADMAP.md)
* 🤝 [Guía de Contribución](CONTRIBUTING.md)

Durante el desarrollo practicamos:

✅ Programación Orientada a Objetos (POO)

✅ Interfaces

✅ Principios SOLID

✅ Repository Pattern

✅ Separación de responsabilidades

✅ Código limpio

✅ Trabajo colaborativo con GitHub

---

## 👨‍🎓 ¿Para quién es este proyecto?

Este proyecto está pensado especialmente para:

* Personas que están aprendiendo Java
* Estudiantes que comienzan con POO
* Personas aprendiendo Interfaces
* Desarrolladores junior
* Estudiantes que quieren practicar GitHub
* Personas que desean prepararse para Spring Boot

No necesitas experiencia avanzada 👍

---

## 🧠 Funcionalidades actuales

Actualmente el sistema permite:

* Crear cuentas bancarias
* Depositar dinero
* Retirar dinero
* Transferir dinero entre cuentas
* Manejo de saldo
* Uso de Interfaces
* Implementación básica del Repository Pattern
* Separación por capas

---

## 🏗️ Estructura del Proyecto

```
src/
└── com/mybank
    ├── account
    │   ├── Account.java
    │   ├── AccountService.java
    │   └── AccountRepository.java
    │
    ├── infrastructure
    │   └── InMemoryAccountRepository.java
    │
    ├── notification
    │   ├── NotificationService.java
    │   └── EmailNotification.java
    │
    └── Main.java
```

---

## 🧩 Capas del sistema

* **Domain** → reglas del negocio
* **Service** → lógica del sistema
* **Repository** → acceso a datos
* **Infrastructure** → implementaciones técnicas

---

## 🚀 Cómo ejecutar el proyecto

### 1️⃣ Clonar repositorio

```bash
git clone https://github.com/Marlon4789/banking-system-solid-java.git
cd banking-system-solid-java
```

---

### 2️⃣ Compilar

```bash
javac com/mybank/**/*.java
```

---

### 3️⃣ Ejecutar

```bash
java com.mybank.Main
```

---

## 📌 Filosofía del Proyecto

Este repositorio es un espacio seguro para:

✅ aprender

✅ experimentar

✅ mejorar habilidades

✅ colaborar con otros desarrolladores

---

## ⭐ Mensaje final

Si estás aprendiendo Java…

Este proyecto es para ti.

No importa tu nivel.
Todos estamos aprendiendo juntos.

**Aprendemos construyendo software real.**
