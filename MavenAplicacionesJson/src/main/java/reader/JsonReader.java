package reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import modelos.Joke;
import modelos.User;
import utilities.Logs;

import java.io.File;
import java.io.IOException;

public class JsonReader {

    private final static String userPath = "src/main/resources/data/user.json";
    private final static String jokesPath = "src/main/resources/data/jokes.json";

    public static User leerUsuarioJson(){

        final var objectMapper = new ObjectMapper();

        try{

            return  objectMapper.readValue(new File(userPath), User.class);

        } catch (IOException ioException){

            Logs.error("IOException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();

        }

    }

    public static Joke[] leerJokeArray(){

        final var objectMapper = new ObjectMapper();

        try{

            return  objectMapper.readValue(new File(jokesPath),
                    TypeFactory.defaultInstance().constructArrayType(Joke.class));

        } catch (IOException ioException){

            Logs.error("IOException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();

        }

    }

}
