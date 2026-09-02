package Service;

import java.util.List;

import DAO.BatchDAO;
import Model.Batch;

public class BatchService {
	 private BatchDAO batchDAO = new BatchDAO();
	 
	 public List<Batch> getAllBatch(){
		   System.out.println("in service");
		   return batchDAO.getAllBatch();
	   }
	 
	 public void deleteBatch(int id) {
		 batchDAO.deleteBatchById(id);
	 }
	 
	 public void changeStatus(int id) {
		 batchDAO.changeStatus(id);
	 }
}
