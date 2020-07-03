abstract public class Participant {
    protected RPCConverter rcpConverter;

    public Participant() {}

    public Participant(RPCConverter rcpConverter) {
        this.rcpConverter = rcpConverter;
    }

    abstract public RPC putRPC();

    abstract public RPC putRPC(int input);
}
