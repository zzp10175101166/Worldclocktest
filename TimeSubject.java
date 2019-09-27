import java.util.HashMap;
import java.util.Map;

public abstract class TimeSubject {

    protected Map<String, Clock> clocksMap = new HashMap<>();

    /**
     * 加入一个时钟
     *
     * @param name
     *            时钟名
     * @param clock
     *            时钟对象
     */
    public void attach(String name, Clock clock) {
        clocksMap.put(name, clock);
    }

    /**
     * 删除一个时钟
     *
     * @param name
     *            时钟名
     */
    public void detach(String name) {
        clocksMap.remove(name);
    }

    /**
     * 更新所有时钟的时间
     */
    public abstract void notifyAllClocks();
}