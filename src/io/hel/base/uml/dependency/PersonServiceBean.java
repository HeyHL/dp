package io.hel.base.uml.dependency;

/**
 * author: hel
 * date: 2020/12/27 21:50
 * description: 类与类之间的关系之依赖
 */
public class PersonServiceBean {
    // 成员变量形式
    private PersonDao personDao;
    // 方法参数形式
    public void save(Person person){}
    // 方法返回值形式
    public IDCard getIDCard(int id){return null;}
    public void modify() {
        // 局部变量形式
        Department department = new Department();
    }
}
class PersonDao{}
class IDCard{}
class Person{}
class Department{}