package br.edu.ifpr.pgua.eic.tads;

import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.controllers.cadastroController;
import br.edu.ifpr.pgua.eic.tads.models.Gerenciador;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        var app = JavalinUtils.makeApp(8180);
        Gerenciador gerenciador = new Gerenciador();
        IndexController indexcontroller = new IndexController();
        cadastroController cadastrocontroller = new cadastroController(gerenciador);

        app.get("/", indexcontroller::get);
        app.get("/", ctx -> {ctx.result("acolita melhor pesonagem risk of rain2");});
        app.get("/usuarios/cadastro",cadastrocontroller::get);
        app.post("/usuarios/cadastro",cadastrocontroller::post);
    }
}