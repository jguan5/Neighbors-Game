public class Neighbors{
    int[][] array;
    public Neighbors(){
        array = new int[5][5];
    }

    public boolean inputNumber(int num, int row, int col){
        array[row][col] = num;
        return true;
    }

    public int getValue(int row, int col){
        return array[row][col];
    }

    public int calculateRows(){
        int sum = 0;
        int count = 1;
        for (int i = 1; i < array.length; i++){
            for (int r = 1; r < array[0].length; r++){
                if (array[i][r] == array[i][r-1]){
                    count++;
                } else {
                    if (count != 1){
                        sum += count * array[i][r-1];
                    }
                    count = 1;
                }
            }
        }
        return sum;
    }

    public int calculateCols(){
        int sum = 0;
        int count = 1;
        for (int i = 1; i < array[0].length; i++){
            for (int r = 1; r < array.length; r++){
                if (array[r][i] == array[r-1][i]){
                    count++;
                } else {
                    if (count != 1){
                        sum += count * array[r-1][i];
                    }
                    count = 1;
                }
            }
        }
        return sum;
    }

}