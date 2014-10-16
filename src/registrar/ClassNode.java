/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 3-B
 */
package registrar;

/**
 *
 * @author ilorenzo
 */
public class ClassNode {
    private String classId;
    private String section;
    private int credits;
    private ClassNode link;
    
    public ClassNode(){
        classId = null;
        section = null;
        credits = 0;
        link = null;
    }
    
    public ClassNode(String classId, String section, 
            int credits, ClassNode link){
        this.classId = classId;
        this.section = section;
        this.credits = credits;
        this.link = link;        
    }
    
    public void setClassId(String classId){
        this.classId = classId;
    }
    
    public String getClassId(){
        return classId;
    }
    
    public void setSection(String section){
        this.section = section;
    }
    
    public String getSection(){
        return section;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    public int getCredits(){
        return credits;
    }
    
    public void setLink(ClassNode link){
        this.link = link;
    }
    
    public ClassNode getLink(){
        return link;
    }
    
}
