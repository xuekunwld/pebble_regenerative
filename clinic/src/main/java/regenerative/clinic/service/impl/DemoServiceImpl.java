package regenerative.clinic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import regenerative.clinic.dao.DemoDao;
import regenerative.clinic.service.DemoService;
import regenerative.clinic.utils.StringUtility;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;

	@Autowired
	private StringUtility stringUtility;

	@Override
	public boolean add(String target) {

		try {

            int rows = demoDao.add(stringUtility.rtnNendo(target));

            if (!(rows == 1)) {
                return false;
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
		return true;
	}
}
