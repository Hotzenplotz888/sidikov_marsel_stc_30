package sofronov01;

//Телевизионные программы
public class Program {
    private Channel channel;
    private String programName;

    public Program(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    @Override
    public String toString() {
        return programName;
    }
}
