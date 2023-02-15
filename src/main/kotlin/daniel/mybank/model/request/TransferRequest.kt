package daniel.mybank.model.request

import java.math.BigDecimal

class TransferRequest (
        val accountIdFrom: Long,
        val accountIdTo: Long,
        val amount: BigDecimal) {
}