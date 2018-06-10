import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "DocusignAPI",
    urlPatterns = {"/api"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    String json = "{\"menu\": {\n" + 
    		"  \"id\": \"file\",\n" + 
    		"  \"value\": \"File\",\n" + 
    		"  \"popup\": {\n" + 
    		"    \"menuitem\": [\n" + 
    		"      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" + 
    		"      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" + 
    		"      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" + 
    		"    ]\n" + 
    		"  }\n" + 
    		"}}";
    
    response.getWriter().print(json);

  }
}