package iv.root.railway.model.route

import lombok.Data
import java.io.Serializable
import javax.persistence.*

@Data
@Entity(name = "route")
data class Route (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "name", nullable = false)
        var name: String
): Serializable