public class Book {
    private String title;
    private String Author;
    private int publicationYear;

    public Book(String title, String authorName, int publicationYear) {
        this.title = title;
        this.Author = authorName;
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
