package edu.unisabana.graphql.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.ManyToMany
import jakarta.persistence.JoinTable
import jakarta.persistence.JoinColumn


@Entity
class Notas {

    @Id
    @Column(
        nullable = false,
        updatable = false
    )
    @SequenceGenerator(
        name = "primary_sequence",
        sequenceName = "primary_sequence",
        allocationSize = 1,
        initialValue = 10000
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "primary_sequence"
    )
    var id: Long? = null

    @Column(nullable = false)
    var actividad: String? = null

    @Column(nullable = false)
    var nota: Int? = null

    @ManyToMany
    @JoinTable(
        name = "NotaMateria",
        joinColumns = [
            JoinColumn(name = "notaId")
        ],
        inverseJoinColumns = [
            JoinColumn(name = "materiaId")
        ]
    )
    var materia: MutableSet<Materia>? = null

    @ManyToMany
    @JoinTable(
        name = "NotaHobbie",
        joinColumns = [
            JoinColumn(name = "notaId")
        ],
        inverseJoinColumns = [
            JoinColumn(name = "hobbyId")
        ]
    )
    var hobbie: MutableSet<Hobby>? = null

}
