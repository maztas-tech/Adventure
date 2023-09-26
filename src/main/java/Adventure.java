import java.util.Scanner;
public class Adventure {
    private Room current;



    public Room getCurrent(){
        return current;
    }
    public void buildMaze() {
        Room room1 = new Room("Room 1", "A room with no distinct features, except two doors.");
        Room room2 = new Room("Room 2", "A dimly lit room with a musty smell.");
        Room room3 = new Room("Room 3", "A large room with a high ceiling.");
        Room room4 = new Room("Room 4", "A mysterious room filled with strange artifacts.");
        Room room5 = new Room("Room 5", "A hidden chamber with a single exit to the east.");
        Room room6 = new Room("Room 6", "A narrow corridor with flickering torches.");
        Room room7 = new Room("Room 7", "An underground cave with a shimmering pool.");
        Room room8 = new Room("Room 8", "A dusty library with rows of ancient books.");
        Room room9 = new Room("Room 9", "A secret chamber containing a treasure chest.");

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

    }








}
