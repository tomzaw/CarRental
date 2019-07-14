package tom.carrental.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.Client;

@Controller
public class AdminClientController {

    @GetMapping("/admin-client")
    public String adminClient(Model mod) {

        List<Client> clients = new ArrayList<>();

        Client client1 = new Client("Name1", "Name1", "name1@foo.com", 100100100);
        client1.setId(1);
        clients.add(client1);
        Client client2 = new Client("Name2", "Name2", "name2@foo.com", 1002);
        client2.setId(2);
        clients.add(client2);
        Client client3 = new Client("Name3", "Name3", "name3@foo.com", 1003);
        client3.setId(3);
        clients.add(client3);
        Client client4 = new Client("Name4", "Name4", "name4@foo.com", 1004);
        client4.setId(4);
        clients.add(client4);

        mod.addAttribute("clients", clients);

        return "adminClient";
    }

    @GetMapping("/admin-client-add")
    public String adminClientAddGet() {

        return "adminClientAdd";
    }

    @PostMapping("/admin-client-add")
    public String adminClientAddPost() {

        return "adminClient";
    }

    @GetMapping("/admin-client-edit/{id}")
    public String adminClientEditGet(@PathVariable String id) {

        return "adminClientEdit";
    }

    @PostMapping("/admin-client-edit/{id}")
    public String adminClientEditPost(@PathVariable String id) {

        return "adminClient";
    }

    @GetMapping("/admin-client-delete/{id}")
    public String adminClientDelete(@PathVariable String id) {

        return "adminClient";
    }
}
