package tom.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String vehicle(@PathVariable String company, @PathVariable String model, @PathVariable String version, Model mod1) {

        mod1.addAttribute("company", company);
        mod1.addAttribute("model", model);
        mod1.addAttribute("version", version);

        return "vehicle";
    }

//    @GetMapping("/car?{company}&{model}&{version}")
//    //@GetMapping("/car")
//    public String vehicle(@RequestParam String company, @RequestParam String model, @RequestParam String version, Model mod1) {
//
//        mod1.addAttribute("company", company);
//        mod1.addAttribute("model", model);
//        mod1.addAttribute("version", version);
//
//        return "vehicle";
//    }
    @GetMapping("/about")
    public String about() {

        return "about";
    }
}
