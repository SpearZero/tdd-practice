public class RPCGame {
    public GameResult game(RPC userRPC, RPC computerRPC) {
        return gameResult(userRPC, computerRPC);
    }

    private GameResult gameResult(RPC userRPC, RPC computerRPC) {
        GameResult result = GameResult.INVALID;
        if(userRPC == RPC.INVALID || computerRPC == RPC.INVALID) {
            return result;
        }

        if(userRPC == computerRPC) {
            result = GameResult.DRAW;
        } else if(userRPC == RPC.ROCK) {
            if(computerRPC == RPC.PAPER) result = GameResult.LOSE;
            if(computerRPC == RPC.SCISSORS) result = GameResult.WIN;
        } else if(userRPC == RPC.PAPER) {
            if(computerRPC == RPC.ROCK) result = GameResult.WIN;
            if(computerRPC == RPC.SCISSORS) result = GameResult.LOSE;
        } else if(userRPC == RPC.SCISSORS) {
            if(computerRPC == RPC.ROCK) result = GameResult.LOSE;
            if(computerRPC == RPC.PAPER) result = GameResult.WIN;
        }

        return result;
    }
}
