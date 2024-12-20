# Sistema de Seguridad en Java - Simulador de Login y Registro

Este proyecto es un simulador de login y registro en Java que implementa seguridad de contraseñas mediante el algoritmo de hash SHA-256. Contiene una interfaz gráfica (`GUI`) basada en Java Swing y diseñada con NetBeans IDE 23. Incluye formularios separados para inicio de sesión y registro de nuevos usuarios, ahora con almacenamiento en fichero de texto con formato CSV, validaciones avanzadas y generación de identificadores alfanuméricos únicos.

> [!IMPORTANT]
> Es importante descargar la versión correcta según la visualización requerida.

## Versiones

- **v0.1.2**: Primera versión estable con interfaz gráfica básica para login y registro (sin funcionalidad).
- **v0.2.0**: Versión actual que incluye mejoras en la seguridad y manejo de datos, alertas en lugar de campos de salida en el formulario, y soporte para futuras expansiones.
- **v0.3.0**: Se agrega soporte para almacenamiento de datos en un fichero, validaciones, y generación de identificadores alfanuméricos únicos para los usuarios.
- **v0.4.0**: Se optimizan las consultas al fichero `usuarios.txt`, nueva ventana con tabla de usuarios registrados, soporte para caracteres especiales y archivos de prueba incluidos.

## Funcionalidades (hasta la versión 0.4.0)

- **Formulario de inicio de sesión**: Solicita correo y contraseña del usuario. Ahora incluye mensajes específicos que indican:
    - Usuario no registrado.
    - Contraseña incorrecta.
- **Formulario de registro**: Solicita nombre, edad, correo y contraseña del nuevo usuario.
    - Notifica al usuario cuando el registro es exitoso.
    - Verifica si el correo ya está registrado.
- **Función de seguridad**: Las contraseñas se encriptan mediante SHA-256 antes de ser procesadas, brindando una capa adicional de protección.
- **Gestión de datos en fichero**: Los datos de usuario se almacenan en un archivo `usuarios.txt` en formato CSV, con la estructura:
    ```csv
    id, nombre, correo, edad, passwordHash
    ```
    Las entradas se limpian para eliminar comas antes de ser guardadas, evitando conflictos en el formato.
- **Identificadores únicos**: Cada usuario registrado cuenta con un identificador alfanumérico único que se verifica para evitar duplicados.
- **Alertas para mostrar datos**: En lugar de mostrar los datos del usuario directamente en el formulario, se despliega una alerta que contiene la información ingresada previamente por el usuario.
- **Nueva ventana después de iniciar sesión**: Una vez que el usuario inicia sesión correctamente, se muestra una ventana con una tabla con la información (nombre, edad, correo) de todos los usuarios registrados previamente.
- **Mejoras en consultas al archivo**: Optimización en el manejo y lectura de datos del archivo `usuarios.txt`.
- **Soporte para caracteres especiales**: Aumenta la compatibilidad con caracteres poco usados, como acentos.
- **Se incluyen dos archivos para realizar pruebas a este proyecto**: Con el fin de realizar pruebas se añaden los siguientes archivos
    - `usuarios.txt`: Contiene usuarios previamente registrados.
    - `contraseñas.txt`: Muestra las credenciales sin cifrar correspondientes a los usuarios registrados.

---

## Descarga e Instalación

### Desde GitHub Releases

Se puede descargar la versión actual del proyecto en formato `.jar` desde la sección de [Releases en GitHub](https://github.com/davi3004/login_phone_java_simulator/releases).

1. Descargar el archivo `.jar` de la versión preferida.
2. Para ejecutar el proyecto, usar el siguiente comando en la terminal:

   ```bash
   java -jar [nombre y ruta del archivo]
   ```

> [!IMPORTANT]
> Asegúrese de tener Java JDK 23 instalado.

### Compilación desde el código fuente

En caso de que encuentres algún error o prefieras compilar el proyecto por ti mismo:

1. Descargar o clonar el proyecto completo desde el repositorio de GitHub.
2. Abrir el proyecto en NetBeans IDE 23.
3. Asegurarse de que el proyecto esté configurado para compilar con JDK 23.
4. Compilar y ejecutar el proyecto desde NetBeans o exportar el archivo `.jar` para ejecutarlo manualmente.

> [!IMPORTANT]
> Asegúrese de tener Java JDK 23 y Apache NetBeans IDE 23 instalado.

### Archivos de Prueba (v0.4.0)

Esta versión (v0.4.0) incluye dos archivos para facilitar las pruebas del sistema:

- `usuarios.txt`: Contiene usuarios previamente registrados.
- `contraseñas.txt`: Muestra las credenciales sin cifrar correspondientes a los usuarios registrados.

> [!IMPORTANT]
> Es importante que el archivo de prueba `usuarios.txt` se encuentre en la misma ruta que el ejecutable `.jar`, si se desea probar el programa con este archivo.

---

## Requisitos del Sistema

- **Java JDK 23**: Asegúrese de tener instalado Java 23 para la correcta ejecución del proyecto.
- **NetBeans IDE 23** (opcional): Se recomienda usar NetBeans para una experiencia de desarrollo más integrada y fácil configuración del entorno.

## Dependencias

El proyecto utiliza las siguientes librerías:

- [**FlatLaf** y **FlatLaf IntelliJ Themes** (v3.5.2)](https://www.formdev.com/flatlaf/): Para una interfaz personalizada.
- [**AbsoluteLayout** (RELEASE230)](https://mvnrepository.com/artifact/org.netbeans.external/AbsoluteLayout): Diseño específico de la interfaz.
