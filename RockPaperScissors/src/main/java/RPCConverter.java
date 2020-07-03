public class RPCConverter {
    public RPC convert(int input) {
        if(1 == input) return RPC.ROCK;
        if(2 == input) return RPC.PAPER;
        if(3 == input) return RPC.SCISSORS;

        return RPC.INVALID;
    }
}
