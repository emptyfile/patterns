package com.company.Momento;

public class RollbackPoint {
    private static String startupConfig;
    private static String currentConfig;
    private static String dataBaseConfig;

    public RollbackPoint(String startupConfig, String currentConfig, String dataBaseConfig) {
        this.startupConfig = startupConfig;
        this.currentConfig = currentConfig;
        this.dataBaseConfig = dataBaseConfig;
    }

    public static String[] getSystemConfig() {
        return new String[]{startupConfig, currentConfig, dataBaseConfig};
    }
}
