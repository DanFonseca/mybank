package daniel.mybank.service.interfaces

import daniel.mybank.model.Client
import org.springframework.stereotype.Service

@Service
interface ClientService {
    fun findClientByCPF (cpf: String) : Client?
}