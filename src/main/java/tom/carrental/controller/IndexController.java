package tom.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.ClientForm;
import tom.carrental.service.ClientFormService;
import tom.carrental.service.VehicleService;

@Controller
public class IndexController {

    private ClientFormService cfs;
    private VehicleService vs;

    public IndexController(ClientFormService cfs, VehicleService vs) {
        this.cfs = cfs;
        this.vs = vs;
    }

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/car")
    public String car() {

        return "car";
    }

    @GetMapping("/car/{company}/{model}/{version}/{id}")
    public String vehicle(@PathVariable int id, Model mod) {

        mod.addAttribute("vehicle", vs.find(id));
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
