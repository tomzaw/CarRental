package tom.carrental.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.ClientForm;

@Controller
public class AdminClientFormController {

    @GetMapping("/admin-client-form")
    public String adminClientForm(Model mod) {

        List<ClientForm> clientsForms = new ArrayList<>();

        ClientForm clientForm1 = new ClientForm("Name1", "Name1", "name1@foo.com", 1001);
        clientForm1.setId(1);
        clientsForms.add(clientForm1);
        ClientForm clientForm2 = new ClientForm("Name2", "Name2", "name2@foo.com", 1002);
        clientForm2.setId(2);
        clientsForms.add(clientForm2);
        ClientForm clientForm3 = new ClientForm("Name3", "Name3", "name3@foo.com", 1003);
        clientForm3.setId(3);
        clientsForms.add(clientForm3);
        ClientForm client4 = new ClientForm("Name4", "Name4", "name4@foo.com", 1004);
        client4.setId(4);
        clientsForms.add(client4);

        mod.addAttribute("clientsForms", clientsForms);

        return "adminClientForm";
    }

    @GetMapping("/admin-client-form-add/")
    public String adminClientFormAddGet() {

        return "adminClientFormAdd";
    }

    @PostMapping("/admin-client-form-add/")
    public String adminClientFormAddPost() {

        return "adminClientForm";
    }

    @GetMapping("/admin-client-form-edit/{id}")
    public String adminClientFormsEditGet(@PathVariable String id) {

        return "adminClientFormEdit";
    }

    @PostMapping("/admin-client-form-edit/{id}")
    public String adminClientFormsEditPost(@PathVariable String id) {

        return "adminClientForm";
    }

    @GetMapping("/admin-client-form-delete/{id}")
    public String adminClientFormsDelete(@PathVariable String id) {

        return "adminClientForm";
    }
}
