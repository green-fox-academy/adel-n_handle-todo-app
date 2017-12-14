public class TodoApp {

  public static void main(String[] args) {
    ListTasks myTasks = new ListTasks();

    if(args.length == 0) {

      System.out.println("Command Line Todo application");
      System.out.println("=============================");
      System.out.println("");
      System.out.println("Command line arguments:");
      System.out.println("-l   Lists all the tasks");
      System.out.println("-a   Adds a new task");
      System.out.println("-r   Removes an task");
      System.out.println("-c   Completes an task");

    } else if(args[0].equals("-l")) {
      myTasks.readFile();
      //System.out.println("Function that adds " + args[1] + " todo to your list");
    }
  }
}
