package tom.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.ClientForm;
import tom.carrental.service.ClientFormService;

@Controller
public class IndexController {

    private ClientFormService cfs;

    public IndexController(ClientFormService cfs) {
        this.cfs = cfs;
    }

    @GetMapping("/hello")
    public String index() {

        return "index";
    }

    @GetMapping("/car")
    public String hello() {

        return "car";
    }

    @GetMapping("/car/{company}/{model}/{version}")
    public String vehicle(Model mod) {

        mod.addAttribute("clientForm", new ClientForm());
        return "vehicle";
    }

    @PostMapping("/post-client-form")
    public String postClientForm(ClientForm clientForm) {

        cfs.save(clientForm);
        return "car";
    }

    @GetMapping("/about")
    public String about() {

        return "about";
    }
}
