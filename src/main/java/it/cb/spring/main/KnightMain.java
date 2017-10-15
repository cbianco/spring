package it.cb.spring.main;

import it.cb.spring.pojo.Knight;
import it.cb.spring.pojo.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext(
				"META-INF/spring/knight.xml");

		/*AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(KnightConfig.class);*/

		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}


}
