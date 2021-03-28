package ru.sofronov01;

public class User {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;
    private boolean worker = false;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", worker=" + worker +
                '}';
    }

    static class Builder {
        private final User user;

        public Builder() {
            user = new User();
        }

        public Builder setFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            user.age = age;
            return this;
        }

        public Builder setWorker(boolean worker) {
            user.worker = worker;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
