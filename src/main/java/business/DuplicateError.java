package business;

import java.util.UUID;

public class DuplicateError {

    private UUID id;
    private String error;

    public DuplicateError(final UUID id, final String error) {
        this.id = id;
        this.error = error;
    }

    public UUID getId() {
        return id;
    }

    public String getError() {
        return error;
    }
}
