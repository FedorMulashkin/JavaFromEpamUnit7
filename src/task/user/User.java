package task.user;

import java.util.ArrayList;
import java.util.Comparator;

public class User {
    private static int idGenerator = 0;
    private static ArrayList<User> allUsers = new ArrayList<>();
    private int id;
    private String name;
    private int age;
    private String country;

    public User(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
        id = ++idGenerator;
        allUsers.add(this);
    }

    public static ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        if (getAge() != user.getAge()) return false;
        if (!getName().equals(user.getName())) return false;
        return getCountry().equals(user.getCountry());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getCountry().hashCode();
        return result;
    }

    /* Оказались ненужными для задачи
    public static class compareByAge implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    public static class compareByCountry implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            String country1 = o1.getCountry();
            String country2 = o2.getCountry();
            return country1.compareToIgnoreCase(country2);
        }
    }
    */
}
