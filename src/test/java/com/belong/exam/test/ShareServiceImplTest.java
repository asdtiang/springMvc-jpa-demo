package com.belong.exam.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class ShareServiceImplTest {
//	@Inject
//	ShareService shareService;
//	@Test
//	public void testFindByHql() {
//		People person = new People();
//		String name = "testName";
//		person.setLocked(2);
//		person.setName(name);
//		shareService.save(person);
//		List<People> result = shareService.find(
//				"from People p where p.name = ?", new Object[] { name },
//				People.class);
//		assertNotNull(result);
//	}

}
