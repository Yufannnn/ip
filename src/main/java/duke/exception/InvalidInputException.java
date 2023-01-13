package duke.exception;

/**
 * A custom exception that encapsulates the message when user input invalid instruction.
 */

public class InvalidInputException extends DukeException {
    /**
     * Constructor for DukeException with the error message to be printed.
     *
     * @param errorMessage  The error message to be printed
     */
    public InvalidInputException(String errorMessage) {
        super(errorMessage);
    }
}
