package com.akhilexpress.demo.junit5;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@RunWith(MockitoJUnitRunner.class) // 3rd wauy using JUNIt4
@ExtendWith(MockitoExtension.class) // 3rd way using JUNIt5
class SampleTest {

	// One way
	/*
	 * Map map;//=new HashMap<>();
	 * 
	 * @Test void sample_test() {
	 * 
	 * map=mock(Map.class); System.out.println(map.hashCode());
	 * System.out.println(map); }
	 */

	// 2nd Way

	/*
	 * @Mock Map map;
	 * 
	 * @Mock List list;
	 * 
	 * @BeforeEach public void beforeEachMethod() {
	 * MockitoAnnotations.initMocks(this); }
	 * 
	 * @Test void sample_test() {
	 * 
	 * // map=mock(Map.class); System.out.println(map.hashCode());
	 * System.out.println(map);
	 * 
	 * System.out.println(list); }
	 */

	
	//3rd Way
	@Mock
	Map map;

	@Mock
	List list;

	@Test
	void sample_test() {

		System.out.println(map);
		System.out.println(list);
		
		when(map.get(101)).thenReturn("Sanju");//creating the fake behaviour 
		when(map.size()).thenReturn(20);
		
		System.out.println(map.get(101));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.put(101, "Akhil"));
		System.out.println(map.get(101));
		
	}

}
