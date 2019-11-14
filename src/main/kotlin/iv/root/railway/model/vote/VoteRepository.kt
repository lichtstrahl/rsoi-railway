package iv.root.railway.model.vote

import org.springframework.data.jpa.repository.JpaRepository

interface VoteRepository : JpaRepository<Vote, Long> {
}