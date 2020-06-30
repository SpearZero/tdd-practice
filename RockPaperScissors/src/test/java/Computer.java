public class Computer extends Participant{

    public Computer() {
        super();
    }

    public Computer(RPCGame rcpConverter) {
        super(rcpConverter);
    }

    @Override
    public RPC putRPC() {
        int random = (int)(Math.random() * 3 + 1) ;
        return rcpConverter.convert(random);
    }

    @Override
    public RPC putRPC(int input) {
        return rcpConverter.convert(input);
    }
}
