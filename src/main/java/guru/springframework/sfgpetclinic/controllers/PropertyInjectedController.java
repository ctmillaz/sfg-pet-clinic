package guru.springframework.sfgpetclinic.controllers;


import guru.springframework.sfgpetclinic.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
