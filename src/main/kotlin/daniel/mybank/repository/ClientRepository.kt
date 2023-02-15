package daniel.mybank.repository

import daniel.mybank.model.Client
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : CrudRepository<Client, String> {
    fun findByCpf (cpf: String): Client?
}