public class Book {
    String title;
    String authorName;
    int publicationYear;

    public Book(String title, String authorName, int publicationYear) {
        this.title = title;
        this.authorName = authorName;
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
