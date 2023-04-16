package metier;

import dao.IUSB;
import dao.IVGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class UniteCentral  {



  IVGA vga;
  IUSB usb;


    public UniteCentral(IVGA vga, IUSB usb) {
        this.vga= vga;
        this.usb = usb;
    }

    public int readData(){

        return usb.read() ;
    }
    public void  printData(String data){
        vga.print(data);
    }




}
