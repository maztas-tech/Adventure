public class Adventure {
    //Room descriptions
    String room1Description = "the dungeon is a dark and damp place, filled with the stench of rotting flesh and mildew. " +
            "The walls are made of rough stone, and the floor is covered in a layer of grime. " +
            "There are several cells along the walls, and the sound of chains rattling can be heard. " +
            "A few torches flicker on the walls, but they do little to dispel the darkness.";

    String room2Description = "the torture chamber is a cold and sterile place, filled with the tools of the trade. " +
            "The walls are lined with racks, pincers, and other instruments of torture. " +
            "There is a large table in the center of the room, where the victims are strapped down. " +
            "The torture chamber is a place of suffering and pain, and the screams of the victims can be heard echoing through the halls.";

    String room3Description = "the summoning chamber is a dark and occult place, filled with strange and disturbing symbols. " +
            "The walls are covered in arcane runes, and the floor is covered in a pentagram. " +
            "There is a large altar in the center of the room, where the summonings take place. " +
            "The summoning chamber is a place of great power, and it is also a place of great danger.";
    String room4Description = "the library is a vast and dusty room, filled with shelves and shelves of books. " +
            "The walls are lined with tall windows, and the sunlight streams in through the glass." +
            " There are several tables and chairs scattered throughout the room, and a few scholars are seated at the tables, reading books and writing notes." +
            " The library is a place of learning and knowledge, but it is also a place where dangerous secrets are hidden.";

    String room5Description = "the observatory is a tall and slender tower, made of white stone. " +
            "The windows are tall and narrow, and the roof is topped with a尖塔. " +
            "The observatory is surrounded by a garden, filled with strange and exotic plants." +
            " There is a sense of mystery and magic about the observatory, and it is rumored to be home to a powerful wizard.";

    String room6Description = "the laboratory is a large and cluttered room, filled with all sorts of scientific equipment." +
            " The walls are covered with beakers, flasks, and other glassware." +
            " There is a large table in the center of the room, where the experiments take place." +
            " The laboratory is a place of discovery and innovation, but it is also a place where dangerous accidents can happen.";

    String room7Description = "the treasury is a vast and opulent room, filled with gold and jewels." +
            " The walls are covered with chests and coffers, and the floor is covered in a thick carpet of gold coins." +
            " There is a large throne in the center of the room, where the ruler of the building sits. " +
            "The treasury is a place of great wealth, but it is also a place of greed and temptation.";

    String room8Description = "the throne room is a grand and imposing room, with a high ceiling and marble walls. " +
            "The throne is made of gold and encrusted with jewels. " +
            "There is a red carpet leading up to the throne, and the room is filled with courtiers and guards. " +
            "The king himself is seated on the throne, and he is wearing a golden crown and a red cloak. " +
            "The throne room is a place of power and authority, but it is also a place of intrigue and danger.";

    String room9Description = "the secret chamber is a hidden room that is known only to a select few. " +
            "It is located deep within the building, and it is guarded by all sorts of traps and dangers. " +
            "The secret chamber is said to contain the building's greatest treasures, but it is also said to be home to its most dangerous secrets";

    private Room current;



    public Room getCurrent(){
        return current;
    }
    public void buildMaze() {
        Room room1 = new Room("The Dungeon", room1Description);
        Room room2 = new Room("The Torture Chamber", room2Description);
        Room room3 = new Room("The Summoning Chamber", room3Description);
        Room room4 = new Room("The Library", room4Description);
        Room room5 = new Room("The Observatory", room5Description);
        Room room6 = new Room("The Laboratory", room6Description);
        Room room7 = new Room("The Treasury", room7Description);
        Room room8 = new Room("The Throne Room", room8Description);
        Room room9 = new Room("The Secret Chamber", room9Description);

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

    }










}
