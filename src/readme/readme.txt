How to compile and run DirectoryList.java

1. Open the command prompt (cmd) or Powershell.

2. Navigate to the folder where the `.java` source file is located. For example:

     cd src

3. Compile the Java file using:
     javac DirectoryList.java

4. Run the program with `java`, passing a relative path:
     java DirectoryList testFolder
     (Make sure 'testFolder' exists inside the project root folder)

5. Notes:
- The program uses `File.separator` to build paths, so it works on Windows, Linux, and Mac.
- Avoid using absolute paths like `C:\Users\yourname\Desktop`.
- The current working directory (`user.dir`) is used as the base path.
