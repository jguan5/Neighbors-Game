import java.util.Scanner;
public class NeighborsRunner{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Neighbors array = new Neighbors();
        GameBoardInitializer.gameBoard(array);
        for (int i = 0; i < 25; i++){
            int randomInt = NumberGenerator.generate();
            System.out.println("Random number generated: " + randomInt);
            System.out.print("Where would you like to place the number? (row, col) ");
            String input = scan.nextLine();
            while (NumberGenerator.validInput(input) != true){
                System.out.print("Invalid input, Please try again. Ex: (1, 2) ");
                input = scan.nextLine();
            }
            array.inputNumber(randomInt, NumberGenerator.breakRow(input) - 1, NumberGenerator.breakCol(input) - 1);
            GameBoardInitializer.gameBoard(array);
        }
        System.out.println("Your total score is " + array.calculateRows() + array.calculateCols());
    }
}