import java.util.ArrayList;

public class Map {
    //Room descriptions
    String roomDescription1 = "the dungeon is a dark and damp place, filled with the stench of rotting flesh and mildew. \n" +
            "The walls are made of rough stone, and the floor is covered in a layer of grime. \n" +
            "There are several cells along the walls, and the sound of chains rattling can be heard. \n" +
            "A few torches flicker on the walls, but they do little to dispel the darkness.";

    String roomDescription2 = "the torture chamber is a cold and sterile place, filled with the tools of the trade. \n" +
            "The walls are lined with racks, pincers, and other instruments of torture. \n" +
            "There is a large table in the center of the room, where the victims are strapped down. \n" +
            "The torture chamber is a place of suffering and pain, and the screams of the victims can be heard echoing through the halls.";

    String roomDescription3 = "the summoning chamber is a dark and occult place, filled with strange and disturbing symbols. \n" +
            "The walls are covered in arcane runes, and the floor is covered in a pentagram. \n" +
            "There is a large altar in the center of the room, where the summonings take place. \n" +
            "The summoning chamber is a place of great power, and it is also a place of great danger.";

    String roomDescription4 = "the library is a vast and dusty room, filled with shelves and shelves of books. \n" +
            "The walls are lined with tall windows, and the sunlight streams in through the glass.\n" +
            "There are several tables and chairs scattered throughout the room, and a few scholars are seated at the tables, reading books and writing notes.\n" +
            "The library is a place of learning and knowledge, but it is also a place where dangerous secrets are hidden.";

    String roomDescription5 = "the observatory is a tall and slender tower, made of white stone. \n" +
            "The windows are tall and narrow, and the roof is topped with a尖塔. \n" +
            "The observatory is surrounded by a garden, filled with strange and exotic plants.\n" +
            "There is a sense of mystery and magic about the observatory, and it is rumored to be home to a powerful wizard.";

    String roomDescription6 = "the laboratory is a large and cluttered room, filled with all sorts of scientific equipment.\n" +
            "The walls are covered with beakers, flasks, and other glassware.\n" +
            "There is a large table in the center of the room, where the experiments take place.\n" +
            "The laboratory is a place of discovery and innovation, but it is also a place where dangerous accidents can happen.";

    String roomDescription7 = "the treasury is a vast and opulent room, filled with gold and jewels.\n" +
            "The walls are covered with chests and coffers, and the floor is covered in a thick carpet of gold coins.\n" +
            "There is a large throne in the center of the room, where the ruler of the building sits. \n" +
            "The treasury is a place of great wealth, but it is also a place of greed and temptation.\n";

    String roomDescription8 = "the throne room is a grand and imposing room, with a high ceiling and marble walls. \n" +
            "The throne is made of gold and encrusted with jewels. \n" +
            "There is a red carpet leading up to the throne, and the room is filled with courtiers and guards. \n" +
            "The king himself is seated on the throne, and he is wearing a golden crown and a red cloak. \n" +
            "The throne room is a place of power and authority, but it is also a place of intrigue and danger.";

    String roomDescription9 = "the secret chamber is a hidden room that is known only to a select few. \n" +
            "It is located deep within the building, and it is guarded by all sorts of traps and dangers. \n" +
            "The secret chamber is said to contain the building's greatest treasures, but it is also said to be home to its most dangerous secrets";

    private Room starterRoom;


    public Room getStarterRoom(){
        return starterRoom;
    }




    public void buildMap() {
        Room room1 = new Room("the Dungeon", roomDescription1);
        Room room2 = new Room("the Torture Chamber", roomDescription2);
        Room room3 = new Room("the Summoning Chamber", roomDescription3);
        Room room4 = new Room("the Library", roomDescription4);
        Room room5 = new Room("the Observatory", roomDescription5);
        Room room6 = new Room("the Laboratory", roomDescription6);
        Room room7 = new Room("the Treasury", roomDescription7);
        Room room8 = new Room("the Throne Room", roomDescription8);
        Room room9 = new Room("the Secret Chamber", roomDescription9);

        //Add items in rooms
        room1.addFood("apple", "Apples", 10);
        room1.addFood("potion", "Health potion", 50);
        room1.addItem("map", "An overview of the whole map");

        room2.addFood("cake", "chocolate cake", 20);

        room4.addItem("sword", "Long sword");
        room4.addItem("dagger", "A thiefs weapon");
        room4.addItem("shield", "shield");

        room5.addFood("bread", "loaf of bread", 20);

        room6.addItem("dead animal", "Dead mice");

        room7.addItem("gold", "A pile of gold");



        starterRoom = room1;

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

    }
}
