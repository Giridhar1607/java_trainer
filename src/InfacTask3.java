interface Flyable {
    void fly();
}
interface Swimmable{
    void swim();
}

static class Duck implements Flyable, Swimmable{
    public void fly(){
        System.out.println("Duck is Flying");
    }
    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
}

static class Fish implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Fish is swimming");
    }
}

static class Eagle implements Flyable{
    @Override
    public void fly(){
        System.out.println("Eagle is Flying");
    }
}

public static void main(String[] args){
    Duck duck =new Duck();
    duck.fly();
    duck.swim();

    Fish fish=new Fish();
    fish.swim();

    Eagle eagle= new Eagle();
    eagle.fly();
}