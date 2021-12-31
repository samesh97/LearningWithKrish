
Static Block - Static block is executing only when the class is loaded into memory. If there's any configurations needs to be done, before creating objects, we can use static the block.

public class Test()
{
    static
    {
        //this code block will be executed as soon as the class is loaded into memory.
    }
}

Constructor - Constructor of a class is as it's name, without any return type, but can be specified as void if needed. You can either implement multiple constructors or none.
But by default, even if you don't specify, there's a default constructor in every class. But if you implement at least one constructor, the deafult constructor will be replaced by the constructor you implemented in that specific class. And it will be called every time when an object is created.

1)
public class Test()
{
    //even if you don't specify a constructor, there'll be one by default.
}

2)
public class Test()
{
    //default constructor is overidden
    public Test()
    {
    
    }
}

3)
public class Test()
{
    //overloaded default constructor
    public Test()
    {
    
    }
    
    //another overloaded constructor with additional parameters 
    public Test(int id, String name)
    {
    
    }
}


Empty Block - 





