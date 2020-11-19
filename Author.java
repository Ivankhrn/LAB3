package lab3;

public class Author {
}
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private boolean male;

    public Author(String name, String email, boolean male) {
        this.name = name;
        this.email = email;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMale() {
        return male;
    }

    @Override
    public String toString() {return (name + " " + male + " at " + email);}
}