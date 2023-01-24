package twofive.exception;

/**
 * Represents an error encountered when a description is not provided for parsing
 * when adding a new Task.
 */
public class EmptyDescriptionException extends TwoFiveException {
    private String taskType;

    public EmptyDescriptionException(String taskType) {
        this.taskType = taskType;
    }

    @Override
    public String getMessage() {
        return ":( OOPS!!! The description of a " + taskType + " cannot be empty.";
    }
}
