package pro.sky.homework_33.model;

import java.util.Objects;

public class User {

    private final String name;
    private final int age;
    private final boolean male;

    public User(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && male == user.male && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, male);
    }

    @Override
    public String toString() {
        return "User: \n" +
                "name - " + getName() + '\n' +
                ", age - " + getAge() + " years old\n" +
                ", male - " + (isMale()? "man": "woman");
    }
}
