public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int newHeight = 172;
        int newWeight = 58;
        float index = service.calculate(newHeight, newWeight);
        System.out.printf("Ваш индекс %.1f %n", index);
    }
}
