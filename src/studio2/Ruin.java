public class Ruin {
    public static void main(String[] args){
        int startAmount = 5;
        double winChance = 0.56;
        int winLimit = 10;
        int win = 0;
        int totalSimulations;
        for (totalSimulations = 0; totalSimulations < 500; totalSimulations++ ) { 
            while(startAmount < winLimit && startAmount > 0) {
                double j = Math.random();
                if (j < winChance){
                    startAmount++;
                }else{
                    startAmount--;
                }
            }

            if (startAmount == winLimit){
                System.out.println("Simulation " + totalSimulations + ": you win!");
                win++;
            }else{
                System.out.println("Simulation " + totalSimulations + ": you lose!");
            }
            startAmount = 5;   

        }
        System.out.println("\nWins: " + win + ". Simulation:" + totalSimulations);
        double a = (1 - winChance)/(winChance);    
        double z = (Math.pow(a, startAmount) - Math.pow(a, winLimit))/(1 - Math.pow(a, winLimit));
        double j = 1 - win/(double)totalSimulations;
        System.out.println("Ruin Rate from Simulation: " + j + ". Expected Ruin Rate: " + z);


    }
}


