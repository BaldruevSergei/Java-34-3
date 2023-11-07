package homework.diary;

public interface ToDoList {
    boolean addRecording(Task task);
    void lookRecording();
    void deleteRecording();
    void exitRecording();
}
