package MyProgect;

/**
 * Created by 1 on 15.09.2017.
 */
public class Result {
    private int minI;
    private int maxInd;
    private int minInd;
    private int minP;

    public int getMinI() {
        return minI;
    }

    public int getMaxInd() {
        return maxInd;
    }

    public int getMinInd() {
        return minInd;
    }

    public int getMinP() {
        return minP;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getDelta() {
        return delta;
    }

    private int min;
    private int max;
    private int delta;

    public Result(int minI, int maxInd, int minInd, int minP, int min, int max, int delta) {
        this.minI = minI;
        this.maxInd = maxInd;
        this.minInd = minInd;
        this.minP = minP;
        this.min = min;
        this.max = max;
        this.delta = delta;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("День покупки ");
        sb.append(minInd);
        sb.append(", ");
        sb.append("День продажи ");
        sb.append(maxInd);
        sb.append(", ");
        sb.append("Стоимость в день покупки ");
        sb.append(min);
        sb.append(", ");
        sb.append("Стоимость в день продажи ");
        sb.append(max);
        sb.append(", ");
        sb.append("Выгода ");
        sb.append(delta);
        return sb.toString();
    }
}
