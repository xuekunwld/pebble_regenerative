package regenerative.clinic.service;

import org.springframework.transaction.annotation.Transactional;

public interface DemoService {

	@Transactional
	boolean add(String target);
}
