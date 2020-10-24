public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 172;
        int weight = 58;
        float index = service.calculate(height, weight);
        System.out.printf("Ваш индекс %.1f %n", index);
    }
}
