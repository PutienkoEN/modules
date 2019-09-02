package books.demo;

import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main
{
    public static void main(String... args) throws Exception
    {
        Book modularityBook = new Book("Java 9 Modularity", "Modularize all the things!");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(modularityBook);

        Versioned versioned = (Versioned) mapper;
        System.out.println(json);
    }
}
