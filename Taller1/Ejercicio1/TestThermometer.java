public class TestThermometer {
    public static void main(String[] args){
        Thermometer myThermometer = new Thermometer();
        
        System.out.println("Temperatura inicial: " + myThermometer.getTemperature() + " C");

        
        double[] testValues = {25.0, -50.0, 100.0, 125.0, -60.0};//valores de prueba
        for(int i = 0; i < testValues.length; i++){
            double  testValue = testValues[i];
            boolean testacepted = myThermometer.setTemperature(testValue);
            if(testacepted){
                System.out.println("Nueva temperatura establecida Correctamente: " + myThermometer.getTemperature() + " C");
            } else {
                System.out.println("Temperatura no establecida por valor fuera de rango: " + testValue + " C");

            }
        }
    }
}
