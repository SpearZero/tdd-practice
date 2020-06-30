public class RCPConverter {
    public RCP convert(int input) {
        if(1 == input) return RCP.ROCK;
        if(2 == input) return RCP.PAPER;
        if(3 == input) return RCP.SCISSORS;

        return RCP.INVALID;
    }
}
