public class Clock {

    private int localTime = 0;// 时钟的本地时间
    protected int UTC_OFFSET = 0;// 时钟相对于UTC时间的延迟

    /**
     * @param UTC_OFFSET
     *            时钟所在地区相对于UTC时间的延迟，默认为0
     */
    public Clock(int UTC_OFFSET) {
        this.UTC_OFFSET = UTC_OFFSET;
    }

    public int getLocalTime() {
        return localTime;
    }

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
    }

    /**
     * 由UTC时间得到本时钟的本地时间
     *
     * @param utcZeroTime
     */
    public int toLocalTime(int utcZeroTime) {
        return (utcZeroTime + UTC_OFFSET + 24) % 24;
    }
}