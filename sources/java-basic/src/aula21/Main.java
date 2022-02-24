package aula21;

public class Main {

    public static void main(String[] args)  {

        if (Car.class.isAnnotationPresent(Author.class)){
            Author author = Car.class.getAnnotation(Author.class);
            System.out.println(author.name() + " - " + author.version());
        }

    }

}
