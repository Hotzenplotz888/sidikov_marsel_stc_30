package ru.sofronov01;

public class Book {

    private String author = null;
    private String bookTitle = null;
    private int publicationDate = 0;
    private int wordCount = 0;
    private boolean original = false;

    @Override
    public String toString() {
        return "Book info: {" +
                "Author = '" + author + '\'' +
                ", title of the Book ='" + bookTitle + '\'' +
                ", date of publication: " + publicationDate +
                ", word count: " + wordCount +
                ", original work: " + original +
                '}';
    }

    static class Builder {
        private final Book book;

        public Builder() { book = new Book(); }

        public Builder setAuthor(String author) {
            book.author = author;
            return this;
        }

        public Builder setBookTitle(String bookTitle) {
            book.bookTitle = bookTitle;
            return this;
        }

        public Builder setPublicationDate(int publicationDate) {
            book.publicationDate = publicationDate;
            return this;
        }

        public Builder setWordCount(int wordCount) {
            book.wordCount = wordCount;
            return this;
        }

        public Builder setOriginal(boolean original) {
            book.original = original;
            return this;
        }

        public Book build() {
            return book;
        }
    }
}

