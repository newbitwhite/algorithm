package effective_java.chapter4.item16;

/**
 * 不可变类，公有字段危害有限，但也应该避免
 * @author ：xiaobai
 * @date ：2023/5/9 16:06
 */
public final class Timer {

    private static final int HOURS_PRE_DAY = 24;
    private static final int MINUTE_PRE_HOUR = 60;

    public final int hour;
    public final int minute;

    public Timer(int hour, int minute) {
        if (hour < 0 || hour > HOURS_PRE_DAY){
            throw new IllegalArgumentException("hour ：" + hour );
        }
        if (minute < 0 || minute > MINUTE_PRE_HOUR){
            throw new IllegalArgumentException("minute ：" + minute );
        }
        this.hour = hour;
        this.minute = minute;
    }
}
