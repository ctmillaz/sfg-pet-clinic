package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.ConstructorInjectedController;
import guru.springframework.sfgpetclinic.controllers.MyController;
import guru.springframework.sfgpetclinic.controllers.PropertyInjectedController;
import guru.springframework.sfgpetclinic.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SfgPetClinicApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}
}
