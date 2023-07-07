package com.tnsoft.entities;

import javax.persistence.*;
import java.util.List;

// This class represents the model of our object in the database
@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//the discriminator is used in the case of single table strategy, the other 2 strategies are InheritanceType.TABLE_PER_CLASS and InheritanceType.JOINED
//@DiscriminatorColumn(name = "type")
@Table(name = "T_Students")
public class StudentEntity {
    //GeneratedValue has 4 strategies
    //GenerationType.IDENTITY it is auto incremented, GenerationType.TABLE, GenerationType.SEQUENCE
    //GenerationType.AUTO can be either table or sequence depending on the db used

    //to use a composed key:
        // start by creating a class containing the fields that make up the composed key
        // redefine the methods hashcode and equals in the created class
        // add the annotation @Embeddable and implement the class Serializable
        // Second approach : we can also annotate both the code and id fields with @Id within the class StudentEntity which needs to be annotated with @IdClass(StudentId.class), the class StudentId is till needed
    @Column(name = "student_name")
    private String name;
    @EmbeddedId
    private StudentId id;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "street_residence")),
            @AttributeOverride(name = "avenue", column = @Column(name = "avenue_residence")),
            @AttributeOverride(name = "number", column = @Column(name = "number_residence"))
    })
    private Address address;
    @ManyToMany(cascade = {CascadeType.MERGE,
            CascadeType.PERSIST,
    },fetch = FetchType.EAGER
    )
    @JoinTable(name ="list_courses_students")
    private List<CourseEntity> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentId getId() {
        return id;
    }

    public void setId(StudentId id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
