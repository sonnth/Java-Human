public class World {
    public static void main(String[] args) {
        Apple goldApple = new Apple();
        Snake snake = new Snake();
        Human Adam = new Human("Adam",true);
        Human Eva = new Human("Eva",false);
        God god = new God();
        god.say("God said: If you eat, you're dead");
        snake.say("Snake said: You're not dead if you eat");
        Adam.setGender(true);
        Adam.setName("Adam");
        Adam.setAge(24);
        Eva.setGender(false);
        Eva.setName("Eva");
        Eva.setAge(19);
        while(goldApple.isEmpty()){
            System.out.println(Eva.getName() + " take a bite");
            Eva.eat(goldApple.weight);
            goldApple.weight--;
            System.out.println(Adam.getName() + " take a bite");
            Adam.eat(goldApple.weight);
            goldApple.weight--;
        }
        System.out.println("Adam sleeps");
        Adam.sleep();
        System.out.println("Eva sleeps");
        Eva.sleep();
        god.say("God said: Eva, you're hurt when pregnant");
        god.say("God said: Adam, you have to plant tree");
    }
}