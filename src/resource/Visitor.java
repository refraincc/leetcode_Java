package Resource;

public abstract class Visitor {
    boolean stop;

    abstract boolean visit(E emement);
}
