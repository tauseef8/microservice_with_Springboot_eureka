package com.tk.dealoftheday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Tauseef.Khan
 *
 */
@Repository
public class StubDealOfDayRepository implements DealOfDayRepository {
	
	private Map<String, DealOfDay> dealOfDaysByName = new HashMap<String, DealOfDay>();
	
	public StubDealOfDayRepository() {
		DealOfDay dealOfDay = new DealOfDay(102.00, "20%" , "Medicine", "12", 3000.00 );
		dealOfDaysByName.put("Medicine", dealOfDay);
		dealOfDay = new DealOfDay(1002.00, "20%" , "Clinical-device", "5", 12000.00 );
		dealOfDaysByName.put("Clinical-device", dealOfDay);
		dealOfDay = new DealOfDay(1002.00, "20%" , "Xray-device", "3", 12000.00 );
		dealOfDaysByName.put("Xray-device", dealOfDay);
		Logger.getLogger(StubDealOfDayRepository.class).info("Created StubdealOfDayRepository");
	}
	
	@Override
	public List<DealOfDay> getAllDealOfDays() {
		return new ArrayList<DealOfDay>(dealOfDaysByName.values());
	}

	@Override
	public DealOfDay getDealOfDay(String name) {
		return dealOfDaysByName.get(name);
	}

}
