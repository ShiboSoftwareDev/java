import java.util.*;

public class Name
{
   String firstName;
   String middleName;
   String lastName;

    public Name(String fName, String mName, String lName)
        {
            firstName = fName;
            middleName = mName;
            lastName = lName;
        }
    public Name(String fullName)
    {
        String[] fullNameArray = fullName.split(" ");
        firstName = fullNameArray[0];
        middleName = fullNameArray[1];
        lastName = fullNameArray[2];
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }
    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFullName()
    {
        return firstName + ' ' + middleName + ' ' + lastName;
    }
    public boolean equals(Name name)
    {
        return name.getFullName().equals(this.getFullName());
    }
}
