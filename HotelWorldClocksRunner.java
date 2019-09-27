public class HotelWorldClocksRunner {
    public static void main(String[] args) {
        UtcTime utcTime = new UtcTime();
        utcTime.attach("北京", new Clock(8));
        utcTime.attach("伦敦", new Clock(0));
        utcTime.attach("莫斯科", new Clock(4));
        utcTime.attach("悉尼", new Clock(10));
        utcTime.attach("纽约", new Clock(-5));

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);

        phoneClock.setLocalTime(9);
        utcTime.printTimeOfAllClocks();
    }
}