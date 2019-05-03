public class TV2 {
    int channel;
    int volumeLevel;
    boolean on;
    int previousChannel;

    TV2(int ch, int vol) {
        channel = ch;
        volumeLevel = vol;
        on = false;
        previousChannel = ch;
    }

    String getState() {
        String out = "On:" + on;
        if ( on )
            out = out + ", Ch:" + channel + ", Vol:" + volumeLevel;
        return out;
    }

    void turnToggle() {
        on = !on;
    }

    void setChannel(int newChannel) {
        if ( on && newChannel>=1 && newChannel<=120 ) {
            channel = newChannel;
        }
    }

    void gotoPreviousChannel() {
        if ( on ) {
            int tmp = channel;
            channel = previousChannel;
            previousChannel = tmp;
        }
    }

    void setVolume(int newVolumeLevel) {
        if ( on && newVolumeLevel>=1 && newVolumeLevel<=7 ) {
            volumeLevel = newVolumeLevel;
        }
    }

    void channelUp() {
        if ( on ) {
            previousChannel = channel;
            channel++;
            if ( channel == 121 ) channel = 1;
        }
    }

    void channelDown() {
        if ( on ) {
            previousChannel = channel;
            channel--;
            if ( channel == 0 ) channel = 120;
        }
    }

    void volumeUp() {
        if ( on && volumeLevel < 7 ){
            volumeLevel++;
        }
    }

    void volumeDown() {
        if ( on && volumeLevel > 1 ) {
            volumeLevel--;
        }
    }
}
