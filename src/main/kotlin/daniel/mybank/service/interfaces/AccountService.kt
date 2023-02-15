package daniel.mybank.service.interfaces

import daniel.mybank.model.Account
import daniel.mybank.model.request.Request
import daniel.mybank.model.request.TransferRequest

interface AccountService {
    fun createAccount (account: Account) : Account
    fun getAccountById (id: Long): Account
    fun getAccounts (): List<Account>
    fun isAccountAlreadyExist (cpf: String)

    fun makeTransfer (transferRequest: TransferRequest) : Map<String, Account>
    fun makeDebitVerify (debitRequest: Request): Account
    fun makeDepositVerify (depositRequest: Request): Account

    fun doDebit (accountFrom: Account, debitRequest: Request)
    fun doDeposit (accountTo: Account, depositRequest: Request)

}


