package pl.sl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CalculatorController {

	private CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("version")
	public String healthCheck() {
		return "1";
	}
	
	@PostMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return calculatorService.add(a, b);
	}
}
