import java.util.Scanner;
class Game{
    // Method for creating the layout of the map
    public void createMap(){
        System.out.println();
        System.out.println("**** Welcome to the battleship game ****");
        System.out.println();
        System.out.println("Right now, the sea is empty!");
        System.out.println();
        int[][] map = new int[10][10];
        System.out.println("    0123456789    ");
        for(int row=0; row<map.length; row++){
            System.out.print(row +" | ");
            for(int column=0; column<map[row].length; column++){
                System.out.print(" ");
            }
            System.out.print(" | "+row);
            System.out.println();
        }
        System.out.println("    0123456789    ");
    }


    // Method for asking user for the inputs
    public int[][] takeInputs() {
        int[][] userInputs = new int[5][2];
        // ask user where they want to deplot their 5 ships
        int shipCount = 0;
        Scanner inputx = new Scanner(System.in);
        Scanner inputy = new Scanner(System.in);
        while(shipCount<userInputs.length){
            // for x co-ordinate of ship
            System.out.println("Please enter the x co-ordinate for your ship "+(shipCount+1)+":");          
            int x = inputx.nextInt();
            if (x<0 || x>9){
                System.err.println("Invalid entry!");
                continue;
            }else{
                userInputs[shipCount][0] = x;
            }
            // for y co-ordinate of ship
            System.out.println("Please enter the y co-ordinate for your ship "+(shipCount+1)+":");
            int y = inputy.nextInt();
            if (y<0 || y>9){
                System.err.println("Invalid entry!");
                continue;
            }else{
                userInputs[shipCount][1] = y;
            }
            shipCount++;
        }

        
        // For iterating through the user inputs: 
        // for (int i = 0; i < userInputs.length; i++) {
        //     for(int j = 0; j<userInputs[i].length; j++) {
        //         System.out.print(userInputs[i][j]);
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        // }
        return userInputs;    
    }
}