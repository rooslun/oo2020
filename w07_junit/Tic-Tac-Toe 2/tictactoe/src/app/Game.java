package app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Game {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {

        

        // esimesena alustan mängulaua printimisega

        char[][] gameBoard = {{' ', '|',' ', '|',' '}, 
        {'-', '+','-', '+','-'}, 
        {' ', '|',' ', '|',' '}, 
        {'-', '+','-', '+','-'},  
        {' ', '|',' ', '|',' '}};

        printGameBoard(gameBoard);
        


        while(true){
            //teen scanneri et saada kasutajalt inputi
            Scanner scan = new Scanner(System.in);
            System.out.println("Positsioon 1-9");
            int playerPos = scan.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                System.out.println("Positsioon kasutuses! Vali uus!");
                playerPos = scan.nextInt();
            }

            placePiece(gameBoard, playerPos, "player");

            
        
            
            
            String result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }


            // arvuti osa jaoks kasutan random genereeringut
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                cpuPos = rand.nextInt(9) +1;
            }
            // aseta vajalik symbol gameboardile, arvuti
            placePiece(gameBoard, cpuPos, "cpu");
        
            printGameBoard(gameBoard);
            result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
        }    
        
    }  


    public static void printGameBoard(char [][] gameBoard){
        // prindin välja gameboardi kasutades kahte for loopi
    //igal arrayle igas reas gameboardil,  
        for(char[] row : gameBoard) {
            // iga sümbol reas
                        for(char c : row) {
            // Prindi välja sümbol (c)
                            System.out.print(c);
                        }
                        // et gameboard tuleks ilusti prinditune välja, tuleb peale igat rida(row) printida line
                        System.out.println();
                       
        }          

    }
    public static void placePiece(char[][] gameBoard, int pos, String user) {

        //default symobl 
        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        }else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }

    

     //kasutan switch casei. asukohta position ja x o , 
     switch(pos) {
        case 1:
            gameBoard[0][0] = symbol;
            break;
        case 2:
            gameBoard[0][2] = symbol;
            break;
        case 3:
            gameBoard[0][4] = symbol;
            break;
        case 4:
            gameBoard[2][0] = symbol;
            break;
        case 5:
            gameBoard[2][2] = symbol;
            break;
        case 6:
            gameBoard[2][4] = symbol;
            break;
        case 7:
            gameBoard[4][0] = symbol;
            break;
        case 8:
            gameBoard[4][2] = symbol;
            break;
        case 9:
            gameBoard[4][4] = symbol;
            break;   
        default:
            break;
        }
    }
    public static String checkWinner(){

        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol= Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rigCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rigCol);
        winning.add(cross1);
        winning.add(cross2);

        //mängu lõpetamine
        for(List l: winning){
            if(playerPositions.containsAll(l)){
                return "Congrats Player 1!";
            }else if(cpuPositions.containsAll(l)){
                return "Conrgats Player 2!";
            }else if(playerPositions.size() + cpuPositions.size() == 9){
                return "CAT!."; 
            }
        }
        return"";
    }
}
// Kasutatud loomiseks : https://www.youtube.com/watch?v=gQb3dE-y1S4&t=1123s
