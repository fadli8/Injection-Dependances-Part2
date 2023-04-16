package dao;

import org.springframework.stereotype.Component;

@Component

public class TV implements IHDMI {
    public TV() {
    }

    @Override
    public void print(byte[] data) {
        String d=new String(data);
        System.out.println(" TV : "+ d);

    }


}
