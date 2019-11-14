package iv.root.railway.model.route

import org.springframework.data.jpa.repository.JpaRepository

interface RouteRepository : JpaRepository<Route, Long> {
}