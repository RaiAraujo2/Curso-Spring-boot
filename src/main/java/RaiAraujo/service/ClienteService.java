package RaiAraujo.service;

import RaiAraujo.model.Cliente;
import RaiAraujo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {

        //Jeito errado de fazer(Sem o uso do autowired)
        //ClienteRepository clienteRepository = new ClienteRepository();
        //clienteRepository.persistir(cliente);


        validarCliente(cliente);
        this.repository.persistir(cliente);
}

    public void validarCliente(Cliente cliente) {
        //TODO: Aplicar validações
    }
}
