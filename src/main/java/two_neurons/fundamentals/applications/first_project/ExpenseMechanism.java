package two_neurons.fundamentals.applications.first_project;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;
import javax.swing.*;

public class ExpenseMechanism
{
    protected   DBconnection dBconnection;
    protected Jdbi jdbi;
    public ExpenseMechanism(DBconnection dBconnection)
    {
        this.setdBconnection(dBconnection);

    }

    public DBconnection getdBconnection()
    {
        return dBconnection;
    }

    public void setdBconnection(DBconnection dBconnection)
    {
        this.dBconnection = dBconnection;
    }

    public Jdbi getJdbi()
    {
        return jdbi;
    }

    public void setJdbi(Jdbi jdbi)
    {
        this.jdbi = jdbi;
    }

    //mechanism for creating the expense resource
    public void expenseCreate(Expense expense)
    {
        //create some variables
        String query = "insert into expense (current_cost , category) values (?,?)";
        // write some code

        // setup database connection parameters


        jdbi = Jdbi.create(dBconnection.getUrlDB(), dBconnection.getPropertiesDB()); // create an instance of jdbi so you can use it later to send queries
        jdbi.useHandle(handle ->
        {
             Query qry = handle.createQuery(query);
             qry.bind(1,expense.getCost());
             qry.bind(2,expense.getCategory());

            JOptionPane.showMessageDialog(null,"Category "+expense.getCategory()+" : has been created!");
            return;
        });
        {

        }



    }

}
