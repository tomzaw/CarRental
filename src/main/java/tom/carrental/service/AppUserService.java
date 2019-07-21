package tom.carrental.service;

import java.util.List;
import org.springframework.stereotype.Service;
import tom.carrental.model.AppUser;
import tom.carrental.repository.AppUserRepository;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> findAll() {

        List<AppUser> users = appUserRepository.findAll();
        return users;
    }

    public AppUser find(int id) {

        AppUser user = appUserRepository.findById(id).get();
        return user;
    }

    public void save(AppUser user) {

        appUserRepository.save(user);
    }

    public void delete(int id) {

        appUserRepository.deleteById(id);
    }
}
