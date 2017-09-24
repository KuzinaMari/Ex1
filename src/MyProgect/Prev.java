package MyProgect;

/**
 * Created by 1 on 15.09.2017.
 */
public class Prev {
    int minI;
    int maxInd;
    int minInd;
    int minP;
    int min;
    int max;
    int delta;

    public Prev() {

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
