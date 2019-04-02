package mb.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import mb.entity.Employee;
import mb.entity.HibernateUtil;
import mb.entity.MessageComment;

class MessageCommentDAO {

	void insertMessageComment(MessageComment mc) {
		// 建立連線
		Session session = HibernateUtil.getSessionFactory().openSession();
		// 會話操作
		Transaction transaction = session.beginTransaction();
		// 執行Insert
		session.save(mc);
		transaction.commit();
		session.close();
		System.out.println("INSERT完成!");
	}
	//多筆查詢
	List<MessageComment> selectMessageComment() {

		List<MessageComment> list = new ArrayList<MessageComment>();
		// 建立連線
		Session session = HibernateUtil.getSessionFactory().openSession();
		// 會話操作
		Transaction transaction = session.beginTransaction();
		String hql = "FROM MessageComment";

		// 執行查詢
		// @SuppressWarnings("unchecked")
		Query<MessageComment> query = session.createQuery(hql,MessageComment.class);		
		list = query.list();
		transaction.commit();
		if(session.isOpen()) {
			session.close();
		}
		return list;
	}
	
	//單筆查詢
	List<MessageComment> selectMessageCommentById(int id) {
		List<MessageComment> list = new ArrayList<MessageComment>();
		// 1.建立連線
		Session session = HibernateUtil.getSessionFactory().openSession();
		// 2.會話操作
		Transaction transaction = session.beginTransaction();
		String hql = "FROM MessageComment MC WHERE MC.id=:id";
		// 3.執行查詢
		Query<MessageComment> query = session.createQuery(hql,MessageComment.class);
		query.setParameter("id", id);
		list = query.getResultList();
		transaction.commit();
		// 4.關閉連線
		if(session.isOpen()) {
			session.close();
		}
		// 5.回傳
		return list;
	}
	
	//單筆修改
	void updateMessageComment(MessageComment mc) {
		// 1.建立連線
		Session session = HibernateUtil.getSessionFactory().openSession();
		// 2.會話操作
		Transaction transaction = session.beginTransaction();
		// 3.執行查詢
		session.update(mc);;
		transaction.commit();
		// 4.關閉連線
	    session.close();
	}
	//單筆刪除
	void deleteMessageComment(MessageComment mc) {
		// 1.建立連線
		Session session = HibernateUtil.getSessionFactory().openSession();
		// 2.會話操作
		Transaction transaction = session.beginTransaction();
		// 3.執行查詢
		session.remove(mc);
		transaction.commit();
		// 4.關閉連線
	    session.close();
	}

	/*
	 * 測試用方法
	 */
	public static void main(String[] args) {
		
		/*
		 * try { //Insert測試 MessageComment mc = new MessageComment(); Employee emp = new
		 * Employee(); emp.setEmp_no(1); mc.setEmployee(emp); mc.setTitle("測試標題2");
		 * mc.setMessageContent("測試內容2"); mc.setIssueDate("2019-03-25");
		 * mc.setDateOfDeadline("2019-03-25");
		 * 
		 * MessageCommentDAO dao = new MessageCommentDAO();
		 * dao.insertMessageComment(mc);
		 * 
		 * } catch (MBException ex) {
		 * Logger.getLogger(MessageCommentDAO.class.getName()).log(Level.SEVERE, null,
		 * ex); }
		 */	
		
		/*
		 * //Select測試
		 * 
		 * MessageCommentDAO dao = new MessageCommentDAO(); List<MessageComment> list
		 * =dao.selectMessageComment(); System.out.println(list);
		 */
		 
		  
		/*
		 * //單筆查詢測試 MessageCommentDAO dao2 = new MessageCommentDAO(); MessageComment mc
		 * = dao2.selectMessageCommentById(2).get(0); System.out.println(mc);
		 */
		  
		//單筆修改測試
		  MessageCommentDAO dao3 = new MessageCommentDAO();
		  MessageComment mcu = dao3.selectMessageCommentById(2).get(0);
		  Employee emp = new Employee();
		  mcu.setMessageContent("測試修改");
		  emp.setEmp_no(1);
		  mcu.setEmployee(emp);
		  dao3.updateMessageComment(mcu);
		  System.out.println(dao3.selectMessageCommentById(2).get(0));
		  
	}

}
