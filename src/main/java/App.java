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

        get("heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/hero-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes", Hero.all());
            model.put("template", "templates/heroes.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        post("/heroes",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");

            Hero hero = new Hero(name, age, power, weakness);
            model.put("template", "templates/success.vtl");

            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/squad-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("categories", Squad.all());
            model.put("template", "templates/squads.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String cause = request.queryParams("name");
            String max = request.queryParams("name");
            Squad squad = new Squad(name, cause, max);
            model.put("template", "templates/squads-success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}