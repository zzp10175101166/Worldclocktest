public class UtcTime extends TimeSubject {

    private int utcZeroTime = 0;

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    /**
     * 更新所有时钟的时间
     */
    public void notifyAllClocks() {
        for (Clock clock : super.clocksMap.values()) {
            clock.setLocalTime(clock.toLocalTime(utcZeroTime));
        }
    }

    public void printTimeOfAllClocks() {
        for (String name : super.clocksMap.keySet()) {
            Clock clock = super.clocksMap.get(name);
            System.out.println(name + "的当前时间为" + clock.getLocalTime());
        }
    }
}