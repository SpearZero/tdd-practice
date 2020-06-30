abstract public class Participant {
    protected RPCGame rcpConverter;

    public Participant() {}

    public Participant(RPCGame rcpConverter) {
        this.rcpConverter = rcpConverter;
    }

    abstract public RPC putRPC();

    abstract public RPC putRPC(int input);
}
