package homework.listofcase;

public class Task {
    private  int id;
    private String task;
    private int idNumber;

    public Task(int id, String task, int idNumber) {
        this.id = id;
        this.task = task;
        this.idNumber = idNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return idNumber == task.idNumber;
    }

    @Override
    public int hashCode() {
        return idNumber;
    }
}
