package aula18;

import java.io.IOException;

public class HandleError {

    public static void main(String[] args) {
        HandleError handleError = new HandleError();
        try {
            handleError.doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doSomething() throws IOException{
        try {
            System.out.println("before");
            error();
            System.out.println("after");
        }finally {
            System.out.println("finally");
        }
    }

    public void error() throws IOException {
        int a = 10 / 0;
        throw new IOException();
    }

}
