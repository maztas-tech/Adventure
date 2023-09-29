public class Item {
    private String name;
    private String longName;
    private String description;
    public Item(String name, String longname, String description){
        this.name = name;
        this.longName = longName;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getLongName() {
        return longName;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLongName(String longName){
        this.longName = longName;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
