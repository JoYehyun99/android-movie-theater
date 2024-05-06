package woowacourse.movie.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import woowacourse.movie.utils.formatSeat
import java.text.DecimalFormat

@Parcelize
data class Ticket(val movieTitle: String, val screeningDateTime: String, val selectedSeats: List<Seat>, val theaterId: Long = 0L) :
    Parcelable {
    private val totalPrice = selectedSeats.sumOf { it.seatGrade.price }
    val totalCount = selectedSeats.size

    fun selectedSeatsToString(): String = selectedSeats.joinToString(", ") { formatSeat(it) }

    fun totalPriceToString(): String = decimal.format(totalPrice)

    companion object {
        val decimal = DecimalFormat("#,###")
    }
}
