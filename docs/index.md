# Documentación del CRUD Básico

Bienvenido a la documentación del CRUD básico para el recurso "Usuario". Esta documentación describe cómo interactuar con la API para crear, leer, actualizar y eliminar usuarios.

## Tabla de Contenidos

- [Introducción](#introducción)
- [Descripción del Recurso](#descripción-del-recurso)
- [Endpoints](#endpoints)
- [Ejemplos de Uso](#ejemplos-de-uso)
- [Modelo de Usuario](#modelo-de-usuario)
- [Swagger UI](#swagger-ui)

## Introducción

Este proyecto implementa un CRUD (Crear, Leer, Actualizar, Eliminar) simple para el recurso "Usuario". Utilizando Spring Boot, esta API RESTful permite gestionar usuarios en la base de datos.

## Descripción del Recurso

El recurso "Usuario" tiene los siguientes atributos:

- **id**: Identificador único del usuario (Integer).
- **email**: Correo electrónico del usuario (String).
- **password**: Contraseña del usuario (String).
- **firstName**: Nombre del usuario (String).
- **lastName**: Apellido del usuario (String).
- **active**: Estado del usuario (boolean).

## Endpoints

A continuación se presentan los endpoints disponibles en la API:

### /users

- **GET**: Obtiene todos los usuarios.
    - Respuesta: `200 OK` con una lista de usuarios.

- **POST**: Crea un nuevo usuario.
    - Solicitud: Cuerpo JSON con el modelo de usuario.
    - Respuesta: `200 OK` con el usuario creado.

### /users/{id}

- **GET**: Obtiene un usuario específico por ID.
    - Parámetro: `id` (Integer, requerido).
    - Respuesta: `200 OK` con el usuario solicitado.

- **DELETE**: Elimina un usuario por ID.
    - Parámetro: `id` (Integer, requerido).
    - Respuesta: `200 OK`.

## Ejemplos de Uso

### Crear un Usuario

Para crear un nuevo usuario, realiza una solicitud `POST` al endpoint `/users` con el siguiente cuerpo:

```json
{
  "email": "usuario@example.com",
  "password": "contraseña",
  "firstName": "Nombre",
  "lastName": "Apellido",
  "active": true
}
