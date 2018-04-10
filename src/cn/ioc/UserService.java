package cn.ioc;

/**
 * Created by Sheng on 2018/4/10.
 */
public class UserService {

    //1定义dao类型属性
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }
    //生成set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    String[] arrs;

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void add(){
        System.out.println("Service.......");
        //传统service调用dao方法，现在需要将创建dao中的对象交给spring
        UserDao dao = new UserDao();
        dao.add();
    }
}
