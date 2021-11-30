package facultech.projetorestapi.repository;

import facultech.projetorestapi.model.TransactionModel;
import org.springframework.data.repository.CrudRepository;



public interface TransactionRepository extends CrudRepository<TransactionModel, Integer> {
}
