// First solution
public class Kata
{
  public static string SayHello(string name)
  {
    return string.Format("Hello, {0}", name);  
  }
}

// Second solution
public class Kata
{
  public static string SayHello(string name)
  {
    return $"Hello, {name}";
  }
}