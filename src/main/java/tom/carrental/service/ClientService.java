package tom.carrental.service;

import java.util.List;
import org.springframework.stereotype.Service;
import tom.carrental.model.Client;
import tom.carrental.repository.ClientRepository;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {

        List<Client> clients = clientRepository.findAll();
        return clients;
    }

    public Client find(int id) {

        Client clients = clientRepository.findById(id).get();
        return clients;
    }

    public void save(Client clients) {

        clientRepository.save(clients);
    }

    public void delete(int id) {

        clientRepository.deleteById(id);
    }
}
