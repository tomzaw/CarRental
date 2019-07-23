package tom.carrental.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.ClientForm;
import tom.carrental.service.ClientFormService;

@Controller
public class AdminClientFormController {

    private ClientFormService clientFormService;

    public AdminClientFormController(ClientFormService clientFormService) {
        this.clientFormService = clientFormService;
    }

    @GetMapping("/admin-client-form")
    public String adminClientForm(Model mod) {

        List<ClientForm> clientsForms = clientFormService.findAll();
        mod.addAttribute("clientsForms", clientsForms);
        return "adminClientForm";
    }

    @GetMapping("/admin-client-form-add")
    public String adminClientFormAddGet(Model mod) {

        mod.addAttribute("clientForm", new ClientForm());
        return "adminClientFormAdd";
    }

    @PostMapping("/admin-client-form-add")
    public String adminClientFormAddPost(@Valid ClientForm clientForm, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminClientFormAdd";
        }

        clientFormService.save(clientForm);
        return "redirect:/admin-client-form";
    }

    @GetMapping("/admin-client-form-edit/{id}")
    public String adminClientFormsEditGet(@PathVariable int id, Model mod) {

        mod.addAttribute("clientForm", clientFormService.find(id));
        return "adminClientFormAdd";
    }

    @PostMapping("/admin-client-form-edit/{id}")
    public String adminClientFormsEditPost(@Valid ClientForm clientForm, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminClientFormAdd";
        }

        clientFormService.save(clientForm);
        return "redirect:/admin-client-form";
    }

    @GetMapping("/admin-client-form-delete/{id}")
    public String adminClientFormsDelete(@PathVariable int id) {

        clientFormService.delete(id);
        return "redirect:/admin-client-form";
    }
}
