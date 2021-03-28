package sofronov01;

import java.util.Random;

//канал
public class Channel {

    private TV tv;
    private final String channelName;

    // массив программ, которые есть показывают на этом канале
    private Program[] programs;
    private int programCount;
    private Random random = new Random();

    public Channel(String channelName) {
        this.channelName = channelName;
        this.programs = new Program[9];
        this.programCount = 0;
    }

    public String getChannelName() {

        return channelName;
    }

    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }

    public Program getRandomProgram() {

        return programs[random.nextInt(programs.length)];
    }

    @Override
    public String toString() {
        return channelName;
    }
}
