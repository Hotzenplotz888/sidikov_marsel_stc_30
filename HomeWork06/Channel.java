//канал
public class Channel {
    private String channelName;

    // массив программ, которые есть показывают на этом канале
    private Program programs[];
    private int programCount;

    public Program(String channelName) {
        this.channelName = channelName;
        this.programs = new Program[9];
        this.programCount = 0;
    }

    public String getChannelName() {
        return channelName;
    }

}