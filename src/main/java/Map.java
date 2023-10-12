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


    public Room getStarterRoom() {
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

        //room 1
        room1.addFood("potion", "Health potion", 50);
        room1.addFood("apple", "Apples", 10);
        room1.addItem("map", "An overview of the whole map");
        room1.addMeleeWeapon("knife", "Huntsman Knife", 20);
        room1.addRangedWeapon("revolver", "Lucky Luke", 35, 6);
        room1.addFood("dead animal", "Dead mice of instant death", -500);
        MeleeWeapon meleeWeapon1 = new MeleeWeapon("club", "rusty club", 5);
        RangedWeapon rangedWeapon1 = new RangedWeapon("bow", "rusty bow", 4, 2);
        room1.addEnemy("big troll", "troll", 50, meleeWeapon1);
        room1.addEnemy("small troll", "troll", 25, rangedWeapon1);


        //room 2
        room2.addFood("magic potion", "Magic Potion of Restoration", 60);
        room2.addItem("ancient tome", "Ancient Tome of Spells");
        room2.addMeleeWeapon("sword", "Mystic Sword of Valor", 30);
        room2.addFood("enchanted fruit", "Enchanted Fruit of Life", 40);
        MeleeWeapon meleeWeapon3 = new MeleeWeapon("axe", "Enchanted Axe", 25);
        RangedWeapon rangedWeapon2 = new RangedWeapon("wand", "Wizard's Wand", 6, 10);
        room2.addEnemy("spider", "Giant Spider", 40, meleeWeapon3);
        room2.addEnemy("sorcerer", "Evil Sorcerer", 60, rangedWeapon2);


        //room 3

        room3.addFood("elixir", "Elixir of Strength", 70);
        room3.addItem("crystal ball", "Crystal Ball of Divination");
        room3.addMeleeWeapon("warhammer", "Warhammer of Titans", 40);
        room3.addFood("mysterious mushroom", "Mysterious Glowing Mushroom", 50);
        MeleeWeapon meleeWeapon4 = new MeleeWeapon("spear", "Spear of the Gods", 35);
        RangedWeapon rangedWeapon3 = new RangedWeapon("crossbow", "Crossbow of Accuracy", 32, 8);
        room3.addEnemy("dark knight", "Dark Knight", 75, meleeWeapon4);
        room3.addEnemy("sorceress", "Enchantress Sorceress", 55, rangedWeapon3);


        //room 4
        room4.addFood("golden apple", "Golden Apple of Immortality", 70);
        room4.addItem("ancient tablet", "Ancient Tablet with Forgotten Runes");
        room4.addMeleeWeapon("greatsword", "Greatsword of Legends", 45);
        room4.addFood("honey cake", "Honey Cake of Regeneration", 60);
        MeleeWeapon meleeWeapon5 = new MeleeWeapon("hammer", "Hammer of Thor", 50);
        RangedWeapon rangedWeapon4 = new RangedWeapon("magic bow", "Magic Bow of Precision", 40, 12);
        room4.addEnemy("undead king", "Undead King", 80, meleeWeapon5);
        room4.addEnemy("shadow assassin", "Shadow Assassin", 70, rangedWeapon4);


        //room 5
        room5.addFood("mystical fruit", "Mystical Fruit of Power", 90);
        room5.addItem("star chart", "Star Chart of Celestial Navigation");
        room5.addMeleeWeapon("dragonblade", "Dragonblade of the Ancients", 60);
        room5.addFood("elixir of wisdom", "Elixir of Wisdom and Knowledge", 80);
        MeleeWeapon meleeWeapon6 = new MeleeWeapon("giant axe", "Giant Axe of Destruction", 75);
        RangedWeapon rangedWeapon5 = new RangedWeapon("crystal staff", "Crystal Staff of Sorcery", 55, 15);
        room5.addEnemy("fire dragon", "Fire Dragon", 100, meleeWeapon6);
        room5.addEnemy("earth elemental", "Earth Elemental", 90, rangedWeapon5);

        //room 6
        room6.addFood("ethereal nectar", "Ethereal Nectar of Immortality", 100);
        room6.addItem("forbidden grimoire", "Forbidden Grimoire of Dark Magic");
        room6.addMeleeWeapon("legendary spear", "Legendary Spear of Heroes", 70);
        room6.addFood("golden ambrosia", "Golden Ambrosia of the Gods", 90);
        MeleeWeapon meleeWeapon7 = new MeleeWeapon("ancient staff", "Ancient Staff of Enchantment", 65);
        RangedWeapon rangedWeapon6 = new RangedWeapon("divine bow", "Divine Bow of Light", 50, 20);
        room6.addEnemy("frost giant", "Frost Giant", 110, meleeWeapon7);
        room6.addEnemy("phoenix", "Phoenix", 95, rangedWeapon6);

        //room 7
        room7.addFood("elixir of wealth", "Elixir of Wealth and Prosperity", 120);
        room7.addItem("treasure chest", "Treasure Chest filled with Precious Gems");
        room7.addMeleeWeapon("demonic sword", "Demonic Sword of Chaos", 80);
        room7.addFood("luxurious banquet", "Luxurious Banquet fit for a King", 110);
        MeleeWeapon meleeWeapon8 = new MeleeWeapon("dragon claws", "Dragon Claws of Power", 90);
        RangedWeapon rangedWeapon7 = new RangedWeapon("magic scepter", "Magic Scepter of Dominion", 70, 25);
        room7.addEnemy("treasure guardian", "Treasure Guardian", 130, meleeWeapon8);
        room7.addEnemy("greed demon", "Greed Demon", 120, rangedWeapon7);

        //room 8
        room8.addFood("ambrosia of the gods", "Ambrosia of the Gods", 150);
        room8.addItem("crown jewels", "Crown Jewels of the Kingdom");
        room8.addMeleeWeapon("king's sword", "King's Sword of Authority", 100);
        room8.addFood("royal feast", "Royal Feast of the Monarchs", 140);
        MeleeWeapon meleeWeapon9 = new MeleeWeapon("emperor's mace", "Emperor's Mace of Dominance", 110);
        RangedWeapon rangedWeapon8 = new RangedWeapon("royal scepter", "Royal Scepter of Sovereignty", 90, 30);
        room8.addEnemy("royal guard", "Royal Guard", 160, meleeWeapon9);
        room8.addEnemy("sorceress queen", "Sorceress Queen", 150, rangedWeapon8);

        //room 9

        room9.addFood("mysterious artifact", "Mysterious Ancient Artifact", 170);
        room9.addItem("forbidden tome", "Forbidden Tome of Dark Secrets");
        room9.addMeleeWeapon("ancient sword", "Ancient Sword of the Elders", 120);
        room9.addFood("sacrificial offering", "Sacrificial Offering of the Ancients", 160);
        MeleeWeapon meleeWeapon10 = new MeleeWeapon("legendary halberd", "Legendary Halberd of Legends", 130);
        RangedWeapon rangedWeapon9 = new RangedWeapon("enchanted bow", "Enchanted Bow of Enigma", 100, 35);
        room9.addEnemy("eldritch abomination", "Eldritch Abomination", 180, meleeWeapon10);
        room9.addEnemy("dark sorcerer", "Dark Sorcerer", 170, rangedWeapon9);
        room9.addItem("gold", "A pile of gold");


        //Food
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
