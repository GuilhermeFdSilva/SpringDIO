package br.com.meuProjetoSpring.meuprojetospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("D34AF");
        Autor autor = factory.getBean(Autor.class);
        autor.setNome("J.K. Rowling");
        livro.exibir();
        factory.close();
    }
}
