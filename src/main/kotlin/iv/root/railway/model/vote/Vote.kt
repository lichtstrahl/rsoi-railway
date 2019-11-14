package iv.root.railway.model.vote

import iv.root.railway.model.station.Station
import lombok.Data
import java.io.Serializable
import javax.persistence.*

@Data
@Entity(name = "vote")
data class Vote (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "value", nullable = false)
        var value: Int,
        @Column(name = "user_id", nullable = false)
        var userID: Long,
        @ManyToOne
        @JoinColumn(name = "station_id", referencedColumnName = "id", nullable = false)
        var station: Station,
        @Column(name = "comment")
        var comment: String?
): Serializable