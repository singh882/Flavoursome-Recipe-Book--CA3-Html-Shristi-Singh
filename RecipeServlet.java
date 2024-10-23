import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class RecipeServlet extends HttpServlet {
    private List<String> recipes = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String recipe = request.getParameter("recipe");
        recipes.add("Email: " + email + ", Recipe: " + recipe);

        response.sendRedirect("saved_recipes.html");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(new Gson().toJson(recipes)); // Use Gson to convert List to JSON
    }
}