package tom.carrental.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String postClientForm(@Valid ClientForm clientForm, BindingResult errors) {

        if (errors.hasErrors()) {
            return "redirect:/car";
        }

        cfs.save(clientForm);
        return "redirect:/car";
    }
    
    /*
    @PostMapping("/post-client-form/{company}/{model}/{version}/{id}")
    public String postClientForm(@PathVariable String company, @PathVariable String model, @PathVariable String version, @PathVariable String id,
            @Valid ClientForm clientForm, BindingResult errors) {

        if (errors.hasErrors()) {
            return "redirect:/car/" + company + "/" + model + "/" + version + "/" + id;
        }

        cfs.save(clientForm);
        return "redirect:/car";
    }
    */

    @GetMapping("/about")
    public String about() {

        return "about";
    }
}
