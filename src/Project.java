public class Project {

    String name ;
    Devloppeur dev ;

    public Project (String name) {
        this.name=name  ;
         }

    public Project (String name, Devloppeur dev) {
        this.name=name  ;
        this.dev= dev ;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", dev=" + dev +
                '}';
    }
}
