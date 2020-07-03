import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RPCTest {
    private RPCConverter converter = new RPCConverter();
    private RPCGame rpcGame = new RPCGame();
    private User user = new User(converter);
    private Computer computer = new Computer(converter);

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
        GameResult gameResult = playAndResult(1,1);

        assertEquals(GameResult.DRAW, gameResult);
    }

    @Test
    public void 사용자가_1_주먹을_입력하고_컴퓨터가_2_보를_입력하면_LOSE() {
        GameResult gameResult = playAndResult(1,2);

        assertEquals(GameResult.LOSE, gameResult);
    }

    @Test
    public void 사용자가_1_주먹을_입력하고_컴퓨터가_3_가위를_입력하면_WIN() {
        GameResult gameResult = playAndResult(1,3);

        assertEquals(GameResult.WIN, gameResult);
    }

    @Test
    public void 사용자가_2_보를_입력하고_컴퓨터가_1을_입력하면_WIN() {
        GameResult gameResult = playAndResult(2,1);

        assertEquals(GameResult.WIN, gameResult);
    }

    @Test
    public void 사용자가_2_보를_입력하고_컴퓨터가_2를_입력하면_DRAW() {
        GameResult gameResult = playAndResult(2,2);

        assertEquals(GameResult.DRAW, gameResult);
    }

    @Test
    public void 사용자가_2_보를_입력하고_컴퓨터가_3을_입력하면_LOSE() {
        GameResult gameResult = playAndResult(2,3);

        assertEquals(GameResult.LOSE, gameResult);
    }

    @Test
    public void 사용자가_3_가위를_입력하고_컴퓨터가_1을_입력하면_LOSE() {
        GameResult gameResult = playAndResult(3,1);

        assertEquals(GameResult.LOSE, gameResult);
    }

    @Test
    public void 사용자가_3_가위를_입력하고_컴퓨터가_2를_입력하면_WIN() {
        GameResult gameResult = playAndResult(3,2);

        assertEquals(GameResult.WIN, gameResult);
    }

    @Test
    public void 사용자가_3_가위를_입력하고_컴퓨터가_3을_입력하면_DRAW() {
        GameResult gameResult = playAndResult(3,3);

        assertEquals(GameResult.DRAW, gameResult);
    }

    @Test
    public void 사용자가_유효한_값을_입력하지_않을경우_INVALID() {
        GameResult gameResult = playAndResult(-1,4);
        assertEquals(GameResult.INVALID, gameResult);

        gameResult = playAndResult(100, 3);
        assertEquals(GameResult.INVALID, gameResult);
    }

    private GameResult playAndResult(int userInput, int computerInput) {
        RPC userRPC = user.putRPC(userInput);
        RPC computerRPC = computer.putRPC(computerInput);
        GameResult gameResult = rpcGame.game(userRPC, computerRPC);

        return gameResult;
    }
}
