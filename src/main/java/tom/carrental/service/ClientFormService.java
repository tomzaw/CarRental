package tom.carrental.service;

import java.util.List;
import org.springframework.stereotype.Service;
import tom.carrental.model.ClientForm;
import tom.carrental.repository.ClientFormRepository;

@Service
public class ClientFormService {

    private ClientFormRepository clientFormRepository;

    public ClientFormService(ClientFormRepository clientFormRepository) {
        this.clientFormRepository = clientFormRepository;
    }

    public List<ClientForm> findAll() {

        List<ClientForm> clientForms = clientFormRepository.findAll();
        return clientForms;
    }

    public ClientForm find(int id) {

        ClientForm clientForm = clientFormRepository.findById(id).get();
        return clientForm;
    }

    public void save(ClientForm clientForm) {

        clientFormRepository.save(clientForm);
    }

    public void delete(int id) {

        clientFormRepository.deleteById(id);
    }
}
