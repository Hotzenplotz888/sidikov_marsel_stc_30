package ru.sofronov01;


public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setFirstName("Marsel")
                .setLastName("Sidikov")
                .setAge(26)
                .setWorker(true)
                .build();
        System.out.println(user.toString());

        Book book = new Book.Builder()
                .setAuthor("Sir Terry Pratchett")
                .setBookTitle("Watch")
                .setPublicationDate(1989)
                .setWordCount(300000)
                .setOriginal(true)
                .build();
        System.out.println(book.toString());
    }
}
