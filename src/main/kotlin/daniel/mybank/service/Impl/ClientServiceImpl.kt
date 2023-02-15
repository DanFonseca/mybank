package daniel.mybank.service.Impl

import daniel.mybank.service.Util.CPFUtil
import daniel.mybank.model.Client
import daniel.mybank.repository.ClientRepository
import daniel.mybank.service.interfaces.ClientService
import org.springframework.stereotype.Service

@Service
class ClientServiceImpl (
        val clientRepository: ClientRepository
        ) : ClientService {

    override fun findClientByCPF(cpf: String): Client? {
        CPFUtil.myValidateCPF(cpf)
        return clientRepository.findByCpf(cpf)
    }
}