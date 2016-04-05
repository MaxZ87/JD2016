package by.it.akhmelev.JD03_03;

import java.util.List;

interface InterfaceDAO<TYPE> {
    //READ чтение отдельной сущности
    TYPE read(int id);
    //CREATE,UPDATE,DELETE обновление сущности
    boolean create(TYPE entity);
    boolean update(TYPE entity);
    boolean delete(TYPE entity);

    //READ - чтение всех элементов сущности по условию
    List<TYPE> getAll(String WhereAndOrder);
    //и другие необходимые системе операции

}
