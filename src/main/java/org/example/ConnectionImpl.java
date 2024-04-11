package org.example;

public class ConnectionImpl implements Connection {
    public User2 createUserById(int id, String name, int age) {
        if (id < 0)
            throw new IllegalArgumentException("id must not be negative");
        if (age < 0)
            throw new IllegalArgumentException("age must not be negative");

        name.length();

        User2 user = new User2();
        user.id(id);
        user.name(name);
        user.age(age);

        return user;
    }
}
