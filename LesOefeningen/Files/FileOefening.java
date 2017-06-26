/*File
        ====
        - Check if a given file exists on the file system
        - Rename a given file
        - Print the name and size of all jpeg files in a given directory (in KiB)
        - Show the owner of a given file
        - Copy the contents of a directory to somewhere else
        - Print out all files in a given directory recursively
        - Listen for changes on a given directory (when a file gets created or modified, print it's name and the event that happened)
        */

package LesOefeningen.Files;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.StandardCopyOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class FileOefening {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        File f = new File("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/Unknown-1.jpeg");
        System.out.println(f.exists());

        File f2 = new File("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/Unknown.jpeg");
        File f2ex = new File("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/Cat.jpeg");
        f2.renameTo(f2ex);
        System.out.println(f2);

        File[] f3 = new File("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/").listFiles();
        for (int i = 0; i < f3.length; i++) {
            String f3Name = f3[i].getName();
            long f3Size = f3[i].length();
            long f3SizeKibi = f3Size / 1024;
            String dated = null;
            try {
               dated = (Files.getLastModifiedTime(f3[i].toPath()).toString());
            } catch (IOException ioe) {
                System.out.println("Error!");
            }

            System.out.println("Name: " + f3Name + "\n Size in byte: " + f3Size + "\nSize in Kibi Bytes: " + f3SizeKibi + "\nDate: " + dated);
        }

        File f4 = new File("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/Unknown-2.jpeg");
        try {
            System.out.println("\n" + Files.getOwner(f4.toPath()));
        } catch(IOException ioe) {
            System.out.println("Doesn't find author");
        }

        File copyDirectory = new File("/Users/vdabcursist/Desktop/Unknown-2.jpeg");

        try {
            Files.copy(f4.toPath(), copyDirectory.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch(IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Can't copy");
        }


        try {
            Path myDir = Paths.get("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/");

            WatchService watcher = myDir.getFileSystem().newWatchService();
            myDir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
            StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

            WatchKey wk = watcher.take();

            List<WatchEvent<?>> events = wk.pollEvents();
            for (WatchEvent event : events) {
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    System.out.println("Created: " + event.context().toString());
                }
                if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                    System.out.println("Delete: " + event.context().toString());
                }
                if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                    System.out.println("Modify: " + event.context().toString());
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
