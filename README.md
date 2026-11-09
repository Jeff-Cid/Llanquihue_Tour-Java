# Llanquihue Tour

Proyecto en lenguaje Java creado para Desarrollo Orientado a Objetos I de la carrera Analista Programador Computacional en DuocUC.


## Descripción

Programa que modela a los clientes de una agencia de turismo usando estructuras comunes, aplicando composición, herencia y encapsulamiento.
El sistema crea 3 clientes como ejemplo y muestra sus datos por consola con System.out.println() y método toString() en cada clase.


## Estructuras de paquetes y clases 

### Paquete 'LlanquihueTour.model': 
- Rut: representa el RUT de una persona y valida el formato.
- Direccion: representa calle, número, ciudad y región.
- Persona: clase base con los datos: nombre, apellido, RUT, telefono, correo y dirección.
- Cliente: hereda de 'Persona' y agrega nacionalidad e idiomas.

### Paquete 'LlanquihueTour.app':
- Main: crea a los clientes de prueba y los muestra por consola. Además, usa Try-Catch para controlar RUT inválidos (por ejemplo: Cliente 2).


## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA (requiere tener el JDK instalado).
2. Abrir el archivo `src/main/java/LlanquihueTour/app/Main.java`.
3. Presionar el botón verde para ejecutar junto a `public static void main`.

Para compilar y ejecutar desde la terminal, ubicarse en la carpeta del proyecto y escribir:

    javac -d out src/main/java/LlanquihueTour/model/*.java src/main/java/LlanquihueTour/app/Main.java
    java -cp out LlanquihueTour.app.Main


## Autor

**Jefferson Cid Aravena**


- Asignatura: Desarrollo Orientado a Objetos I
- Carrera: Analista Programador Computacional
- Institución: DuocUC

