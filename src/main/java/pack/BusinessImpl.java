package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessImpl implements BusinessInter {
	@Autowired
	private SangpumInter sangpumInter;
	
//	public void setSangpumInter(SangpumInter sangpumInter) {
//		this.sangpumInter = sangpumInter;
//	}
	
	public void dataList() {
		sangpumInter.selectList();
	}
}