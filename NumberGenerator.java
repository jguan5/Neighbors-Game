public class NumberGenerator{
    public static int generate(){
        return (int) (Math.random()*9) + 1;
    }

    public static boolean validInput(String input){
        if (input.substring(0, 1).equals("(")){
            if (input.substring(2, 4).equals(", ")){
                if (input.substring(5, 6).equals(")")){
                    return true;
                }
            }
        }
        return false;
    }

    public static int breakRow(String input){
        int row = Integer.parseInt(input.substring(input.indexOf("(") + 1, input.indexOf("(") + 2));
        return row;
    }

    public static int breakCol(String input){
        int col = Integer.parseInt(input.substring(input.indexOf(")") - 1, input.indexOf(")")));
        return col;
    }
}