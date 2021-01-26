package io.hel.base.uml.realization;

/**
 * author: hel
 * date: 2020/12/27 22:05
 * description:类与类之间的关系之实现
 */
public interface PersonService {
    void delete(int id);
}
class PersonServiceBean implements PersonService {
    @Override
    public void delete(int id) {

    }
}