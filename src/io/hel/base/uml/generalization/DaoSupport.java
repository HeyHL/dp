package io.hel.base.uml.generalization;

/**
 * author: hel
 * date: 2020/12/27 22:01
 * description:类与类之间的关系之泛化（继承）
 */
public abstract class DaoSupport {
    public void save(Object entity){}
    public void delete(Object id){}
}
class PersonServiceBean extends DaoSupport{

}