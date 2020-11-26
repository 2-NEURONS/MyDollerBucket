package two_neurons.fundamentals.applications.first_project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Request;
import spark.Response;

import static spark.Spark.*;

import java.util.Properties;

public class Main
{
    private static Properties propertiesDB = new Properties();


    public static void main(String[] args)
    {

        propertiesDB.setProperty("username","coder");
        propertiesDB.setProperty("password","coder123");
        //=========================================================================================

        port(8080);
        get("/",Main::create);







    }
    public static String create(Request request , Response response) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        Expense expense = new Expense(44775.7,"Cycling");
        DBconnection dBconnection = new DBconnection("jdbc:postgresql://localhost:5432/expense",propertiesDB);
        ExpenseMechanism em = new ExpenseMechanism(dBconnection);
        em.expenseCreate(expense);

        return objectMapper.writeValueAsString(expense);
    }


}





