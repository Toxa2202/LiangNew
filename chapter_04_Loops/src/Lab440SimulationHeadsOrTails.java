public class Lab440SimulationHeadsOrTails {
    public static void main(String[] args) {
        int heads = 0, tails  = 0, counter = 0;

        while (counter <= 1000000){
            int round = (int) Math.round(Math.random());
            if (round == 1){
                heads++;
            } else {
                tails++;
            }
            counter++;
        }
        System.out.println("Result: \t " + heads + " heads " + " and " + tails + " tails");
    }
}
