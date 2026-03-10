# Challenge Literatura 

Aplicación desarrollada en Java con Spring Boot que permite consultar información sobre libros utilizando una API externa y almacenar los resultados en una base de datos PostgreSQL.

El programa funciona mediante un menú en consola, desde donde el usuario puede realizar diferentes consultas sobre libros y autores.

## Tecnologías utilizadas

Java 17

Spring Boot

Spring Data JPA

PostgreSQL

Maven

API de libros (Gutendex)

## Requisitos para ejecutar el proyecto

Antes de ejecutar la aplicación debes tener instalado:

Java JDK 17

IntelliJ IDEA (o cualquier IDE compatible con Java)

PostgreSQL

pgAdmin 4

Maven (normalmente IntelliJ lo incluye)

## Cómo ejecutar el proyecto

1. Abrir el proyecto en IntelliJ IDEA.

2. Esperar a que Maven descargue todas las dependencias.

3. Buscar la clase principal del proyecto.

**ChallengeLiteraturaApplication.java**

4. Ejecutar la aplicación presionando:

Run ▶

Si todo está configurado correctamente, aparecerá el menú del programa en la consola.

## Funcionalidades del programa

El menú permite realizar varias acciones:

1. Buscar libro por título

2. Listar libros registrados

3. Listar autores registrados

4. Listar autores vivos en un determinado año

5. Listar libros por idioma

Los resultados de las búsquedas se almacenan automáticamente en la base de datos.
