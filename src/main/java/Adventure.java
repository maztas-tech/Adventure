import java.util.Scanner;
public class Adventure {
    Scanner keyboard = new Scanner(System.in);

    private Room current;

    public void buildMaze() {

        Room room1 = new Room("Room 1", "Beskrivelse 1");
        Room room2 = new Room("Room 2", "Beskrivelse 2");
        Room room3 = new Room("Room 3", "Beskrivelse 3");
        Room room4 = new Room("Room 4", "Beskrivelse 4");
        Room room5 = new Room("Room 5", "Beskrivelse 5");
        Room room6 = new Room("Room 6", "Beskrivelse 6");
        Room room7 = new Room("Room 7", "Beskrivelse 7");
        Room room8 = new Room("Room 8", "Beskrivelse 8");
        Room room9 = new Room("Room 9", "Beskrivelse 9");

        current = room1;

        room1.setWest(null);
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.setNorth(null);


        room2.setWest(room1);
        room2.setEast(room3);
        room2.setSouth(null);
        room2.setNorth(null);

        room3.setWest(room2);
        room3.setEast(null);
        room3.setSouth(room6);
        room3.setNorth(null);

        room4.setWest(null);
        room4.setEast(null);
        room4.setSouth(room7);
        room4.setNorth(room1);

        room5.setWest(null);
        room5.setEast(null);
        room5.setSouth(room8);
        room5.setNorth(null);

        room6.setWest(null);
        room6.setEast(null);
        room6.setSouth(room9);
        room6.setNorth(room3);

        room7.setWest(null);
        room7.setEast(room8);
        room7.setSouth(null);
        room7.setNorth(room4);

        room8.setWest(room7);
        room8.setEast(room9);
        room8.setSouth(null);
        room4.setNorth(room5);

        room9.setWest(room8);
        room9.setEast(null);
        room9.setSouth(null);
        room9.setNorth(room6);
        System.out.println("""
                Welcome to the adventure game!
                
                Exit - To exit the program!
                Help - For a tutorial!
                Look - To look around in your current room
                """);
        choice();
    }

    public void choice(){
        String userChoice = "start";

        do {
                System.out.println("Would you like to move or would you like to look around ");
                userChoice = keyboard.nextLine().toLowerCase();
                if (userChoice.contains("help")) {
                    System.out.println("Write east/west/north/south to move in that direction. Write look to look around. Write exit to exit the game");
                }
                if (userChoice.contains("look")){
                    System.out.println(current.getDescription());
                } else if (userChoice.contains("east") && current.getEast()!=null){
                    userGoEast(userChoice);
                }
                else if (userChoice.contains("east") && current.getEast()==null){
                    System.out.println("You cannot move that direction");
                }
                else if (userChoice.contains("west") && current.getWest() != null){
                    userGoWest(userChoice);
                } else if (userChoice.contains("west") && current.getWest() == null) {
                    System.out.println("You cannot move that direction");
                } else if (userChoice.contains("north") && current.getNorth()!=null){
                    userGoNorth(userChoice);
                }
                else if (userChoice.contains("north") && current.getNorth()==null){
                    System.out.println("You cannot move that direction!");
                }
                else if (userChoice.contains("south") && current.getSouth()!=null){
                    userGoSouth(userChoice);
                }
                else if (userChoice.contains("south") && current.getSouth()==null){
                    System.out.println("You cannot move that direction!");
                }

        } while(!userChoice.contains("exit"));

        System.exit(0);
        

    }

    public void userGoEast(String East){
        current = current.getEast();
        choice();

    }

    public void userGoWest(String West){
        current = current.getWest();

    }

    public void userGoNorth(String North){
        current = current.getNorth();

    }

    public void userGoSouth(String South){
        current = current.getSouth();

    }




}
