package iv.root.railway.route

import java.io.Serializable
import javax.persistence.*

@Entity(name = "route")
data class Route (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "name", nullable = false)
        var name: String
): Serializable