package project;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    String filename;
    ArrayList<String> entries= new ArrayList<String>();

    public CSVReader(String filename){
        this.filename=filename;
    }

    public void writeData( List<Figure> figures) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            for (Figure f : figures)
                writer.println(f.getIsCircile()+";" + f.getX() + ";"
                        + f.getY() + ";" + f.getDiameter() + ";"
                        +f.getColor().getRed()+";"+f.getColor().getGreen()
                        +";"+f.getColor().getBlue());
            writer.close();
            } catch (IOException e) {}
    }

    public void importData(){
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(filename));
            String line;
            while((line=buffer.readLine())!=null){
                String[] temp = line.split(";");
                entries.addAll(Arrays.asList(temp));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void displayArrayList() {
        for (String entry : this.entries) System.out.println(entry);
    }

    public int getNumberOfEntries(){
        return this.entries.size();
    }

    public String getEntry(int i){
        if(this.entries.size()>i)
            return entries.get(i);
        else
            return "Error "+i+" more than size of array";
    }


}
