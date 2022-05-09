package task;

import task.anagram.Anagram;
import task.mod.ModByNumber;
import task.mod.ModByNumberImpl;
import task.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        /* task 2
        String s1 = "qwertyqq";
        String s2 = "qqqwerty";
        System.out.println(Anagram.isAnagram(s1, s2));
        */
        /* task 3
        User user1 = new User("Zoro", 21, "Simotsuki");
        User user2 = new User("Robin", 30, "Ohara");
        User user3 = new User("Nami", 20, "Kokoyashi");
        User user4 = new User("Usopp", 19, "Siropa");
        User user5 = new User("Luffy", 19, "Goa Kingdom");
        User user6 = new User("Sanji", 21, "Germa 66");
        User user7 = new User("Chopper", 17, "Drum");
        User user8 = new User("Franky", 36, "Water 7");
        User user9 = new User("Brook", 90, "Namakura");
        User user10 = new User("Jimbei", 46, "Ryugu Kingdom");
        System.out.println(User.getAllUsers());
        ArrayList<User> users = User.getAllUsers();
        users.stream().sorted(Comparator.comparing(User::getCountry)
                .thenComparing(User::getAge))
                .forEach(System.out::println);
                */
        /* task 4
        Predicate<Integer> pred = x -> x % 13 == 0;
         */
        /* task 5
        BiFunction<String, String, String> longestStr = (str1, str2) -> str1.length() > str2.length() ? str1 : str2;
         */
    }
}
