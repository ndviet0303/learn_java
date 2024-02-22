package com.mycompany.app.books;

public class E6P93 {
    public class Dog {
        private String name;
        private String says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }

        public String getName() {
            return name;
        }

        public String getSays() {
            return says;
        }

    }

    public static void main(String[] args) {
        E6P93 e6p93 = new E6P93();
        Dog dog1 = e6p93.new Dog("spot", "Ruff!");
        Dog dog2 = e6p93.new Dog("scruffy", "Wurf!");
        Dog dogRef = dog1;

        // ==
        print("spot and Ref(==): " + (dog1 == dogRef));
        print("scruffy and Ref(==): " + (dog2 == dogRef));

        // equals
        print("spot and Ref(equals): " + (dog1.equals(dogRef)));
        print("scruffy and Ref(equals): " + (dog2.equals(dogRef)));
    }

    private static void print(String string) {
        System.out.println(string);
    }
}
