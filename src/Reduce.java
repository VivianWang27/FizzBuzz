public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int step  = 0;
        while (start > 0) {
            boolean even = start % 2 == 0;
            boolean odd = start % 2 == 1;
            if (even){
                start /= 2;
                step++;
            }else {
                start -=1;
                step++;
            }
        }
        System.out.println(step);
    }
}
