package dev.jpineda.datastore;

import java.util.List;

public class Main {
    static void main() {
        DataStore<String, User> userStore = new DataStore<>();

        try {
            userStore.add("1", new User("1", "Alice"));
            userStore.add("2", new User("2", "Bob"));
            userStore.add("3", new User("3", "Charlie"));

            // userStore.add("4", null);

            System.out.println("Found user: " + userStore.find("2"));
            System.out.println("Removed user: " + userStore.remove("2"));
            System.out.println("Found user: " + userStore.find("2"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        List<User> users = userStore.getAll();
        System.out.println("users = " + users);
    }
}
