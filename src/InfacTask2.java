interface Animal {
    void makeSound();
}

    static class Dog implements Animal{
        @Override
        public void makeSound(){
            System.out.println("Dog Sound: Woof Woof!");
        }
    }

    static class Cat implements Animal{
        @Override
        public void makeSound(){
            System.out.println("Cat Sound: Meow!");
        }
    }

    static class Cow implements Animal{
        @Override
        public void makeSound(){
            System.out.println("Cow Sound: Moo!");
        }
    }
    public static void main(String[] args){
        Animal[] animals=new Animal[3];
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Cow();

        for(Animal animal:animals){
            animal.makeSound();
        }
    }

