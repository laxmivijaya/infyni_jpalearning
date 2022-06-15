package org.vijaycode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vijaycode.entity.Employee;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    Employee findByFirstName(String empName);
    Employee findByFirstNameIs(String empName);
    Employee findByFirstNameEquals(String empName);
    //if we are using And  that time both condition must satisfy otherwise data will not get
    Employee findByFirstNameAndLastName(String firstName,String lastName);

    //if we are using And  that any condition  satisfy otherwise data will not get
    List<Employee> findByFirstNameOrLastName(String firstName,String lastName);
    List<Employee> findByFirstNameAndLastNameOrAge(String firstName,String lastName,Integer age);
    List<Employee> findByAgeGreaterThan(Integer age);
    List<Employee> findByAgeLessThan(Integer age);
    List<Employee> findByAgeLessThanEqual(Integer age);
    List<Employee> findByAgeBetween(Integer ageLimit1,Integer ageLimit2);

    List<Employee> findByFirstNameStartingWith(Character startingCharacters);

    List<Employee> findByFirstNameEndingWith(Character startingCharacters);

    List<Employee> findByFirstNameEndingWithIgnoreCase(Character startingCharacters);

    List<Employee> findByFirstNameContaining(Character startingCharacters);

    List<Employee> findAllByAgeOrderByFirstNameDesc(Integer age);

    List<Employee> findByAgeOrderByFirstNameDesc(Integer age);

    List<Employee> findByIsActiveTrue();

    List<Employee> findByIsActiveFalse();

    List<Employee> findByIsActive(boolean isActive);


    //Not,In,NotIn,True,False,IgnoreCase,Like,NotLike,After,Before,Is,Equals,Between,LessThan,GreaterThan,LessThanEqual,GreaterThanEqual,Containing
    //orderBy,endingWith,StartingWith,And,Or











    //findBy<Property_Name_defined_IN_Entity_CAMELCASE>(<Value of input>)

    //1.save(entity)--> uses for creation and updation
    //creation mode when we are not sending primary key in request that time JPA will consider as create.(specify the generation type)(depend on situation)
    //Updation mode when we are sending primary key in request that time jpa will consider as update.(if primary key does not exist)
    //in both mode return type will be entity with primary key .


    //2.saveAll(List<entity>)--> uses for creation and updation
    //creation mode when we are not sending primary key in request that time JPA will consider as create.(specify the generation type)(depend on situation)
    //Updation mode when we are sending primary key in request that time jpa will consider as update.(if primary key does not exist)
    //in both mode return type will be list of  entity with primary key .

    //3.findById(primaryKey)
    // it gives optional of entity on the basis of primary key if data key exists.
    // if not it will give empty optional.


    // 4.deleteById(Integer integer);
    // it is used to delete the data based on primary key if exists .return type is void.

    // 5.delete(entity)
    // it is used to delete the data based on entity with primary key .return type is void.

    // 6.deleteAllInBatch(list entities);
    // it is used to delete the data based on  list of entity with primary key .return type is void.

    // 7.deleteAllByIdInBatch(list ids);
    // it is used to delete the data based on list of primary keys primary key .return type is void.


    // 8.findAll();
    // it is used to find the data. return type is List of entity.

    // 9.findAll(Sort sort);
    // it is used to find the data with sorting object. return type is List of entity.

    // 10.findAll(Pageable page);
    // it is used to find the data with Pageable object. return type is List of entity.



}
