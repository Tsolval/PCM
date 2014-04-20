package net.tsolval.pcm.config

import javax.servlet.ServletContext
import javax.servlet.ServletException
import javax.servlet.ServletRegistration

import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.support.XmlWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet

/**
 * @author tsolval
 *
 */
class WebAppConfiguration implements WebApplicationInitializer {

	/* (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		XmlWebApplicationContext appContext = new XmlWebApplicationContext()
		appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml")

		ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(appContext))
		registration.setLoadOnStartup(1)
		registration.addMapping("/")
	}
}
