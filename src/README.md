# Banking System - SOLID Principles + Repository Pattern (Java)

Mini proyecto en Java que simula un sistema bancario con transferencia
entre cuentas y notificación utilizando:

- Programación Orientada a Objetos
- Principios SOLID
- Patrón Repository
- Inyección de Dependencias
- Interfaces
- Fundamentos de Arquitectura Limpia

## Funcionalidades

- Crear cuentas bancarias
- Transferir dinero entre cuentas
- Validación de saldo insuficiente
- Implementación de repositorio en memoria
- Enviar notificación (Email y optional SMS)
- Arquitectura desacoplada


## Arquitectura del Proyecto

El proyecto sigue una estructura por capas:

mybank
- \account (Capa de Dominio)
- \notification (Abstracciones)
- \infrastructure (Implementaciones técnicas)
- \Main (Punto de entrada de la aplicación)

## Conceptos aplicados

### Dominio
Contiene la lógica de negocio pura (`Account`).

### Aplicación
`AccountService` orquesta las operaciones entre dominio e infraestructura.

### Infraestructura
Implementación concreta del repositorio (`InMemoryAccountRepository`).

---

## Principios SOLID Aplicados

### Single Responsibility Principle (SRP)
Cada clase tiene una única responsabilidad:
- `Account` → Lógica de negocio
- `AccountService` → Coordinación de operaciones
- `InMemoryAccountRepository` → Persistencia en memoria

---

### Open/Closed Principle (OCP)
El sistema puede extenderse sin modificar código existente.

Ejemplo:
- Se puede agregar `SmsNotification`
- Se puede agregar `DatabaseAccountRepository`

Sin cambiar la lógica principal.

---

### Dependency Inversion Principle (DIP)
Los módulos de alto nivel dependen de abstracciones, no de implementaciones concretas:

```java
AccountRepository repository = new InMemoryAccountRepository();
NotificationService notification = new EmailNotification();