package tom.carrental.fixture;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import tom.carrental.model.Client;
import tom.carrental.repository.ClientRepository;

@Component
public class ClientFixture {

    private ClientRepository clientRepository;

    public ClientFixture(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostConstruct
    public void init() {

        Client client1 = new Client("Name1", "Name1", "name1@foo.com", "100100100");

        Client client2 = new Client("Name2", "Name2", "name2@foo.com", "100100102");

        Client client3 = new Client("Name3", "Name3", "name3@foo.com", "100100103");

        Client client4 = new Client("Name4", "Name4", "name4@foo.com", "100100104");

        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);
        clientRepository.save(client4);
    }
}
