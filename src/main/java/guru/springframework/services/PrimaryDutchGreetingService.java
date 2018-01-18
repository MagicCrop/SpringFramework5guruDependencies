package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("nl")
@Primary
public class PrimaryDutchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Dit is de primary greetings bean";
    }
}
