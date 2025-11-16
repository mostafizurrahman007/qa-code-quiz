package constants;

import lombok.Getter;

@Getter
public enum Credentials {
    EMAIL("dummytree"),
    PASSWORD ("test1"),
    EMPTY(""),
    INVALID_EMAIL("abc@test.com"),
    INVALID_PASS("abc123");

    private final String label;

    Credentials(String label) {
        this.label = label;
    }
}
