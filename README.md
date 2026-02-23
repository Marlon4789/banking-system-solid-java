# 🏦 Mini Bank System
### Sistema Bancario Educativo en Java

Proyecto backend desarrollado en **Java** con el objetivo de aprender y practicar  
**Programación Orientada a Objetos, Interfaces y buenas prácticas de arquitectura**  
mediante la construcción progresiva de un sistema real.

> **NOTA:** Este NO es un sistema bancario real.  
> Es un proyecto educativo enfocado en aprendizaje y colaboración.

---

## 🚀 Objetivo del Proyecto

Construir un sistema bancario paso a paso mientras aprendemos cómo se estructuran
los proyectos backend en Java.

Durante el desarrollo aplicamos:

✅ Programación Orientada a Objetos (POO)  
✅ Interfaces  
✅ Principios SOLID  
✅ Repository Pattern  
✅ Separación de responsabilidades  
✅ Arquitectura por capas  
✅ Código limpio  
✅ Trabajo colaborativo con Git y GitHub

---

## 👨‍🎓 ¿Para quién es este proyecto?

Este proyecto está diseñado para:

- Estudiantes que están aprendiendo **Java**
- Personas iniciando en **POO**
- Personas aprendiendo **Interfaces**
- Estudiantes que desean practicar GitHub
- Personas preparándose para **Spring Boot**

No necesitas experiencia avanzada ✅

---

## Funcionalidades actuales

El sistema actualmente permite:

- Crear cuentas bancarias
- Depositar dinero
- Retirar dinero
- Transferir dinero entre cuentas
- Manejo de saldo
- Separación por capas
- Uso de Interfaces
- Implementación básica del Repository Pattern

---

## 🏗️ Arquitectura del Proyecto

El sistema sigue una arquitectura simple inspirada en **Clean Architecture**.

### Capas del sistema

| Capa | Responsabilidad |
|------|----------------|
| Domain | Reglas del negocio |
| Service | Lógica de aplicación |
| Repository | Acceso a datos |
| Infrastructure | Implementaciones técnicas |

---

## 📂 Estructura del Proyecto


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

## ⚙️ Cómo ejecutar el proyecto

### 1️⃣ Clonar repositorio

```bash
git clone https://github.com/Marlon4789/banking-system-solid-java.git
cd banking-system-solid-java
```
2️⃣ Compilar proyecto
```aiignore
javac com/mybank/**/*.java
```
3️⃣ Ejecutar aplicación
```aiignore
java com.mybank.Main
```

---

## 🤝 Cómo contribuir

Si deseas participar en el proyecto, puedes hacerlo siguiendo estos pasos:

1. Revisa el plan de desarrollo del proyecto:👉 [ROADMAP.md](ROADMAP.md)

2. Lee la guía de contribución: 👉 [CONTRIBUTING.md](CONTRIBUTING.md)

---

### 🎯 Filosofía del Proyecto

Este repositorio existe para:

- Aprender construyendo software

- Entender arquitectura backend

- Aplicar buena practicas de código limpio

- Colaborar con otros desarrolladores

- Prepararse para Spring Boot

El objetivo principal no es solo el resultado final,
sino el proceso de aprendizaje y mejora continua.

### ⭐ Mensaje Final

Si estás aprendiendo Java...

Este proyecto es un espacio para practicar, experimentar y mejorar
nuestras habilidades como desarrollador backend.

No importa tu nivel actual.

**Aprendemos construyendo software real.**
