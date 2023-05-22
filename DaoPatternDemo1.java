public class DaoPatternDemo1{
public static void main(String[] args){
BillDao billDao=new BillDaoImpl();
for(Bill bill:billDao.getAllB	Bills()){
System.out.println("Customer name:"+bill.getcustomerName()+",amount:"+bill.getamount()+"]");
}
Bill bill=billDao.getAllBills().get(0);
bill.setamouny("10");
billDao.updateBill(bill);
billDao.getBill(0);
System.out.println("Customer name:"+bill.getcustomerName()+",amount:"+bill.getamount()+"]");
}
}
