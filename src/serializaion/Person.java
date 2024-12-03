package serializaion;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;
    private Address country; // must be serializable too
}
