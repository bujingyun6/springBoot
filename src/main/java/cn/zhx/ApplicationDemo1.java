package cn.zhx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@ConfigurationProperties(prefix="book")
public class ApplicationDemo1 {
	
	private String name;
	private Integer version;
	

	public void setName(String name) {
		this.name = name;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	
	@RequestMapping(value="/")
	public String index(Model model) {
		model.addAttribute("name", "azhnag");
		model.addAttribute("version", 456);
		return "thyDemo1";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApplicationDemo1.class,args);
	}
}
