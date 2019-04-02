package mb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mb.entity.Employee;
import mb.entity.HibernateUtil;
import mb.entity.RoleType;

public class TestHibernateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmp_no(20190325);
		emp.setRoleType(RoleType.ADM);
		
		//取得連線
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		//會話操作
		Transaction transaction = session.beginTransaction();
		
		//映射並儲存
		session.save(emp);
		transaction.commit();
		session.close();
		
		System.out.println("INSERT完成!");
		
		HibernateUtil.shutdown();
		

	}

}
