package loveinliuy.bill.repository;

import loveinliuy.bill.model.Bill;
import loveinliuy.bill.model.CostType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * description:
 *
 * @author zhangshibo  [2018/1/4].
 */
public interface CostTypeRepository extends MongoRepository<CostType, String> {

    /**
     * 根据账单类型获取消息类型
     *
     * @param userId 用户id
     * @param types   类型
     * @return 消息类型
     */
    List<CostType> findCostTypesByUserIdAndTypeInOrderByPriorityAsc(String userId, Bill.Type[] types);
}
