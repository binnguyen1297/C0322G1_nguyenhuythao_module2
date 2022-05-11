package ss4_bai_tap;


public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start() {
        return  startTime = System.currentTimeMillis();
    }

    public long end() {
        return  endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {

        return endTime -  startTime;
    }


}
