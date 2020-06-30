import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RCPTest {
    private RCPConverter converter = new RCPConverter();
    private User user = new User(converter);
    private Computer computer = new Computer(converter);

    @Test
    public void 사용자가_1을_입력하면_주먹을_반환() {
        RCP userRCP = user.putRCP(1);
        assertEquals(RCP.ROCK, userRCP);
    }

    @Test
    public void 사용자가_2를_입력하면_보를_반환() {
        RCP userRCP = user.putRCP(2);
        assertEquals(RCP.PAPER, userRCP);
    }

    @Test
    public void 사용자가_3을_입력하면_가위를_반환() {
        RCP userRCP = user.putRCP(3);
        assertEquals(RCP.SCISSORS, userRCP);
    }

    @Test
    public void 사용자가_범위밖의_숫자를_입력시_INVALID반환() {
        RCP userRCP = user.putRCP(-100);
        assertEquals(RCP.INVALID, userRCP);

        userRCP = user.putRCP(100);
        assertEquals(RCP.INVALID, userRCP);
    }

    @Test
    public void 컴퓨터가_가위_바위_보_하나를_반환(){
        RCP computerRCP = computer.putRCP();
        boolean rcpContain = EnumSet.allOf(RCP.class).contains(computerRCP);
        assertEquals(rcpContain, true);
    }
}
