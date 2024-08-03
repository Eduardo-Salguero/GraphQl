package edu.unisabana.graphql.repos

import edu.unisabana.graphql.domain.Hobby
import edu.unisabana.graphql.domain.Notas
import org.springframework.data.jpa.repository.JpaRepository


interface HobbyRepository : JpaRepository<Hobby, Int>{
    fun findNotasById(hobbyId: Int): List<Notas>
}
