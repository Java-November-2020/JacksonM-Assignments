public class Project {
    private String name;
    private String description;

    public String elevatorPitch(String name, String description){
        return name + " ; " + description; 
    }
    public Project(){
        // System.out.println("Empty");
    }

    public String Project(String name){
        this.name = name;
        return name;
    }

    public String Project (String name, String description){
        this.name = name;
        this.description = description;
        return name + "" + description;
    }
    

}
