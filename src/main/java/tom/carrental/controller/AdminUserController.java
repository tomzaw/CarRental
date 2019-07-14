package tom.carrental.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.AppUser;

@Controller
public class AdminUserController {

    @GetMapping("/admin-user")
    public String adminUser(Model mod) {

        List<AppUser> users = new ArrayList<>();

        AppUser user1 = new AppUser("Username1", "name1@foo.com", "Password1");
        user1.setId(1);
        users.add(user1);
        AppUser user2 = new AppUser("Username2", "name2@foo.com", "Password2");
        user2.setId(2);
        users.add(user2);

        mod.addAttribute("users", users);

        return "adminAppUser";
    }

    @GetMapping("/admin-user-add")
    public String adminUserAddGet() {

        return "adminAppUser";
    }

    @PostMapping("/admin-user-add")
    public String adminUserAddPost() {

        return "adminAppUser";
    }

    @GetMapping("/admin-user-edit/{id}")
    public String adminUserEditGet(@PathVariable String id) {

        return "adminAppUser";
    }

    @PostMapping("/admin-user-edit/{id}")
    public String adminUserEditPost(@PathVariable String id) {

        return "adminAppUser";
    }

    @GetMapping("/admin-user-delete/{id}")
    public String adminUserDelete(@PathVariable String id) {

        return "adminAppUser";
    }
}
