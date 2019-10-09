import java.util.LinkedList;
import java.util.Scanner;
class Defect{
    String id;
    String description;
    Severity severity = Severity.LOW;
    Status status = Status.NEW;

    Defect(String id, String des){
        this.id = id;
        this.description = des;
    }
    void setStatus(String sta){
        if(sta.equals("o")) this.status = Status.OPEN;
        if(sta.equals("r")) this.status = Status.REJECTED;
        if(sta.equals("c")) this.status = Status.CLOSED;
        if(sta.equals("f")) this.status = Status.FIXED;
    }
    void setSeverity(String sev){
        if(sev.equals("l")) this.severity = Severity.LOW;
        if(sev.equals("m")) this.severity = Severity.MEDIUM;
        if(sev.equals("h")) this.severity = Severity.HIGH;
    }

    /**
     * @param description the description to set
     */

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @return the severity
     */
    public Severity getSeverity() {
        return severity;
    }
    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    enum Severity {
        LOW,
        MEDIUM,
        HIGH
    }
    enum Status {
        NEW,
        OPEN ,
        REJECTED,
        CLOSED,
        FIXED 
    }
}
class Project{      // has Default arr
    Scanner sc = new Scanner(System.in);
    private LinkedList<Defect> df = new LinkedList<Defect>();
    String name;
    String id;
    Project(String id, String name){
        this.name = name;
        this.id = id;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    int defIdforId(String defId){
        int len = df.size();
        for (int i = 0; i < len; i++) {
            if(defId.equals(df.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
    void deleteDefect(String defId){
        df.remove(defIdforId(defId));
        System.out.println("id num "+ defId + " Defect has been deleted");
    }
    public void createDefect(String defId, String description){
        Defect dfa = new Defect(defId , description);
        this.df.add(dfa);
    }
    void giveStatus(String defId){
        Defect deff = this.df.get(defIdforId(defId));
            System.out.println("OPEN : o , CLOSE : c");
            deff.setStatus(sc.next());
    }
    void giveStatus2(String defId){
        Defect deff = this.df.get(defIdforId(defId));
            System.out.println("REJECTED : r ,FIXED : f");
            deff.setStatus(sc.next());
    }
    void giveSeviarity(String defId){
        Defect deff = this.df.get(defIdforId(defId));
            System.out.println("LOW l , MIDIUM m, HIGH h");
            deff.setSeverity(sc.next());
    }

    void viewDafects(){
        int len = this.df.size();
        for (int i = 0; i < len; i++) {
            Defect deff = this.df.get(i);
            System.out.println(deff.getId()+" , Description "+deff.getDescription()+ " , Status "+deff.getStatus() + " , Severity "+deff.getSeverity()); 
        }
    }
}

class Employee{    // has Project arr
    Scanner sc = new Scanner(System.in);
    private LinkedList<Project> pr = new LinkedList<Project>();
    
    public void createProject(String id, String name){
        Project prj = new Project(id , name);
        pr.add(prj);
    }
    int proIdforId(String proId){
        int len = pr.size();
        for (int i = 0; i < len; i++) {
            if(proId.equals(pr.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
    void createDefectForProject(String proId){
        Project pro = this.pr.get(proIdforId(proId));
        System.out.println("Enter Defect Id & Description");
        pro.createDefect(sc.next(), sc.next());
    }
    void deleteProject(String proId){
        pr.remove(proIdforId(proId));
        System.out.println("ProId "+ proId + " Project has been deleted");
    }
    void viewProject(){
        int len = pr.size();
        for (int i = 0; i < len; i++) {
            Project prr = pr.get(i);
            System.out.println("ProId : " + prr.getId()+" , ProName "+prr.getName()); 
        }
    }



    void deleteDefectFromProject(String proId, String defId){
        Project pro = this.pr.get(proIdforId(proId));
        //System.out.println("Enter Defect Id");
        pro.deleteDefect(defId);
    }
    void statusDefectForProject(String proId, String defId){
        Project pro = this.pr.get(proIdforId(proId));
        //System.out.println("Enter Defect Id");
        pro.giveStatus(defId);
    }
    void statusDefectForProject2(String proId, String defId){
        Project pro = this.pr.get(proIdforId(proId));
        //System.out.println("Enter Defect Id");
        pro.giveStatus2(defId);
    }
    void seviarityDefectForProject(String proId, String defId){
        Project pro = this.pr.get(proIdforId(proId));
        //System.out.println("Enter Defect Id");
        pro.giveSeviarity(defId);
    }
    void viewDefectForProject(String proId){
        Project pro = this.pr.get(proIdforId(proId));
        pro.viewDafects();
    }

    

}

class xmain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        Employee Dev = new Employee();
        do{
            System.out.println("Are you Developer : D or QA : Q    close App : x");
            st = sc.next();
            
            if(st.equals("d")){
                String c1;
                do{
                    System.out.println("Create Project : p & view All Default : v & status for Default : st     logOut : l");
                    c1 = sc.next();
                    switch(c1){
                        case "p":
                            System.out.println("Create Project : Enter Id & Name ");
                            Dev.createProject(sc.next(), sc.next());
                            break;
                        case "v":
                            System.out.println("Enter your Project number");
                            String pId3 = sc.next();
                            Dev.viewDefectForProject(pId3);
                            break;
                        case "st": 
                            System.out.println("Enter your Project number & Default number");
                            String pId1 = sc.next();
                            String dId1 = sc.next();
                            Dev.statusDefectForProject2(pId1,dId1);
                            Dev.viewDefectForProject(pId1);
                            break;
                    }
                }while(!c1.equals("l"));
            }
            if(st.equals("q")){
                String c2;
                do{
                    System.out.println("View All Projects : v & Create Default for Project : c &  View All Default : vd &  delete Default : d & status for Default : st & seviarity for Default : sv    logOut  l ");
                    c2 = sc.next();
                    switch(c2){
                        case "v": 
                            System.out.println("All Projects");
                            System.out.println("--------------------");
                            Dev.viewProject();
                            System.out.println();
                            break;
                        case "c": 
                            System.out.println("Enter your Project number");
                            Dev.createDefectForProject(sc.next());
                            break;
                        case "d": 
                            System.out.println("Enter your Project number & Default number");
                            String pId = sc.next();
                            String dId = sc.next();
                            Dev.deleteDefectFromProject(pId,dId);
                            Dev.viewDefectForProject(pId);
                            break;
                        case "vd":
                            System.out.println("Enter your Project number");
                            String pId3 = sc.next();
                            Dev.viewDefectForProject(pId3);
                            break;
                        case "st": 
                            System.out.println("Enter your Project number & Default number");
                            String pId1 = sc.next();
                            String dId1 = sc.next();
                            Dev.statusDefectForProject(pId1,dId1);
                            Dev.viewDefectForProject(pId1);
                            break;
                        case "sv": 
                            System.out.println("Enter your Project number & Default number");
                            String pId2 = sc.next();
                            String dId2 = sc.next();
                            Dev.seviarityDefectForProject(pId2,dId2);
                            Dev.viewDefectForProject(pId2);
                            break;
                    }
                }while(!c2.equals("l"));
            }
        }while(!st.equals("x"));
        sc.close();
        
    }
}