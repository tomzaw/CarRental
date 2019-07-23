package tom.carrental.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.Client;
import tom.carrental.service.ClientService;

@Controller
public class AdminClientController {

    private ClientService clientService;

    public AdminClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/admin-client")
    public String adminClient(Model mod) {

        List<Client> clients = clientService.findAll();
        mod.addAttribute("clients", clients);
        return "adminClient";
    }

    @GetMapping("/admin-client-add")
    public String adminClientAddGet(Model mod) {

        mod.addAttribute("client", new Client());
        return "adminClientAdd";
    }

    @PostMapping("/admin-client-add")
    public String adminClientAddPost(@Valid Client client, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminClientAdd";
        }

        clientService.save(client);
        return "redirect:/admin-client";
    }

    @GetMapping("/admin-client-edit/{id}")
    public String adminClientEditGet(@PathVariable int id, Model mod) {

        mod.addAttribute("client", clientService.find(id));
        return "adminClientAdd";
    }

    @PostMapping("/admin-client-edit/{id}")
    public String adminClientEditPost(@Valid Client client, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminClientAdd";
        }

        clientService.save(client);
        return "redirect:/admin-client";
    }

    @GetMapping("/admin-client-delete/{id}")
    public String adminClientDelete(@PathVariable int id) {

        clientService.delete(id);
        return "redirect:/admin-client";
    }
}
