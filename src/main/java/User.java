import java.util.Objects;

public class User {


    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getName().equals(user.getName()) &&
                age.equals(user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age);
    }

    String name;
    Integer age;

}
