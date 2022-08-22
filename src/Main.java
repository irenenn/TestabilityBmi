public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double height = 1.72;
        double bmi = service.calculate(weight, height);
        String result = String.format("%.1f", bmi);
        System.out.println("Ваш ИМТ = " + result);

    }
}