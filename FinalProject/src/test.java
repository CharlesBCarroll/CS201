public class test {
    public static void main(String[] args) {
        Dice dice = new Dice(6, 5);
        dice.setCurrentValue(0,5,1051);
        dice.setCurrentValue(1,5,1051);
        dice.setCurrentValue(2,5,1051);
        dice.setCurrentValue(3,5,1051);
        dice.setCurrentValue(4,5,1051);
        System.out.println(dice);
        System.out.println(dice.hasFullHouse());
    }
}
