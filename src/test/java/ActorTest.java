import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.io.IOException;

public class ActorTest {
    public static void main(String[] args) throws IOException {
        ActorSystem system = ActorSystem.create("test-system");
        for (int i=0;i<100;i++) {
            ActorRef myActorRef
                    = system.actorOf(MyActor.props("actor-addres"+i), "my-actor-"+i);

            myActorRef.tell("hi from id:"+i, myActorRef);
        }


    }
}

class MyActor extends AbstractActor {

    private String address;
    private static int counter = 0 ;

    public MyActor(String address) {
        this.address = address;
    }

    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, message ->{
                    System.out.println("we receive a message from :" + sender()+ " and T:"+Thread.currentThread().getId()
                            + " "+ counter++ + " the message:\n"+ message);
                    Thread.sleep(500);
                    getSender().tell("tell my self!", getSelf());
                    getSender().tell("tell my ref!", getContext().actorFor("/user/my-actor"));
                }).build();
    }


    public static Props props(String text) {
        return Props.create(MyActor.class, text);
    }
}

