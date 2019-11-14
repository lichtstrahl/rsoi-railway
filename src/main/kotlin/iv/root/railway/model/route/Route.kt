package iv.root.railway.model.route

import iv.root.railway.model.station.Station
import lombok.Data
import java.io.Serializable
import javax.persistence.*

@Entity(name = "route")
data class Route (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "name", nullable = false)
        var name: String,
// ---------------------
        @OneToMany(mappedBy = "route", orphanRemoval = true)
        var stations: Set<Station>
): Serializable