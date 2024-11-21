# Backend Prueba Bus

Este es el backend de una API de buses, donde se implementaron métodos que responden a solicitudes **GET** (para listar buses o utilizar parámetros) y **POST** (para ingresar datos de prueba). Además, se implementó un método **DELETE** para eliminar registros de buses. La autenticación básica está habilitada solo para **DELETE**, y puede ser probada usando **Postman**.

## Requisitos
Se uso spring tool suite como ide,
version 17 de java,
version 3 de spring

## Para ingresar datos en postman

1. Para ingresar datos(Post) en postman:
  ```bash
   http://localhost:8080/bus
   ```

   ```bash
   {
    "numero": "18",
    "placa": "BCD-456",
    "caracteristicas": "Bus con WiFi ",
    "marca": {
        "idMarca": 2
    },
    "activo": true
}
   ```
2. Para probar el get:
   ```bash
   http://localhost:8080/bus
   ```

3. Para probar el get con parametro:
   ```bash
   http://localhost:8080/bus/1
   ```

4. Para probar eliminacion con parametro:
   ```bash
   http://localhost:8080/bus/1
   ```

## NOTA IMPORTANTE

Para hacer delete se usa :
Username : jhon
Password : 1234
