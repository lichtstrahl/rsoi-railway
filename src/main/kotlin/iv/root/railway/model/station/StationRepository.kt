package iv.root.railway.model.station

import org.springframework.data.jpa.repository.JpaRepository

interface StationRepository : JpaRepository<Station, Long> {
}