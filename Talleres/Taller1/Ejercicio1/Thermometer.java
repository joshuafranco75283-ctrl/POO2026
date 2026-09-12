public class Thermometer{
    private static final double MIN_TEMP = -50.0;
    private static final double MAX_TEMP = 100.0;

    private double temperature;

    public Thermometer(){
        this.temperature = 0.0;
    }

    private boolean isValidTemperature(double temperature){
        return temperature >= MIN_TEMP && temperature <= MAX_TEMP;
    }

    public boolean setTemperature(double newTemperature){
        if(isValidTemperature(newTemperature)){
            this.temperature = newTemperature;
            return true;
        }
        return false;
    }

    public double getTemperature(){
        return this.temperature;
    }
}