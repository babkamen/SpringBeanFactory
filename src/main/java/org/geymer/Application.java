package org.geymer;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Beans.xml"));
Chat chat = (Chat)factory.getBean("chat");
System.out.println(chat.getMessage());
    }
}
