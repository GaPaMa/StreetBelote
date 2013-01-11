package webapp.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextFactory {
	
	public final static String CLASSPATH = "ClassPathXmlApplicationContext";
	public final static String FILE_SYSTEM = "FileSystemXmlApplicationContext";

	private final static String APPLICATION_CONTEXT_XML = "applicationContext.xml";
	private final static String PATH = "WebContent/WEB-INF/config/";
	private static ApplicationContext context;
	
	/**
	 * Permet de charger le contexte selon le type fourni
	 * 
	 * @param typeContext
	 * @return
	 */
	public static ApplicationContext getContext(final String typeContext) {
		if (context == null) {
			if (CLASSPATH.equals(typeContext)) {
				context = new ClassPathXmlApplicationContext(
						APPLICATION_CONTEXT_XML);
			} else if (FILE_SYSTEM.equals(typeContext)) {
				context = new FileSystemXmlApplicationContext(PATH
						+ APPLICATION_CONTEXT_XML);
			} else {
				System.err.println("Localisation non définie");
			}
		}
		return context;
	}

}