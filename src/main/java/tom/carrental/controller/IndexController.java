package tom.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.ClientForm;

@Controller
public class IndexController {

    @GetMapping("/hello")
    public String index() {

        return "index";
    }

    @GetMapping("/car")
    public String hello() {

        return "car";
    }

    @GetMapping("/car/{company}/{model}/{version}")
    public String vehicle(@PathVariable String company, @PathVariable String model, @PathVariable String version, Model mod) {

        mod.addAttribute("company", company);
        mod.addAttribute("model", model);
        mod.addAttribute("version", version);

        return "vehicle";
    }

    @PostMapping("/post-client-form")
    public String postClientForm(Model mod) {

        ClientForm clientForm1 = new ClientForm();

        return "car";
    }

    @GetMapping("/about")
    public String about() {

        return "about";
    }
}
