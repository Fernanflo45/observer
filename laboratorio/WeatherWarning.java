// WeatherWarning.java
public class WeatherWarning implements Observer {
    private static final int THRESHOLD = 30;

    @Override
    public void update(int temperature) {
        if (temperature > THRESHOLD) {
            System.out.println("Weather warning! High temperature detected: " + temperature);
        }
    }
}