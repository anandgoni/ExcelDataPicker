package test_FireFox.test_FireFox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Twodimesionarralist {
	
		public static void main(String[] args)
	    {
	        ArrayList<Row> rows = new ArrayList<Row>();
	        Row row;
	        // Insert the columns for each row
	        //             First Name, Last Name, Age
	        row = new Row("John",      "Doe",     30);
	        rows.add(row);
	        row = new Row("Jane",      "Doe",     29);
	        rows.add(row);
	        row = new Row("Mary",      "Doe",   1);
	        rows.add(row);
	        

	        // Show the Array
	        //
	        System.out.println("First\t Last\tAge");
	        System.out.println("----------------------");
	        for (Row printRow : rows)
	        {
	            System.out.println(
	                    printRow.getFirstName() + "\t " +
	                    printRow.getLastName() + "\t" +
	                    printRow.getAge());

	        }
	    }

	}

	class Row
	{

	    // REMEMBER: each attribute is a column
	    //
	    private final String firstName;
	    private final String lastName;
	    private final int age;

	    public Row(String firstName, String lastName, int age)
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }

	    public String getFirstName()
	    {
	        return firstName;
	    }

	    public String getLastName()
	    {
	        return lastName;
	    }

	    public int getAge()
	    {
	        return age;
	    }

}
