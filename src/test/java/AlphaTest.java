import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaTest {
    private Alpha alpha;

    @BeforeEach
    void setUp() {
        alpha = new Alpha();
    }

    @Test
    void compareTest() {

        assertEquals(40, alpha.compare("ASD", "DSA"));
        assertEquals(0, alpha.compare("A", "BB"));
        assertEquals(40, alpha.compare("AAABB", "BAA"));
        assertEquals(20, alpha.compare("AA", "AAE"));
        /*assertEquals(30, length.compare("AA", "AAE"));
        assertEquals(0, length.compare("AB", "AAAA"));*/
    }
}