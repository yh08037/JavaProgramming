public class UseTV2 {
    public static void main(String[] args) {
        TV2 tv = new TV2(60, 5);
        tv.turnToggle();    tv.gotoPreviousChannel();
        System.out.println(tv.getState());
        tv.setChannel(75);  tv.channelUp(); tv.channelUp();
        tv.volumeUp();  tv.gotoPreviousChannel();
        System.out.println(tv.getState());
        tv.turnToggle();
        tv.channelUp(); tv.gotoPreviousChannel();
        System.out.println(tv.getState());
        tv.turnToggle();
        tv.setVolume(2);    tv.volumeDown();    tv.volumeDown();
        tv.channelDown();   tv.channelDown();
        tv.gotoPreviousChannel();
        System.out.println(tv.getState());
    }
}
