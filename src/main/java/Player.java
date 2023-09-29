public class Player {
    Room currentRoom;
    public void setCurrentRoom(Room newRoom){
        this.currentRoom = newRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void timer(){
        Thread countdownThread = new Thread();
        for (int i = 4; i >= 0; i--){
            System.out.print(i + " ");
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println("Error :" + e);
            }
        }
        countdownThread.start();
    }
    //TODO Create an ArrayList


    public void move(String direction){
        switch (direction){
            case "north":
                if (currentRoom.getNorth() != null) {
                    Room northRoom = currentRoom.getNorth();
                    currentRoom = northRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "south":
                Room southRoom = currentRoom.getSouth();
                if (southRoom != null){
                    currentRoom = currentRoom.getSouth();
                }else System.out.println("You can't go that way.");
                break;
            case "west":
                Room westRoom = currentRoom.getWest();
                if (westRoom != null){
                    currentRoom = westRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "east":
                Room eastRoom = currentRoom.getEast();
                if (eastRoom != null){
                    currentRoom = eastRoom;
                }else System.out.println("You can't go that way.");
                break;


        }
    }
}
