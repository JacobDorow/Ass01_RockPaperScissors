import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String playerAChoice;
        String playerBChoice;
        boolean stillPlaying = true;
        String continuePlaying;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Player A, input either (R)ock, (P)aper, or (S)cissors:");
            playerAChoice = in.nextLine();

            System.out.println("Player B, input either (R)ock, (P)aper, or (S)cissors:");
            playerBChoice = in.nextLine();

            if (playerAChoice.equalsIgnoreCase("R")) {
                if (playerBChoice.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie R x R");
                } else if (playerBChoice.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock: Player B wins");
                } else {
                    System.out.println("Rock breaks Scissors: Player A wins");
                }
            } else if (playerAChoice.equalsIgnoreCase("P")) {
                if (playerBChoice.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie P x P");
                } else if (playerBChoice.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock: Player A wins");
                } else {
                    System.out.println("Scissors cut Paper: Player B wins");
                }
            } else if (playerAChoice.equalsIgnoreCase("S")) {
                if (playerBChoice.equalsIgnoreCase("S")) {
                    System.out.println("It's a tie S x S");
                } else if (playerBChoice.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper: Player A wins");
                } else {
                    System.out.println("Rock breaks Scissors: Player B wins");
                }
            } else {
                System.out.println("Please only input R, P, or S.");
                stillPlaying = false;
                stillPlaying = true;
            }
            System.out.println("Do you want to play again? [Y/N]");
            continuePlaying = in.nextLine();
            if (continuePlaying.equalsIgnoreCase("Y"))
            {
                continue;
            }
            else if (continuePlaying.equalsIgnoreCase("N"))
            {
                System.out.println("Thanks for playing.");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid Input. Exiting Game");
                System.exit(0);
            }
        }
        while (stillPlaying == true);
    }
}
