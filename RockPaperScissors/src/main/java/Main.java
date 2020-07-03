import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RPCConverter converter = new RPCConverter();
        RPCGame rpcGame = new RPCGame();
        User user = new User(converter);
        Computer computer = new Computer(converter);

        Scanner sc = new Scanner(System.in);

        System.out.println("1(바위),2(보),3(가위) 중 하나를 입력하세요 : ");
        int n = sc.nextInt();

        RPC userRPC = user.putRPC(n);
        RPC computerRPC = computer.putRPC();
        System.out.println("사용자 : " + userRPC);
        System.out.println("컴퓨터 : " + computerRPC);
        System.out.println("결과 : " + rpcGame.game(userRPC, computerRPC));

    }
}
