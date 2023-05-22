public class DaoPatternDemo2{
public static void main(String[] args){
BillDao billDao=new BillDaoImpl();
for(Bill bill:billDao.getAll Bills()){
System.out.println("Customer name:"+bill.getCustomerName()+",amount:"+bill.getAmount()+"]");
}
Bill bill=billDao.getAllBills().get(0);
bill.setAmount("10");
billDao.updateBill(bill);
billDao.getBill(0);
System.out.println("Customer name:"+bill.getCustomerName()+",amount:"+bill.getAmount()+"]");
}
}
