// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();
        
        // Crear instancias de los observadores
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();
        
        // Agregar observadores a la estación meteorológica
        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);
        
        // Cambiar la temperatura dos veces
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(32);
    }
}