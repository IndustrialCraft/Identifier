package com.github.industrialcraft.identifier;

public class Identifier {
    public final String namespace;
    public  final String id;
    private Identifier(String namespace, String id) {
        this.namespace = namespace;
        this.id = id;
    }
    public static Identifier of(String namespace, String id){
        return new Identifier(namespace, id);
    }
    public static Identifier parse(String input){
        String[] parsed = input.split(":");
        if(parsed.length != 2)
            throw new IllegalArgumentException("Input must have exactly 1 colon");
        return new Identifier(parsed[0], parsed[1]);
    }
    @Override
    public String toString() {
        return namespace + ":" + id;
    }
}
