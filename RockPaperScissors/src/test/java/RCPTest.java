import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RCPTest {

    @Test
    public void 사용자가_1을입력하면_주먹을_반환() {
        RCPConverter converter = new RCPConverter();
        RCP UserRCP = converter.convert(1);
        assertEquals(RCP.ROCK, UserRCP.ROCK);
    }
}
