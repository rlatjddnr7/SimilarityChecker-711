import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    private Length length;

    @BeforeEach
    void setUp() {
        length = new Length();
    }

    @Test
    void compareLength() {
        assertEquals(60, length.compare("ASD", "DSA"));
        assertEquals(0, length.compare("A", "BB"));
        assertEquals(20, length.compare("ABB", "BAAAA"));
        assertEquals(30, length.compare("AA", "AAE"));
        assertEquals(0, length.compare("AAA", "AAAAAAE"));
    }
}