package encore.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class EncodingFilter
 */
// @WebFilter("*.encore")
public class EncFilter implements Filter {
	
	private String encoding;
	
	public void init(FilterConfig fConfig) 
	throws ServletException {
		this.encoding = fConfig.getServletContext().getInitParameter(encoding);
	}  
    public EncFilter() {
        super();
    }
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		if(request.getCharacterEncoding() == null) {
		request.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
		}
	}
	public void destroy() {
	}
}
