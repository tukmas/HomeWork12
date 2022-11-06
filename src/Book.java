public class Book {
    private String title;
    private Author author;
    private int publicationYear;
    public Book (String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setTitle() {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear ) {
        this.publicationYear = publicationYear;
    }

}
