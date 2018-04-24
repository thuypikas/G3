package empDAO;

import javax.transaction.Transaction;

import org.hibernate.Session;

import model.tblEmp;
import model.tblEmpAddr;
import util.HibernateUtil;

public class EmpDAO {
private Session session;
public EmpDAO() {
	session = HibernateUtil.getSessionFactory().openSession();
	
}
public void insertAddress(int addrID, String addrName, String phoneNo,int userID){
	Transaction tran = null;
	try {
		tran = (Transaction) session.getTransaction();
		((org.hibernate.Transaction) tran).begin();
		tblEmp emp = (tblEmp)session.get(tblEmp.class, userID);
		tblEmpAddr addr = new tblEmpAddr(addr_ID, addName, phoneNo);
				emp.gettblEmpAddr().add(addr);
				
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
