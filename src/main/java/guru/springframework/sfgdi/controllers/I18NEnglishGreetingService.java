package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - i18n";
    }
}
