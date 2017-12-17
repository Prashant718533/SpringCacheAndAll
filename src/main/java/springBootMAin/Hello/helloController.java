package springBootMAin.Hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloController {
	// @Autowired
	// private TaskServiceImpl service;
	//
//	@RequestMapping(path = "/hello", method = RequestMethod.GET)
//	public String sayhi() {
//		return "hello11111111111111111111";
//	}
	
	
	
	@Cacheable("tasks")
	@RequestMapping(path = "/topics", method = RequestMethod.GET)
	public List<topicssss> getAllTopics(){
		System.out.println("Cache");
        return Arrays.asList(new topicssss(1L, "My first task", true), new topicssss(2L, "My second task", false));
        
	}

}
