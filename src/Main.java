public class Main {
    public static void main(String[] args) {
        WeatherTracker weatherTracker = new WeatherTracker();
        weatherTracker.setCurrentCondition("Солнечно");
        weatherTracker.notify(new Email(), new Phone());
    }
}
