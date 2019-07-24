package tom.carrental.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tom.carrental.model.AppUser;
import tom.carrental.service.AppUserService;

@Controller
public class AdminUserController {

    private AppUserService appUserService;

    public AdminUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/admin-user")
    public String adminUser(Model mod) {

        List<AppUser> users = appUserService.findAll();
        mod.addAttribute("users", users);
        return "adminAppUser";
    }

    @GetMapping("/admin-user-add")
    public String adminUserAddGet(Model mod) {

        mod.addAttribute("appUser", new AppUser());
        return "adminAppUserAdd";
    }

    @PostMapping("/admin-user-add")
    public String adminUserAddPost(@Valid AppUser appUser, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminAppUserAdd";
        }

        appUserService.save(appUser);
        return "redirect:/admin-user";
    }

    @GetMapping("/admin-user-edit/{id}")
    public String adminUserEditGet(@PathVariable int id, Model mod) {

        mod.addAttribute("appUser", appUserService.find(id));
        return "adminAppUserAdd";
    }

    @PostMapping("/admin-user-edit/{id}")
    public String adminUserEditPost(@Valid AppUser appUser, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminAppUserAdd";
        }

        appUserService.save(appUser);
        return "redirect:/admin-user";
    }

    @GetMapping("/admin-user-delete/{id}")
    public String adminUserDelete(@PathVariable int id) {

        appUserService.delete(id);
        return "redirect:/admin-user";
    }

    @GetMapping("/login")
    public String adminUserLoginGet() {

        return "login";
    }

    @PostMapping("/login")
    public String adminUserLoginPost(@RequestParam String email, @RequestParam String password) {

        return "index";
    }
}
