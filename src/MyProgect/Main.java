package MyProgect;

public class Main {
    public static int[] P = {11, 12, 3, 7, 33, 2, 41, 1};

    public static void main(String[] args) {

        System.out.println(fun(7));

    }

    public static Prev fun(int imax) {
        if (imax == 0) {
            throw new RuntimeException("incorrect index");
        }
        Prev res = new Prev();
        if (imax == 1) {
            int p0 = P[0];
            int p1 = P[1];
            int minIndex = p0 < p1 ? 0 : 1;
            res.minI = minIndex;
            res.minP = P[minIndex];
            res.min = p0;
            res.max = p1;
            res.delta = p1 - p0;
            return res;
        }
        Prev prev = fun(imax - 1);
        int minIndex2 = P[imax] < prev.minP ? minIndex2 = imax : prev.minI;
        int min = P[imax] - prev.minP > prev.delta ? prev.minP : prev.min;
        int max = P[imax] - prev.minP > prev.delta ? P[imax] : prev.max;
        int maxIndex2= (P[imax] > prev.max)&&(P[imax] - prev.minP > prev.delta) ? imax : prev.maxInd;
        int minIndex3= (P[imax] < prev.minP)&&(P[imax] - prev.minP > prev.delta) ? imax : prev.minI;
        res.minI = minIndex2;
        res.minP = P[minIndex2];
        res.maxInd = maxIndex2;
        res.minInd = minIndex3;
        res.min = min;
        res.max = max;
        res.delta = max - min;
        return res;
    }
}