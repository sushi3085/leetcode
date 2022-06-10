import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        for(int i=0; i<1000000000; ++i){

        }
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(TimeUnit.MILLISECONDS.convert(end-start, TimeUnit.NANOSECONDS));
    }
}
