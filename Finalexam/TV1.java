class TV0 {
  private int channel = 1; // Default channel is 1
  private int volumeLevel = 1; // Default volume level is 1
  private boolean on = false; // By default TV is off

  public boolean isTurnedOn() { return on; }
  public int getChannel() { return channel; }
  public int getVolume() { return volumeLevel; }

  public void power(boolean on) { this.on = on; }

  // Requirements: if TV is off, neither channel nor volume change is possible
  // If newChannel is outside of 1-120, do not change the channel
  protected void setChannel(int newChannel) {
    if (on && newChannel >= 1 && newChannel <= 120)
      channel = newChannel;
  }
  // Requirements: if TV is off, neither channel nor volume change is possible
  // If newVolumeLevel is outside of 1-7, do not change the volume
  protected void setVolume(int newVolumeLevel) {
    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
      volumeLevel = newVolumeLevel;
  }
}

public class TV1 extends TV0 {
  public void turnOnOff() {
    // Toggling: If TV is on, turn off; if off, turn on.
    // Note: the field on of TV0 is private
    power(!isTurnedOn());
  }

  public void channelUp() {
    // Increase channel by 1, Note: the field channel of TV0 is private
    setChannel(getChannel() + 1);
  }
  public void channelDown() {
    // Decrease channel by 1, Note: the field channel of TV0 is private
    setChannel(getChannel() - 1);
  }
  public void volumeUp() {
    // Increase volume by 1, Note: the field volumeLevel of TV0 is private
    setVolume(getVolume() + 1);
  }
  public void volumeDown() {
    // Decrease volume by 1, Note: the field volumeLevel of TV0 is private
    setVolume(getVolume() - 1);
  }
}
