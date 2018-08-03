package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.GreetingService;
import guru.springframework.sfgpetclinic.services.GreetingServiceImpl;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
