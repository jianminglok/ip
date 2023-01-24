package twofive.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    private LocalDateTime deadline;

    public Deadline(String taskDescription, LocalDateTime deadline) {
        super(taskDescription);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        String deadlineString =
                " (by: " + this.deadline.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy hh:mma")) + ")";
        return "[D]" + super.toString() + deadlineString;
    }

    @Override
    public String getFileWriteString() {
        return "D" + super.getFileWriteString() + " | " +
                this.deadline.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    @Override
    public boolean isToday(LocalDate date) {
        return this.deadline.toLocalDate().isEqual(date);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Deadline)) {
            return false;
        }

        Deadline deadlineTask = (Deadline) o;

        return super.equals(deadlineTask) && deadlineTask.deadline.equals(this.deadline);
    }
}
