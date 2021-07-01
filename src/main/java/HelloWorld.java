import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class HelloWorld{

	public static void main(String[] args){
		System.out.println("Hello World!");
		System.out.println(StringUtils.capitalize("hello world!"));
		printEnvVariables();
	}

	public String sayHello(){
		return "Hello World";
	}


	public static void printEnvVariables(){
		for (Map.Entry entry: System.getenv().entrySet()){
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
	}

}
