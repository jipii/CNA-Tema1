package service;

import proto.ProcessGrpc;
import proto.Server;

import java.util.Calendar;

public class Process extends ProcessGrpc.ProcessImplBase {
    @Override
    public void process(Server.Request request, io.grpc.stub.StreamObserver<Server.Response> responseObserver) {

        String gender=null;
        if (request.getCnp().length() != 13) {
            Status status = Status.OUT_OF_RANGE.withDescription("CNP invalid!");
            responseObserver.onError(status.asRuntimeException());
        }else {

            if (request.getCnp().charAt(0) == '5' || request.getCnp().charAt(0) == '1')
                gender = "Male";
            else {
                if (request.getCnp().charAt(0) == '6' || request.getCnp().charAt(0) == '2')
                    gender = "Female";
                else
                    System.out.println("CNP invalid!");
            }

            int day;

            if (request.getCnp().charAt(5) != 0) {
                day = Integer.parseInt(request.getCnp().substring(5, 7));
            } else {
                day = day = Integer.parseInt(request.getCnp().substring(6, 7));
            }

            int month;

            if (request.getCnp().charAt(3) != 0) {
                month = Integer.parseInt(request.getCnp().substring(3, 5));
            } else {
                month = Integer.parseInt(request.getCnp().substring(4, 5));
            }

            int year = Integer.parseInt(request.getCnp().substring(1, 2));

            long currentTime = System.currentTimeMillis();
            Calendar now = Calendar.getInstance();
            now.setTimeInMillis(currentTime);

            int age = now.get(Calendar.YEAR) - year;

            if (now.get(Calendar.MONTH) + 1 - month < 0) {
                age--;
            }

            if (now.get(Calendar.MONTH) + 1 - month == 0) {
                if (now.get(Calendar.DAY_OF_MONTH) - day < 0)
                    age--;
            }
            System.out.println(request.getName() + " " + gender + " " + age);
        }
    }
}
