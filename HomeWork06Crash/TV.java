//Телевизор
public class TV {
    // поля - компания-производитель и модель телевизора
    private final String company;
    private final String model;
    // массив каналов, которые будут показыватся в этом телевизоре
    private Channel[] channels;
    private final int channelCount;
    // ссылка на пульт, который управляет Телевизором
    private RemoteController remoteController;

    // конструктор - принимает только модель и номер, потому что изначально
    // мы не знаем, какой водитель будет управлять автобусом
    public TV(String company, String model) {
        this.company = company;
        this.model = model;
        this.channels = new Channel[9];
        this.channelCount = 0;
    }

    // метод пульта
    public void setRemoteControl(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public Program switchChannel(int index) {
        return this.channels[index].getRandomProgram();
    }

//    // метод для того, чтобы посадить в автобус пассажира
//    public void letPassengerIn(Passenger passenger) {
//        if (this.passengersCount < passengers.length) {
//            this.passengers[passengersCount] = passenger;
//            passengersCount++;
//        } else {
//            System.err.println("Мест больше нет!");
//        }
//    }
//
//    // метод, который позволяет автобусу ехать
//    public void go() {
//        System.out.println("Автобус под номером " + number + " поехал с водителем " + this.driver.getFirstName());
//        for (int i = 0; i < passengersCount; i++) {
//            System.out.println(passengers[i].getFirstName() + " едет с нами!");
//        }
//    }

}
