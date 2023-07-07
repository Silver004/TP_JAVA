package com.tnsoft.mappers;

import com.tnsoft.entities.Address;
import com.tnsoft.entities.CourseEntity;
import com.tnsoft.entities.StudentEntity;
import com.tnsoft.entities.StudentId;
import com.tnsoft.models.AddressDto;
import com.tnsoft.models.CourseDto;
import com.tnsoft.models.StudentDto;
import com.tnsoft.models.StudentIdDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T22:07:59+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentIdDto convertStudentIdEntityToIdDto(StudentId id) {
        if ( id == null ) {
            return null;
        }

        StudentIdDto studentIdDto = new StudentIdDto();

        studentIdDto.setId( id.getId() );
        studentIdDto.setCode( id.getCode() );

        return studentIdDto;
    }

    @Override
    public StudentId convertStudentIdDtoToIdEntity(StudentIdDto id) {
        if ( id == null ) {
            return null;
        }

        StudentId studentId = new StudentId();

        studentId.setId( id.getId() );
        studentId.setCode( id.getCode() );

        return studentId;
    }

    @Override
    public StudentEntity convertDtoToEntity(StudentDto x) {
        if ( x == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName( x.getName() );
        studentEntity.setId( convertStudentIdDtoToIdEntity( x.getId() ) );
        studentEntity.setAddress( addressDtoToAddress( x.getAddress() ) );
        studentEntity.setCourses( courseDtoListToCourseEntityList( x.getCourses() ) );

        return studentEntity;
    }

    @Override
    public StudentDto convertEntityToDto(StudentEntity x) {
        if ( x == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setName( x.getName() );
        studentDto.setId( convertStudentIdEntityToIdDto( x.getId() ) );
        studentDto.setAddress( addressToAddressDto( x.getAddress() ) );
        studentDto.setCourses( courseEntityListToCourseDtoList( x.getCourses() ) );

        return studentDto;
    }

    @Override
    public List<StudentEntity> convertListDtoToListEntities(List<StudentDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<StudentEntity> list = new ArrayList<StudentEntity>( dtoList.size() );
        for ( StudentDto studentDto : dtoList ) {
            list.add( convertDtoToEntity( studentDto ) );
        }

        return list;
    }

    @Override
    public List<StudentDto> convertListEntitiesToDtoList(List<StudentEntity> entitiesList) {
        if ( entitiesList == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>( entitiesList.size() );
        for ( StudentEntity studentEntity : entitiesList ) {
            list.add( convertEntityToDto( studentEntity ) );
        }

        return list;
    }

    protected Address addressDtoToAddress(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreet( addressDto.getStreet() );
        address.setAvenue( addressDto.getAvenue() );
        address.setNumber( addressDto.getNumber() );

        return address;
    }

    protected CourseEntity courseDtoToCourseEntity(CourseDto courseDto) {
        if ( courseDto == null ) {
            return null;
        }

        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setId( courseDto.getId() );
        courseEntity.setName( courseDto.getName() );

        return courseEntity;
    }

    protected List<CourseEntity> courseDtoListToCourseEntityList(List<CourseDto> list) {
        if ( list == null ) {
            return null;
        }

        List<CourseEntity> list1 = new ArrayList<CourseEntity>( list.size() );
        for ( CourseDto courseDto : list ) {
            list1.add( courseDtoToCourseEntity( courseDto ) );
        }

        return list1;
    }

    protected AddressDto addressToAddressDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setStreet( address.getStreet() );
        addressDto.setAvenue( address.getAvenue() );
        addressDto.setNumber( address.getNumber() );

        return addressDto;
    }

    protected CourseDto courseEntityToCourseDto(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setId( courseEntity.getId() );
        courseDto.setName( courseEntity.getName() );

        return courseDto;
    }

    protected List<CourseDto> courseEntityListToCourseDtoList(List<CourseEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CourseDto> list1 = new ArrayList<CourseDto>( list.size() );
        for ( CourseEntity courseEntity : list ) {
            list1.add( courseEntityToCourseDto( courseEntity ) );
        }

        return list1;
    }
}
