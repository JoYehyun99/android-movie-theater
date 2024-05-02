package woowacourse.movie.presentation.seatSelection

import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import woowacourse.movie.repository.MovieRepository

@ExtendWith(MockKExtension::class)
class SeatSelectionPresenterTest {
    private lateinit var presenter: SeatSelectionPresenter

    private val ticketCount = 3

    @MockK
    private lateinit var view: SeatSelectionContract.View

    @MockK
    private lateinit var repository: MovieRepository

    @BeforeEach
    fun setUp() {
        presenter = SeatSelectionPresenter(view, ticketCount, repository)
    }

    /*
    @Test
    fun `updateSeatSelection로 전달 받은 index 값의 좌석 상태가 빈 좌석일 경우, 선택된 좌석 UI로 업데이트 하도록 view에게 요청한다`() {

    }

    @Test
    fun `updateSeatSelection으로 전달 받은 index 값의 좌석 상태가 이미 선택된 좌석일 경우, 좌석 기본 UI로 업데이트 하도록 view에게 요청한다`() {

    }
     */
}
