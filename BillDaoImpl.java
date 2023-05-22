public class BillDaoImpl implements BillDao{
List<Bill> rooms;
public BillDaoImpl (){
bills=new ArrayList<Bill>();
Bill bill1=new Bill("Filan",40);
Bill bill2=new Bill("Mimoza",30);
Bill bill3=new Bill("Albana",40);
Bill bill4=new Bill("Blerta",30);
bills.add(bill1);
bills.add(bill2);
bills.add(bill3);
bills.add(bill4);
}
@Override
public void deleteBill(Bill bill){
bills.remove(bill.getcustomerName());
System.out.println("Customer name: "+bill.getcustomerName()+",updated in the database");
}
@Override
public List<Bill>getAllBills(){
return bills;
}
@Override
public Bill getBill(int customerName){
return Bill.get(customerName);
}
@Override
public void updateBill(Bill bill){
bills.get(bill.getcustomerName()).setamount(bill.getamount());
System.out.println("Customer name: "+bill.getcustomerName()+",updated in the database");
}
}