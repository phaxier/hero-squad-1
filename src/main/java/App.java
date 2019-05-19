import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("hero", request.session().attribute("heroes"));
            model.put("template","templates/index.vtl");
            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        post("/heroes",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> heroes = request.session().attribute("heroes");
            if (heroes==null){
                heroes = new ArrayList<Hero>();
                request.session().attribute("heroes", heroes);
            }

            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");

            Hero hero = new Hero(name, age, power, weakness);
            heroes.add(hero);

            model.put("template", "templates/success.vtl");

            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());
    }
}