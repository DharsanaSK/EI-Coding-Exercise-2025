package exp1.structural.composite;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main Menu");
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        MenuItem saveFile = new MenuItem("Save");

        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);

        editMenu.add(copy);
        editMenu.add(paste);

        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);

        mainMenu.display(0);
    }
}