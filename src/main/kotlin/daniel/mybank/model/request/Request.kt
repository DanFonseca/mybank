package daniel.mybank.model.request

import java.math.BigDecimal

open class Request (
        open val accountId: Long,
        open val amount: BigDecimal
        ) {
}