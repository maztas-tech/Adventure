public class Item {
    private String name;
    private String longName;
    public Item(String name, String longName){
        this.name = name;
        this.longName = longName;
    }
    public String getName() {
        return name;
    }
    public String getLongName() {
        return longName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLongName(String longName){
        this.longName = longName;
    }

}
