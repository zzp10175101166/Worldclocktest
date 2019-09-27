public class PhoneClock extends Clock {

    private UtcTime utcTime;// UtcTime对象

    /**
     * @param UTC_OFFSET
     *            时钟所在地区相对于UTC时间的延迟，默认为0
     */
    public PhoneClock(int UTC_OFFSET) {
        super(UTC_OFFSET);
    }

    public TimeSubject getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }

    /**
     * 设置时钟的本地时间
     *
     * @param localTime
     *            本地时间
     */
    public void setLocalTime(int localTime) {
        super.setLocalTime(localTime);
        utcTime.setUtcZeroTime(localTime - super.UTC_OFFSET);
    }
}