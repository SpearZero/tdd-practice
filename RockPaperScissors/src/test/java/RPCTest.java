import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RPCTest {
    private RPCGame rpcGame = new RPCGame();
    private User user = new User(rpcGame);
    private Computer computer = new Computer(rpcGame);

    @Test
    public void 사용자가_1을_입력하면_주먹을_반환() {
        RPC userRCP = user.putRPC(1);
        assertEquals(RPC.ROCK, userRCP);
    }

    @Test
    public void 사용자가_2를_입력하면_보를_반환() {
        RPC userRPC = user.putRPC(2);
        assertEquals(RPC.PAPER, userRPC);
    }

    @Test
    public void 사용자가_3을_입력하면_가위를_반환() {
        RPC userRPC = user.putRPC(3);
        assertEquals(RPC.SCISSORS, userRPC);
    }

    @Test
    public void 사용자가_범위밖의_숫자를_입력시_INVALID반환() {
        RPC userRPC = user.putRPC(-100);
        assertEquals(RPC.INVALID, userRPC);

        userRPC = user.putRPC(100);
        assertEquals(RPC.INVALID, userRPC);
    }

    @Test
    public void 컴퓨터가_가위_바위_보_하나를_반환(){
        RPC computerRPC = computer.putRPC();
        boolean rcpContain = EnumSet.allOf(RPC.class).contains(computerRPC);
        assertEquals(rcpContain, true);
    }

    @Test
    public void 사용자가_1_주먹을_입력하고_컴퓨터가_1을_입력하면_DRAW() {
        RPC userRPC = user.putRPC(1);
        RPC computerRPC = computer.putRPC(1);
        GameResult gameResult = rpcGame.game(userRPC, computerRPC);

        assertEquals(GameResult.DRAW, gameResult);
    }

    @Test
    public void 사용자가_1_주먹을_입력하고_컴퓨터가_2_보를_입력하면_LOSE() {
        RPC userRPC = user.putRPC(1);
        RPC computerRPC = computer.putRPC(2);
        GameResult gameResult = rpcGame.game(userRPC, computerRPC);

        assertEquals(GameResult.LOSE, gameResult);
    }

    @Test
    public void 사용자가_1_주먹을_입력하고_컴퓨터가_3_가위를_입력하면_WIN() {
        RPC userRPC = user.putRPC(1);
        RPC computerRPC = computer.putRPC(3);
        GameResult gameResult = rpcGame.game(userRPC, computerRPC);

        assertEquals(GameResult.WIN, gameResult);
    }
}
