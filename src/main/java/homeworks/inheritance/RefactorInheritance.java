package homeworks.inheritance;

public class RefactorInheritance {

    public void processing(Book book) {
//        do something with book
    }

    public void processing(Article article) {


//        do something with article

//        Заменить параметры на класс Reference, предложить рефакторинг
    }

}

class Reference {
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private Boolean isUpdated;
    private int year;
    private int volum;

    public Reference(String author1, String author2, String author3,
                     String author4, Boolean isUpdated, int year, int volum) {
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.isUpdated = isUpdated;
        this.year = year;
        this.volum = volum;
    }
}

class Book extends Reference {
    private int countOfpages;
    private String nameBook;

    public Book(String author1, String author2, String author3, String author4,
                Boolean isUpdated, int year, int volum, int countOfpages, String nameBook) {
        super(author1, author2, author3, author4, isUpdated, year, volum);
        this.countOfpages = countOfpages;
        this.nameBook = nameBook;
    }

    public void setCountOfpages(int countOfpages) {
        this.countOfpages = countOfpages;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}

class Article extends Reference {
    private int startPage;
    private int endPage;
    private String nameArticle;

    public Article(String author1, String author2, String author3, String author4, Boolean isUpdated,
                   int year, int volum, int startPage, int endPage, String nameArticle) {
        super(author1, author2, author3, author4, isUpdated, year, volum);
        this.startPage = startPage;
        this.endPage = endPage;
        this.nameArticle = nameArticle;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }
}
