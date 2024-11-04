package service;

public class ConfigManager {
    private static ConfigManager instance;

    private ConfigManager() {
        // Загрузка конфигурации
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
}

