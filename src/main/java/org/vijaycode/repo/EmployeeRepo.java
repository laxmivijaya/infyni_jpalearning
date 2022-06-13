package org.vijaycode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vijaycode.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

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
