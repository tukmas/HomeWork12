public class Book {
    private String title;
    private Author authorName;
    private int publicationYear;
    public Book (String title, Author authorName, int publicationYear) {
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
