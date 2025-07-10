How to compile and run DirectoryList.java

1.Open the command prompt(cmd) or Powershell.

2.Navigate to the folder where the `.java` source file is located. For example:

     cd C:\Users\formacio\IdeaProjects\S1.05-Java-Collections-Nivell1-E1\src

3.Compile the java directory using "javac DirectoryList.java".

4.Run the program with java, passing a relative path, For example: For example, if you want to list the folder named `testFolder` inside your project directory:

      java DirectoryList testFolder
      (Make sure 'testFolder' exists inside the project root folder)

5.Notes:

- The program uses `File.separator` to build paths, so it works on Windows, Linux, and Mac.
- Avoid using absolute paths like `C:\Users\formacio\Desktop` because they won't work on other systems.
- The current working directory (`user.dir`) is used as the base path.
