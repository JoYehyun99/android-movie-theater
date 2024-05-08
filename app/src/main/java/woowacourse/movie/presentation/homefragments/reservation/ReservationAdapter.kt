package woowacourse.movie.presentation.homefragments.reservation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.movie.databinding.ItemReservationBinding
import woowacourse.movie.model.Reservation

class ReservationAdapter : RecyclerView.Adapter<ReservationViewHolder>() {
    private lateinit var reservations: List<Reservation>

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ReservationViewHolder {
        val binding =
            ItemReservationBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        return ReservationViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ReservationViewHolder,
        position: Int,
    ) {
        holder.bind(reservations[position])
    }

    override fun getItemCount(): Int {
        return reservations.size
    }

    fun updateReservations(newReservations: List<Reservation>) {
        reservations = newReservations
        notifyDataSetChanged()
    }
}