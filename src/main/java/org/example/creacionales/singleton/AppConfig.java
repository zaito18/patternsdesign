package org.example.creacionales.singleton;

public class AppConfig {

    // La única instancia de la clase, inicialmente es null
    private static AppConfig instance;

    private String databaseUrl;
    private String databaseUser;
    private String databasePassword;

    // Constructor privado para evitar la creación de instancias fuera de la clase
    private AppConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        this.databaseUser = "user";
        this.databasePassword = "password";
        System.out.println("Configuración de la aplicación inicializada.");
    }

    // Método público para obtener la instancia única de la clase
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }
}