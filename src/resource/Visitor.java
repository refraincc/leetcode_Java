package Resource;


import java.util.*;


public abstract class Visitor<E> {
    boolean stop;

    abstract boolean visit(E emement);
}
