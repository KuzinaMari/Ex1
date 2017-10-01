package MyProgect;

public class Main {
    private static int[] P ;

    public static void main(String[] args) {

        Result res = findMaxSub( P );
        System.out.println( res.toString() );

    }

    public static void setP(int[] p) {
        P = p;
    }

    public static Result findMaxSub(int[] prices ){
        P = prices;
        int p0 = P[0];
        int p1 = P[1];
        int minI = p0 < p1 ? 0 : 1;
        int minP = prices[ minI ]; //минимум во всём массиве
        int minInd = 0;
        int maxInd = 1;
        int min = p0;
        int max = p1;
        int delta = p1 - p0;

        for( int imax = 2; imax < prices.length; imax++ ){
            int last = prices[ imax ];
            if( last - minP > delta ){ //если подмассив с последним элементом больше текущего
                min = minP; //минимум теперь - это минимум во всём массиве
                max = last; //а максимум - просто последний, иначе бы максимальным
                  //подмассивом был бы просто максимальный в предыдущем [0..imax-1]
                minInd = minI;
                maxInd = imax;
            }
            delta = max - min;
            if( last < minP ){ //это одновременно мы ищем минимальный элемент
                minP = last;
                minI = imax;
            }
        }

        return new Result( minI, maxInd, minInd, minP, min, max, delta );
    }

}
