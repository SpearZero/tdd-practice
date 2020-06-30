public class RPCGame {
    public RPC convert(int input) {
        if(1 == input) return RPC.ROCK;
        if(2 == input) return RPC.PAPER;
        if(3 == input) return RPC.SCISSORS;

        return RPC.INVALID;
    }

    public GameResult game(RPC userRPC, RPC computerRPC) {
        if(userRPC == computerRPC) return GameResult.DRAW;

        GameResult result = GameResult.DRAW;
        if(userRPC == RPC.ROCK) {
            if(computerRPC == RPC.PAPER) result = GameResult.LOSE;
            if(computerRPC == RPC.SCISSORS) result = GameResult.WIN;
        }

        return result;
    }
}
