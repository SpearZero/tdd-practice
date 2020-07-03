public class RPCGame {
    public GameResult game(RPC userRPC, RPC computerRPC) {
        if(userRPC == computerRPC) return GameResult.DRAW;

        GameResult result = GameResult.DRAW;
        if(userRPC == RPC.ROCK) {
            if(computerRPC == RPC.PAPER) result = GameResult.LOSE;
            if(computerRPC == RPC.SCISSORS) result = GameResult.WIN;
        } else if(userRPC == RPC.PAPER) {
            if(computerRPC == RPC.ROCK) result = GameResult.WIN;
            if(computerRPC == RPC.SCISSORS) result = GameResult.LOSE;
        }

        return result;
    }
}
