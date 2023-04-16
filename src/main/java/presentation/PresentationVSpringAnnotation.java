package presentation;

import metier.UniteCentral;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PresentationVSpringAnnotation {
    public static void main(String[] args) {

        ApplicationContext springContext=new AnnotationConfigApplicationContext("dao","metier");
        UniteCentral uc=springContext.getBean(UniteCentral.class);
        uc.printData("Hello");
        System.out.println(uc.readData());
    }
}
