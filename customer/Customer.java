import java.util.*;

public class Customer
{
    private int id;
    private Name name;
    private String email;
    private Date birthDate;

    public Customer(int id, Name name)
        {
            this.id = id;
            this.name = name;
        }

    public Name getName()
    {
        return name;
    }
    public void setName(Name name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id; 
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email; 
    }

    public Date getBirthDate()
    {
        return this.birthDate;
    }
    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public boolean equals(Customer customer)
    {
        return this.name.equals(customer.name) && this.id == customer.id && this.birthDate.equals(customer.birthDate);
    }

    public String toString()
    {
        return Integer.toString(id) + '\n' + name.getFullName() + '\n';
    }
}

