package tom.carrental.fixture;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import tom.carrental.model.ClientForm;
import tom.carrental.repository.ClientFormRepository;

@Component
public class ClientFormFixture {

    private ClientFormRepository clientFormRepository;

    public ClientFormFixture(ClientFormRepository clientFormRepository) {
        this.clientFormRepository = clientFormRepository;
    }

    @PostConstruct
    public void init() {

        ClientForm clientForm1 = new ClientForm("Name1", "Name1", "name1@foo.com", "1001");

        ClientForm clientForm2 = new ClientForm("Name2", "Name2", "name2@foo.com", "1002");

        ClientForm clientForm3 = new ClientForm("Name3", "Name3", "name3@foo.com", "1003");

        ClientForm clientForm4 = new ClientForm("Name4", "Name4", "name4@foo.com", "1004");

        clientFormRepository.save(clientForm1);
        clientFormRepository.save(clientForm2);
        clientFormRepository.save(clientForm3);
        clientFormRepository.save(clientForm4);
    }
}
