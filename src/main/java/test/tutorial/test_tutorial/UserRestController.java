package test.tutorial.test_tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UserRestController {

    //private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
	private UserService userService;
    
   
    
    @RequestMapping(path="/users", method=RequestMethod.GET)
	public ResponseEntity getAllUsers() {
    	return new ResponseEntity(userService.getAllUsers(), HttpStatus.OK);		
	}
    
    
}
