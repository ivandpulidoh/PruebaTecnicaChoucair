package starter.utils;

public class WaitTime {

    public static void explicitWait(Integer milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
