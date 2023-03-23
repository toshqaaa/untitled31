public class Email implements Notifier{

    @Override
    public void alert(String condition) {
        if ("Солнечно".equals(condition)) {
            System.out.println("Солнечно");
        }
    }
}
