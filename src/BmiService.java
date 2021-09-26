public class BmiService {
    public int calculate(int weight, int height) {
        int index;
        index = 10_000 * weight / (height * height);
        return index;
    }
}
