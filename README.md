<h1 align="center">Base de Datos en memoria local con H2</h1>

## Interfaz grafica H2 Console

Para ingresar exitosamente a la interfaz gráfica, coloque en su navegador favorito la siguiente ruta http://localhost:8080/h2-console-users y siga los siguientes pasos:

1. **Driver Class:** org.h2.Driver
2. **JDBC URL:** jdbc:h2:mem:testdb
3. **User Name:** h2-memory-store
4. **Password:** h2-memory-store
5. Finalmente presione **Connect**

Luego que la conexión sea exitosa, se podra visualizar la tabla creada, de acuerdo a la entidad realizada, que en este ejemplo sería **User**.

## Test DB con archivo data.sql

Gracias al archivo [data.sql](https://github.com/davidorellana98/h2-database-spring-boot/blob/main/src/main/resources/data.sql), se podra generar datos de prueba escrito en SQL, que luego serán visualizados en la tabla **User**.

```xml
        INSERT INTO users(name, last_name, age, email, date_birth) VALUES('Luis', 'Orellana', 24, 'luis@mail.com', '1998-03-27');
        INSERT INTO users(name, last_name, age, email, date_birth) VALUES('Harrison', 'Martinez', 28, 'harrison@mail.com', '1994-04-23');
        INSERT INTO users(name, last_name, age, email, date_birth) VALUES('Santiago', 'Carrillo', 28, 'santiago@mail.com', '1994-05-17');
        INSERT INTO users(name, last_name, age, email, date_birth) VALUES('Felipe', 'Calvache', 22, 'felipe@mail.com', '2000-03-27');
        INSERT INTO users(name, last_name, age, email, date_birth) VALUES('Rolando', 'Perez', 20, 'rolando@mail.com', '2002-03-27');
```