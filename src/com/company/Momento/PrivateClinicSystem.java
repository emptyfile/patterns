package com.company.Momento;

public class PrivateClinicSystem {
    private String startupConfig;
    private String currentConfig;
    private String dataBaseConfig;

    private static PrivateClinicSystem instance = new PrivateClinicSystem();

    public static PrivateClinicSystem getInstance(){
        return instance;
    }

    public PrivateClinicSystem() {
    }

    public void setConfig(String startupConfig, String currentConfig, String dataBaseConfig){
        this.startupConfig = startupConfig;
        this.currentConfig = currentConfig;
        this.dataBaseConfig = dataBaseConfig;
    }

    public RollbackPoint createRollbackPoint(){
        return new RollbackPoint(startupConfig,currentConfig,dataBaseConfig);
    }

    public void rollback(RollbackPoint point){
        String[] config = point.getSystemConfig();
        setConfig(config[0],config[1],config[2]);
    }

    public void setStartupConfig(String startupConfig) {
        this.startupConfig = startupConfig;
    }

    public void setCurrentConfig(String currentConfig) {
        this.currentConfig = currentConfig;
    }

    public void setDataBaseConfig(String dataBaseConfig) {
        this.dataBaseConfig = dataBaseConfig;
    }

    @Override
    public String toString() {
        return "PrivateClinicSystem{" +
                "startupConfig='" + startupConfig + '\'' +
                ", currentConfig='" + currentConfig + '\'' +
                ", dataBaseConfig='" + dataBaseConfig + '\'' +
                '}';
    }
}
