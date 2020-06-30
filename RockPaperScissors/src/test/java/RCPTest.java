import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RCPTest {
    private RCPConverter converter = new RCPConverter();

    @Test
    public void 사용자가_1을_입력하면_주먹을_반환() {
        RCP UserRCP = converter.convert(1);
        assertEquals(RCP.ROCK, UserRCP);
    }

    @Test
    public void 사용자가_2를_입력하면_보를_반환() {
        RCP UserRCP = converter.convert(2);
        assertEquals(RCP.PAPER, UserRCP);
    }

    @Test
    public void 사용자가_3을_입력하면_가위를_반환() {
        RCP UserRCP = converter.convert(3);
        assertEquals(RCP.SCISSORS, UserRCP);
    }
}
