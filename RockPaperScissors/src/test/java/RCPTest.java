import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RCPTest {
    private RCPConverter converter = new RCPConverter();

    @Test
    public void 사용자가_1을_입력하면_주먹을_반환() {
        RCP userRCP = converter.convert(1);
        assertEquals(RCP.ROCK, userRCP);
    }

    @Test
    public void 사용자가_2를_입력하면_보를_반환() {
        RCP userRCP = converter.convert(2);
        assertEquals(RCP.PAPER, userRCP);
    }

    @Test
    public void 사용자가_3을_입력하면_가위를_반환() {
        RCP userRCP = converter.convert(3);
        assertEquals(RCP.SCISSORS, userRCP);
    }

    @Test
    public void 사용자가_범위밖의_숫자를_입력시_INVALID반환() {
        RCP userRCP = converter.convert(-1);
        assertEquals(RCP.INVALID, userRCP);

        userRCP = converter.convert(100);
        assertEquals(RCP.INVALID, userRCP);
    }
}
