import java.util.Scanner;

public class GameDriver {
    private Player[] players;
    private Ship[] ships1;
    private Ship[] ships2;
    private final static int numRows = 10;
    private final static int numCols = 10;
    private static int playerShips;
    private static int computerShips;
    private static String[][] grid1;
    private static String[][] grid2;
    private static int[][] missedGuesses;

    public GameDriver() {
        players = new Player[2];
        ships1 = new Ship[5];
        ships2 = new Ship[5];
        grid1 = new String[numRows][numCols];
        grid2 = new String[numRows][numCols];
        missedGuesses = new int[numRows][numCols];
    }

    public void runner() {
        displayInfo();
        getName();
        createMap();
        reRun();
    }

    public void reRun() {
        deployShips();
        displayMap();
    }

    public void displayInfo() {
        System.out.println("Welcome to Battleship!");
        System.out.println("");
    }

    public void getName() {
        Scanner myObj = new Scanner(System.in);
        boolean check = false;
        for (int i = 1; i < 3; i++) {
            while (check == false) {
                System.out.println("Enter Player " + i + " username: (must be 25 characters)");
                String userName = myObj.nextLine();
                if (userName.length() <= 25) {
                    Player p1 = new Player(userName);
                    players[i - 1] = p1;
                    break;
                } else {
                    System.out.println("Username is too long");
                }
            }
        }
    }

    public void createMap() {
        System.out.print(" ");
        String row = "ABCDEFGHIJ";
        String col = "0123456789";
        for (int i = 0; i < numCols; i++) {
            System.out.print(col.substring(i, i + 1));
        }
        System.out.println();

        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                grid1[i][j] = " ";
                if (j == 0)
                    System.out.print(row.substring(i, i + 1) + grid1[i][j]);
                else if (j == grid1[i].length - 1)
                    System.out.print(grid1[i][j] + row.substring(i, i + 1));
                else
                    System.out.print(grid1[i][j]);
            }
            System.out.println();
        }

        System.out.print(" ");
        for (int i = 0; i < numCols; i++)
            System.out.print(col.substring(i, i + 1));
        System.out.println();
    }

    public void deployShips() {
        resetMap();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Deploy your ships in the order below: ");
        System.out.println("A A1h B A6v D E3h S F4v P G7h");
        String ship = myObj.nextLine();
        try {
//        Check for incorrect syntax
//

            String a = ship.substring(ship.indexOf("A ") + 2, ship.indexOf("A ") + 5);
            String b = ship.substring(ship.indexOf("B ") + 2, ship.indexOf("B ") + 5);
            String d = ship.substring(ship.indexOf("D ") + 2, ship.indexOf("D ") + 5);
            String p = ship.substring(ship.indexOf("P ") + 2, ship.indexOf("P ") + 5);
            String s = ship.substring(ship.indexOf("S ") + 2, ship.indexOf("S ") + 5);
            String all = ship.substring(ship.indexOf("A "), ship.indexOf("A ") + 1) + ship.substring(ship.indexOf("B "), ship.indexOf("B ") + 1) + ship.substring(ship.indexOf("D "), ship.indexOf("D ") + 1) + ship.substring(ship.indexOf("S "), ship.indexOf("S ") + 1) + ship.substring(ship.indexOf("P "), ship.indexOf("P ") + 1);

//            Check for ship types
//            Check if the player enters the ship that was already in playing board
            char string[] = all.toCharArray();
            for (int i = 0; i < string.length; i++) {
                for (int j = i + 1; j < string.length; j++) {
                    if (string[i] == (string[j])) {
                        System.out.println("Duplicate ship type. Error in  " + ship);
                        deployShips();
                    }
                }
            }

            String[] list = {a, b, d, p, s};
            String row = "ABCDEFGHIJ";
            String[] names = {"Aircraft Carrier", "Battleship", "Destroyer", "Submarine", "Patrol Boat"};
            int[] count = {5, 5, 3, 3, 2};
            for (int i = 0; i < list.length; i++) {
                try {
                    int r1 = row.indexOf(list[i].charAt(0));
                    char c1 = list[i].charAt(1);
                    char o = list[i].charAt(2);
                    if (o == 'h') {
                        ships1[i] = new Ship(names[i], count[i], o, r1, c1, r1, c1 + count[i] - 1, list[i]);
                    } else {
                        ships1[i] = new Ship(names[i], count[i], o, r1, c1, r1 + count[i] - 1, c1, list[i]);
                    }

                } catch (Exception e) {
                    System.out.println("Cell does not exist, ship is beyond the board, ship is overlapped. Error in " + list[i]);
                    reRun();
                }
            }
            for (int r = 0; r < grid1.length; r++) {
                for (int c = 0; c < grid1.length; c++) {
                    for (int i = 0; i < ships1.length; i++) {
                        if (ships1[i].getR1() == r && ships1[i].getC1() == c) {
                            if (ships1[i].getOrientation() == 'h') {
                                for (int x = 0; x <= ships1[i].getC2() - ships1[i].getC1(); x++) {
                                    if (grid1[r][c + x] != " ") {
                                        System.out.println("Ship overlapped. Error in " + ships1[i].getName());
                                        reRun();
                                        return;
                                    }
                                    grid1[r][c + x] = ships1[i].getName().substring(0, 1);
                                }
                            }
                            else {
                                for (int x = 0; x <= ships1[i].getR2() - ships1[i].getR1(); x++) {
                                    if (grid1[r + x][c] != " ") {
                                        System.out.println("Ship overlapped. Error in " + ships1[i].getName());
                                        reRun();
                                        return;
                                    }
                                    grid1[r + x][c] = ships1[i].getName().substring(0, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Incorrect ship type, or wrong format, please try again. Error in " + ship);
            reRun();
        }
    }

    public void resetMap() {
        for (int r = 0; r < grid1.length; r++) {
            for (int c = 0; c < grid1.length; c++) {
                if (grid1[r][c] != " ") {
                    grid1[r][c] = " ";
                }
            }
        }
    }

    public void displayMap() {
        System.out.print(" ");
        String row = "ABCDEFGHIJ";
        String col = "0123456789";
        for (int i = 0; i < numCols; i++) {
            System.out.print(col.substring(i, i + 1));
        }
        System.out.println();

        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                if (j == 0)
                    System.out.print(row.substring(i, i + 1) + grid1[i][j]);
                else if (j == grid1[i].length - 1)
                    System.out.print(grid1[i][j] + row.substring(i, i + 1));
                else
                    System.out.print(grid1[i][j]);
            }
            System.out.println();
        }

        System.out.print(" ");
        for (int i = 0; i < numCols; i++)
            System.out.print(col.substring(i, i + 1));
        System.out.println();
    }
}