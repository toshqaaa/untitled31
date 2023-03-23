public class WeatherTracker {
    private String currentCondition;

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void notify(Notifier... notifier) {
        for (Notifier notify : notifier) {
            notify.alert(this.currentCondition);
        }

    }
}
