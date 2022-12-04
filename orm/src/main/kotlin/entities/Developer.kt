package entities

import org.hibernate.annotations.NaturalId
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Developer(
    @Id
    @GeneratedValue
    var id: Long = 0,

    @NaturalId
    @Column(length = 100, nullable = false)
    var name: String
)