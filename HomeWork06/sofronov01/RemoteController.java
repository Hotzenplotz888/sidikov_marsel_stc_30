package sofronov01;

//пульт
public class RemoteController {

    private TV tv;

    public void setTV(TV tv) {

        this.tv = tv;
    }

    public Program switchChannel(int index) {
        return tv.switchChannel(index);
    }
}
