package com.security.tools;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Usuario {

    private String id;
    private String nombre;
    private String correo;
    private int edad;
    private String passwordHash;

    public Usuario(String nombre, String correo, int edad, String passwordHash) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.passwordHash = passwordHash;
        this.id = generarIdUnico();
    }

    public String getId() {
        return id;
    }

    public static String toCsvLine(String nombre, String correo, int edad, String passwordHash) {
        String id = new Usuario(nombre, correo, edad, passwordHash).getId();

        return String.format("%s,%s,%s,%d,%s%n", id, nombre, correo, edad, passwordHash);
    }

    public static boolean existeUsuario(String correo) {

        File archivo = new File("usuarios.txt");

        if (!archivo.exists()) {
            System.err.println("Archivo 'usuarios.txt' no encontrado.");
            return false;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length < 5) {
                    System.err.println("Línea mal formateada: " + line);
                    continue;
                }
                if (datos.length >= 3 && datos[2].equals(correo)) {
                    return true;
                }
            }

        }
        catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return false;
    }

    public static boolean validarCredenciales(String correo, String passwordHash) {

        File archivo = new File("usuarios.txt");

        if (!archivo.exists()) {
            System.err.println("El archivo 'usuarios.txt' no existe.");
            return false;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 5 && datos[2].equals(correo) && datos[4].trim().equals(passwordHash)) {
                    return true;
                }
            }

        }
        catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return false;
        }

        return false;
    }

    public static String getNombreUsuario(String correo) {

        File archivo = new File("usuarios.txt");

        if (!archivo.exists()) {
            System.err.println("El archivo 'usuarios.txt' no existe.");
            return "";
        }

        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 3 && datos[2].equals(correo)) {
                    return datos[1];
                }
            }

        }
        catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }

        System.err.println("Usuario con correo " + correo + " no encontrado.");
        return "";

    }

    private String generarIdUnico() {

        Set<String> idsExistentes = cargarIdsExistentes();
        String nuevoId;
        int intentos = 0;
        int maxIntentos = 1000;

        do {
            if (intentos >= maxIntentos) {
                throw new RuntimeException("No se pudo generar un ID único tras múltiples intentos.");
            }
            nuevoId = generarIdAleatorio();
            intentos++;
        }
        while (idsExistentes.contains(nuevoId));

        return nuevoId;
    }

    private String generarIdAleatorio() {

        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder id = new StringBuilder(8);
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            id.append(caracteresPermitidos.charAt(random.nextInt(caracteresPermitidos.length())));
        }

        return id.toString();
    }

    private Set<String> cargarIdsExistentes() {

        Set<String> ids = new HashSet<>();
        File archivo = new File("usuarios.txt");

        if (!archivo.exists()) {
            System.err.println("Archivo 'usuarios.txt' no encontrado. No existen usuarios previos.");
            return ids;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 5) {
                    ids.add(datos[0]);
                }
            }

        }
        catch (IOException e) {
            System.err.println("Error al cargar IDs existentes: " + e.getMessage());
        }

        return ids;
    }

}
