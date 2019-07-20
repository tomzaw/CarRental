package tom.carrental.fixture;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import tom.carrental.model.AppUser;
import tom.carrental.repository.AppUserRepository;

@Component
public class AppUserFixture {

    private AppUserRepository appUserRepository;

    public AppUserFixture(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @PostConstruct
    public void init() {

        AppUser user1 = new AppUser("Username1", "name1@foo.com", "Password1");

        AppUser user2 = new AppUser("Username2", "name2@foo.com", "Password2");

        appUserRepository.save(user1);
        appUserRepository.save(user2);
    }
}
