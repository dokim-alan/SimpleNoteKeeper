package ca.sait.SimpleNoteKeeper.javabeans;
import java.io.Serializable;
/**
 * Represent a note.
 * @author Alan(Dong O) Kim
 */
public class Note implements Serializable {
    // Fields
    private String title;
    private String contents;
    
    // No-arg constructor
    public Note() {

    }
    
    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    
    // Accessor methods
    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
    
    // Mutator methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String toString () {
        String name = this.title + " " + this.contents;
        
        return name;
    }
    
}
