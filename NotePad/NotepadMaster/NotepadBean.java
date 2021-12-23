package cn.itcast.notepad;

public class NotepadBean {
    private String id, noteContent, noteTime;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id  = id;
    }

    public String getNoteContent(){
        return noteContent;
    }

    public void setNoteContent(String noteContent){
        this.noteContent = noteContent;
    }

    public String getNoteTime(){
        return noteTime;
    }

    public void setNoteTime(String noteTime){
        this.noteTime = noteTime;
    }

}


