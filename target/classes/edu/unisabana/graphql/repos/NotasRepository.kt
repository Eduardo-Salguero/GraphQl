package edu.unisabana.graphql.repos

import edu.unisabana.graphql.domain.Notas
import org.springframework.data.jpa.repository.JpaRepository
import edu.unisabana.graphql.domain.Hobby
import edu.unisabana.graphql.domain.Materia


interface NotasRepository : JpaRepository<Notas, Long>{
    
    fun findByMateria_Id(materiaId: Long): List<Notas>

    fun findByHobbie_Id(hobbyId: Int): List<Notas>


}

