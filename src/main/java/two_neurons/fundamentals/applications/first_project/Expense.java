
package two_neurons.fundamentals.applications.first_project;

import java.time.LocalDateTime;

public class Expense
{
    protected String Category;
    protected String  name;
    protected int id;
    private double cost;
    protected LocalDateTime date;

    public Expense(final double cost , final String category) // for creating
    {
        setId(id);
        setCost(cost);
        setCategory(category);
        setName(name);
        this.date = LocalDateTime.now();

    }
    public void setCategory(String category)
    {
        Category = category;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public String getCategory()
    {
        return Category;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public double getCost()
    {
        return cost;
    }
/*    @Override
    public String toString()
    {
        return "EXPENSE_ID : "+getId()+" EXPENSE_CATEGORY : "+getCategory()+" CURRENT_COST :  "+getCost()+" RECENT_EXPENSE_DATE_BY_CATEGORY : "+date;

    }*/

}
