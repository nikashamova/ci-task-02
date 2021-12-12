package ru.nsu.ci.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.nsu.ci.entity.DBTask;

public interface DBTaskRepository extends CrudRepository<DBTask, Integer> {

    List<DBTask> findAll();

    DBTask findByTitle(String title);

}
