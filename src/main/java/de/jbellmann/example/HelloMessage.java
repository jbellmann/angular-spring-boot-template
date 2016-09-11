package de.jbellmann.example;

public class HelloMessage {
    String value = "Hello World";
    HelloMessage(String value){
        this.value = value;
    }

    HelloMessage(){}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
