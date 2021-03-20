public class Main {

    public static void main (String[] args) {

        //телевизор
        TV tv = new TV("Sony", "XtraShiny");
        //пульт
        RemoteController controller = new RemoteController();
        tv.setRemoteControl(controller);
        controller.setTV(tv);


        //каналы
        Channel channel1 = new Channel("Спортивный");
        Channel channel2 = new Channel("Интерактивный");
        Channel channel3 = new Channel("Анонимный");
        Channel channel4 = new Channel("Вариативный");
        Channel channel5 = new Channel("Ленивый");
        Channel channel6 = new Channel("Сильный");
        Channel channel7 = new Channel("Слабый");
        Channel channel8 = new Channel("Важный");
        Channel channel9 = new Channel("Интимный");
        Channel channel10 = new Channel("Спорный");
        Channel[] channels = {channel1, channel2, channel3, channel4, channel5, channel6, channel7, channel8, channel9, channel10};
        tv.setChannels(channels);

        //программы
        Program program1 = new Program("Спорт");
        Program program2 = new Program("Музыкальная программа");
        Program program3 = new Program("Реклама1");
        Program program4 = new Program("Реклама2");
        Program program5 = new Program("Фильм");
        Program program6 = new Program("Новости");
        Program program7 = new Program("Кулинарное шоу");
        Program program8 = new Program("Вечер с Пупкиным");
        Program program9 = new Program("Доброй ночи программисты");
        Program program10 = new Program("Реалити шоу");


        Program[] programsAtChannel1 = {program1, program2, program3};
        channel1.setPrograms(programsAtChannel1);
        Program[] programsAtChannel2 = {program4, program5, program6};
        channel1.setPrograms(programsAtChannel2);
        Program[] programsAtChannel3 = {program7, program8, program9, program10};
        channel1.setPrograms(programsAtChannel3);

        System.out.println("Сегодня на канале " + channel1 + ":" + programsAtChannel1); //"1.Спорт Сегодня" , "2." + program1, "3." + program2, "4." + program3
        System.out.println("Сегодня на канале " + channel2 + ":" + programsAtChannel2);
        System.out.println("Сегодня на канале " + channel3 + ":" + programsAtChannel3);

        tv.switchChannel(1);
        System.out.println(tv.switchChannel(1));
//        System.out.println(channel4);
//        System.out.println(channel5);
//        System.out.println(channel6);
//        System.out.println(channel7);
//        System.out.println(channel8);
//        System.out.println(channel9);
//        System.out.println(channel10);

    }

}
