package ss4_bai_tap;

public class MainStopWatch {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        for (int i =0 ; i<100000; i++){
            System.out.println("vl");
        }
        long t2 = System.currentTimeMillis();

        System.out.println(" fisrt: "+ stopWatch.start());
        System.out.println(" later : "+ stopWatch.end());
        System.out.println("thời gian : " + stopWatch.getElapsedTime() + " miligiay" );
    }
}
