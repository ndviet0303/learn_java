package com.mycompany.app.books;

public class E5P93 {
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
        E5P93 e5p93 = new E5P93();
        Dog dog1 = e5p93.new Dog("spot", "Ruff!");
        Dog dog2 = e5p93.new Dog("scruffy", "Wurf!");
        System.out.println(dog1.getName() + " says " + dog1.getSays());
        System.out.println(dog2.getName() + " says " + dog2.getSays());
    }
}
