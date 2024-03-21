public class GameBoardInitializer{
    public static void gameBoard(Neighbors array){
        System.out.println("—------------------------------");
        for (int i = 0; i < 4; i++){
            System.out.println("|  " + array.getValue(i, 0) + "  |  " + array.getValue(i, 1) + "  |  " + array.getValue(i, 2) + "  |  " + array.getValue(i, 3) + "  |  " + array.getValue(i, 4) + "  |");
            System.out.println("|-----|-----|-----|-----|-----|");
        }
        System.out.println("|  " + array.getValue(4, 0) + "  |  " + array.getValue(4, 1) + "  |  " + array.getValue(4, 2) + "  |  " + array.getValue(4, 3) + "  |  " + array.getValue(4, 4) + "  |");
        System.out.println("—------------------------------");
    }

    // public static void visualize(int num, int row, int col){
    //     System.out.println("—------------------------------");
    //     if (row == 0){
    //         if (col == 0){
    //             System.out.println("|  " + num + "  |     |     |     |     |");
    //         } else if (col == 1){
    //             System.out.println("|     |  " + num + "  |     |     |     |");
    //         } else if (col == 2){
    //             System.out.println("|     |     |  " + num + "  |     |     |");
    //         } else if (col == 3){
    //             System.out.println("|     |     |     |  " + num + "  |     |");
    //         } else {
    //             System.out.println("|     |     |     |     |  " + num + "  |");
    //         }
    //         for (int i = 0; i < 3; i++){
    //             System.out.println("|     |     |     |     |     |");
    //             System.out.println("|-----|-----|-----|-----|-----|");
    //         }
    //         System.out.println("|     |     |     |     |     |");
    //         System.out.println("—------------------------------");
    //     }
    // }
}