//Телевизионные программы
public class Program {
    private Channel channel;
    private final String programName;

    public Program(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {

        return programName;
    }

    @Override
    public String toString() {
        return "Program{" +
                ", programName='" + programName + '\'' +
                '}';
    }
}
