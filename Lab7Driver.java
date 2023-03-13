/*
 * Mayowa 
 * Lab 7
 */

public class Lab7Driver {
    public static void main(String[] args) {
        try{
        GameOfChance<Die> diGameOfChance = new GameOfChance<>();
        diGameOfChance.add(new Die());
        diGameOfChance.add(new Die());
        diGameOfChance.add(new Die());
        System.out.println(diGameOfChance.play());
        System.out.println("is the diegame a winner: " + diGameOfChance.winner());
        }
        catch(Exception e){
            System.out.println("Hey! There are fewer than 2 entries in this Die game!");

        }

        GameOfChance<StepperWheel> stepGameOfChange = new GameOfChance<>();
        stepGameOfChange.add(new StepperWheel(21));
        stepGameOfChange.add(new StepperWheel(21));
        stepGameOfChange.add(new StepperWheel(21));
        System.out.println(stepGameOfChange.play());
        System.out.println("is the stepgame a winner: " + stepGameOfChange.winner());
        
        try{
        GameOfChance<LottoBall> LottoGameOfChance = new GameOfChance<>();
        LottoGameOfChance.add(new LottoBall(99));
        LottoGameOfChance.add(new LottoBall(99));
        LottoGameOfChance.add(new LottoBall(99));
        LottoGameOfChance.add(new LottoBall(99));
        System.out.println(LottoGameOfChance.play());
        System.out.println("is the Lottogame a winner: " + LottoGameOfChance.winner("10 4 56 50"));
        System.out.println("The winning numbers are: " + "10 4 56 50");
        }
        catch(Exception e){
            System.out.println("Hey! There are fewer than 2 entries in this Lotto game!");
        }
    }

}// rename game of change to game of chance
