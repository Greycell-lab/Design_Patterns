package EntenVerhalten.Flug;

public class FliegtGarNicht implements FlugVerhalten{
    @Override
    public void fliegen() {
        System.out.println("Die Ente kann nicht fliegen");
    }
}
