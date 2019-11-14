package iv.root.railway.model.station

import iv.root.railway.model.route.Route
import iv.root.railway.model.vote.Vote
import java.io.Serializable
import javax.persistence.*

@Entity(name = "station")
data class Station (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "name", nullable = false)
        var name: String,
        @ManyToOne
        @JoinColumn(name = "route", referencedColumnName = "id", nullable = false)
        var route: Route,
        @Column(name = "exit", nullable = false)
        var exit: Int,
        @Column(name = "wicket", nullable = false)
        var wicket: Boolean,
// ------------------------
        @OneToMany(mappedBy = "station", orphanRemoval = true)
        var votes: Set<Vote>
): Serializable