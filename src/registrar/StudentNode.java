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
public class StudentNode {
    private String id;
    private ClassNode link;
    
    
    public StudentNode(){
        id = null;
        link = null;
    }
    
    public StudentNode(String id, ClassNode link){
        this.id = id;
        this.link = link;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setLink(ClassNode link){
        this.link = link;
    }
    
    public ClassNode getLink(){
        return link;
    }
}
