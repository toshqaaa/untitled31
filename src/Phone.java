public class Phone implements Notifier {


    @Override
    public void alert(String condition) {
        if ("Дождь".equals(condition)) {
            System.out.println("Дождь");
        }
    }
}
