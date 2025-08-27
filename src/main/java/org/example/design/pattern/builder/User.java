package org.example.design.pattern.builder;

public class User {

    private String name;
    private String age;
    private String address;
    private String email;


    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {

        String name;
        String age;
        String address;
        String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setAge(String age) {
            this.age = age;
            return this;
        }


        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }


        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
