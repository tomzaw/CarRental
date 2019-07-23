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

        ClientForm clientForm1 = new ClientForm("Name5", "Name5", "name5@foo.com", "100100105");

        ClientForm clientForm2 = new ClientForm("Name6", "Name6", "name6@foo.com", "100100106");

        ClientForm clientForm3 = new ClientForm("Name7", "Name7", "name7@foo.com", "100100107");

        ClientForm clientForm4 = new ClientForm("Name8", "Name8", "name8@foo.com", "100100108");

        clientFormRepository.save(clientForm1);
        clientFormRepository.save(clientForm2);
        clientFormRepository.save(clientForm3);
        clientFormRepository.save(clientForm4);
    }
}
