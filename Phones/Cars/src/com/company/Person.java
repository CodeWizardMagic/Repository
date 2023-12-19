package com.company;

    public class Person {
        public String fullName;
        public int age;

        public Person(){

        }

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }
        public void talk(){
            System.out.println("Hello, my name is " + fullName + " I'm " + age + " years old");
        }
        public void move(){
            System.out.println(fullName + " is moving ");
        }
    }
