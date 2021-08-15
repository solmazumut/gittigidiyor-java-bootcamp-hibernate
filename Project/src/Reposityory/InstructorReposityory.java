package Reposityory;

import domain.Instructor;
import repository.CrudRepository;

import java.util.List;

public class InstructorReposityory implements CrudRepository<Instructor> {
    @Override
    public List<Instructor> findAll() {
        return null;
    }

    @Override
    public Instructor findById(int id) {
        return null;
    }

    @Override
    public void save(Instructor object) {

    }

    @Override
    public void delete(Instructor object) {

    }

    @Override
    public void delete(Instructor object, int id) {

    }

    @Override
    public void update(Instructor object, int id) {

    }
}
