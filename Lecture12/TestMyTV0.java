public class TestMyTV0 { /* testing class */
    static void print_tv(MyTV0 t) {
        if (t.isOn()) System.out.println("CH:"+t.getChannel()+" VOL:"+t.getVolume());
        else  System.out.println("TV_OFF");
    }

    public static void main(String args[]) {
        MyTV2 t = new MyTV2(); // initially, MIN_CHANNEL 1 MIN_VOLUME 0

        t.setChannel(100); // OFF, ignored
        t.setVolume(0); // OFF, ignored
        print_tv(t); // TV_OFF

        t.turnOnOff(); // ON default 1 1
        t.raiseChannel(); // 2 1
        t.raiseVolume(); // 2 2
        print_tv(t); // CH 2 VOL 2

        t.setChannel(10); // 10 2
        t.setVolume(100); // 10 100
        t.lowerChannel(); // 9 100
        t.lowerVolume(); // 9 99
        print_tv(t); // CH 9 VOL 99

        t.turnOnOff(); // OFF
        t.lowerChannel(); // OFF, ignored
        t.lowerVolume(); // OFF, ignored
        print_tv(t); // TV_OFF

        t.turnOnOff(); // ON 9 99
        t.setChannel(50); // 50 99
        print_tv(t); // CH 50 VOL 99
        t.gotoPrevChannel(); // 9 99
        print_tv(t); // CH 9 VOL 99
        t.gotoPrevChannel(); // 50 99
        print_tv(t); // CH 50 VOL 99
        t.lowerChannel(); // 49 99
        t.lowerChannel(); // 48 99
        print_tv(t); // CH 48 VOL 99
        t.gotoPrevChannel(); // 49 99
        print_tv(t); // CH 49 VOL 99
        t.gotoPrevChannel(); // 48 99
        print_tv(t); // CH 48 VOL 99
    }
}


class MyTV0 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    public static final int MAX_CHANNEL = 100;
    public static final int MIN_CHANNEL = 1;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 1;

    protected MyTV0() { isPowerOn = false; channel = MIN_CHANNEL; volume = MIN_VOLUME; }

    public boolean isOn() { return isPowerOn; }
    public void turnOn() { isPowerOn = true; }
    public void turnOff() { isPowerOn = false; }
    public int getChannel() { return channel; }
    public boolean setChannel(int channel) {
        if (isPowerOn && channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
            this.channel = channel; return true;
        } else return false;
    }
    public int getVolume() { return volume; }
    public boolean setVolume(int volume) {
        if (isPowerOn && volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume; return true;
        } else return false;
    }
}

class MyTV1 extends MyTV0 {
    public void turnOnOff() { if ( isOn() ) turnOff(); else turnOn(); }
    public void lowerChannel() { { setChannel(getChannel()-1); } }
    public void raiseChannel() { { setChannel(getChannel()+1); } }
    public void lowerVolume() { { setVolume(getVolume()-1); } }
    public void raiseVolume() { { setVolume(getVolume()+1); } }
}

class MyTV2 extends MyTV1 {
    protected int previousChannel;

    public boolean gotoPrevChannel() { return setChannel(previousChannel); }

    @Override
    public boolean setChannel(int channel) {
        if (this.isOn() && channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
            int tmp = getChannel(); super.setChannel(channel);
            previousChannel = tmp; return true;
        } else return false;
    }

}
