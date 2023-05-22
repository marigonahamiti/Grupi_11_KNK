import java.util.ArrayList;
import java.util.List;
public interface BillDao{
public List<Bill> getAllBills();
public Bill getBill(int customerName);
public void updateBill(Bill bill);
public void deleteBill(Bill bill);
}
