package lab3;

public class TestA {
}
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author ("Nikolay Gogol", "fire@books.vremya.ru", true);
        System.out.println(a1);
        Author a2 = new Author ("", "cinelit@att.net", true);
        System.out.println(a2);
    }
}