# Actividad2

# Autor ???

Este proyecto Java es una aplicación de consola desarrollada usando **Maven**. Está pensado como una práctica para trabajar con las librerías externas **Commons CLI** (para manejar argumentos desde consola) y **Log4j** (para registrar eventos).  

---

## 🎯 Objetivo

Permitir que el usuario ingrese su nombre como argumento al ejecutar el `.jar` generado, para que el sistema lo salude e informe en el log que el programa fue ejecutado por ese usuario.

---

## ⚙️ Tecnologías y dependencias

- Java 8 o superior
- Maven
- [Commons CLI 1.5.0](https://commons.apache.org/proper/commons-cli/)
- [Log4j 1.2.17](https://logging.apache.org/log4j/1.2/)

---

## 📁 Estructura del proyecto

```
Actividad2/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── ar/edu/udeci/pv/App.java
        └── resources/
            └── log4j.properties
```

---

## 🚀 ¿Cómo usar el proyecto?

### 1. Cloná o descargá el proyecto

Si descargaste el ZIP, descomprimilo. Si lo clonaste con Git:

```bash
git clone <repo-url>
cd Actividad2
```

### 2. Compilación con Maven

```bash
mvn clean package
```

Esto genera el siguiente archivo ejecutable:

```
target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### 3. Ejecutar la aplicación

Podés ejecutar el `.jar` con:

```bash
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar -n Juan
```

Verás:

```
¡Hola, Juan!
```

Y el siguiente log (por consola):

```
HH:mm:ss INFO  App - La aplicación fue ejecutada por: Juan
```

Si querés ayuda con los parámetros:

```bash
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar -h
```

---

## 🧠 Explicación de la lógica

1. **Commons CLI** analiza los argumentos que se pasen desde la consola.
2. Se permite ingresar un nombre (`-n` o `--nombre`) o pedir ayuda (`-h` o `--help`).
3. **Log4j** registra la ejecución en consola.
4. Se muestra el mensaje personalizado por consola.

---

## 📌 Autor

Este proyecto fue creado como actividad para entender cómo:

- Se estructura un proyecto Maven
- Se usan librerías externas
- Se empaqueta un `.jar` con todas sus dependencias
