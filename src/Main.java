public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 55;
        int height = 165;
        int index = service.calculate(weight, height);
        System.out.println(index);
     }
}