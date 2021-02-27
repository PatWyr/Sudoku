package sudoku.exceptions;

import sudoku.exceptions.MainException;

public class NoClassException extends MainException {
    public NoClassException() {
    }

    public NoClassException(String s) {
        super(s);
    }

    public NoClassException(String s, Throwable ex) {
        super(s, ex);
    }
}
