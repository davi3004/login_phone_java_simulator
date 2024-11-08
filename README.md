# login_phone_java_simulator

> [!IMPORTANT]
> Este simulador de inicio de sesión usa Maven y un Look and Feel personalizado (FlatLaf). Usese JDK 23 y NetBeans IDE 23.

Si se desea ejecutar el proyecto sin descragrar el repositorio completo es impirtant añadir lo siguiente al `pom.xml`. Recurde que este proyecto usa Maven.
```xml
 <dependency>
  <groupId>com.formdev</groupId>
  <artifactId>flatlaf-intellij-themes</artifactId>
  <version>3.5.2</version>
</dependency>
<dependency>
  <groupId>com.formdev</groupId>
  <artifactId>flatlaf</artifactId>
  <version>3.5.2</version>
</dependency>
```
También es importante ajustar el código de a cuerdo a la nueva distribución de carpetas (si es que no se descarga el repositorio completo), ajustanto así cada uno de los archivos descargados por separado.
