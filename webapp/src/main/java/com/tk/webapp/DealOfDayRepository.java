/**
 * 
 */
package com.tk.webapp;

import java.util.List;

/**
 * @author Tauseef.Khan
 *
 */
public interface DealOfDayRepository {
	
	List<DealOfDay> getAllDealOfDays();
	
	DealOfDay getDealOfDay(String name);
}
