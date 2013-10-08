package com.belong.exam.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FindRelationServiceImplTest {
//	@Inject
//	ShareService shareService;
//	@Inject
//	FindRelationService findRelationService;
//	private People from;
//	private static final Logger log = LoggerFactory
//            .getLogger(FindRelationServiceImplTest.class);
//	@Test
//	public void testFindBOS() {
//		genData(10);
//		List<People> people = findRelationService.findBOS(from.getId());
//		for(People p:people){
//			log.info(p.toString());
//		}
//	}
//	
//	@Test
//	public void testFindBOSParallelFind() {
//		List<People> list = genData(11);
//		List<Integer> ids = new ArrayList<Integer>();
//		for(int i =0;i<5;i++){
//			ids.add(list.get(i).getId());
//		}
//		List<FindResult> results = findRelationService.findBOS(ids);
//		for(FindResult result:results){
//			log.info(result+"");
//		}
//	}
//	@Test
//	public void testFindBOSParallelFindTimeout() {
//		List<People> list = genData(11);
//		List<Integer> ids = new ArrayList<Integer>();
//		for(int i =0;i<5;i++){
//			ids.add(list.get(i).getId());
//		}
//		List<FindResult> results = findRelationService.findBOS(ids,2000);
//		log.info(results+"");
//	}
//
//	private List<People> genData(int sum) {
//		List<People> list = new ArrayList<People>();
//		People people;
//		String name;
//		for (int i = 0; i < sum; i++) {
//			people = new People();
//			name = "testName" + i;
//			people.setLocked(0);
//			people.setName(name);
//			shareService.save(people);
//			list.add(people);
//		}
//		from = list.get(0);
//		for (int j = 0; j < sum - 2; j++) {
////			if(j ==3 ){
////				continue;
////			}
//			for (int i = j; i < sum-1; i++) {
////				if(i ==3 ){
////					continue;
////				}
//				PeopleRelation relation = new PeopleRelation();
//				PeopleRelationPK id = new PeopleRelationPK(list.get(j).getId(), list
//						.get(i + 1).getId());
//				relation.setId(id);
//				relation.setRelation(1);
//				shareService.save(relation);
//			}
//		}
//		return list;
//	}

}
