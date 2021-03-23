import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Client;
import proto.ProcessGrpc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();

        ProcessGrpc.ProcessBlockingStub dataStub = ProcessGrpc.newBlockingStub(channel);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nume: ");
        String name = scanner.nextLine();
        System.out.println("CNP: ");
        String cnp = scanner.next();

        Client.Response response = dataStub.process(Client.Request.newBuilder().setName(name).setCnp(cnp).build());
        System.out.println(response.getResponse());

        channel.shutdown();
    }
}
