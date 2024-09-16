
package library.project;

import java.util.ArrayList;


public class LibraryProject {

 
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        
    }    
    
    
    public String search (ArrayList<Book> books, String crit){
        
        books.add(new Book("The Great Adventure", "123-456-789", 2001, "John Doe"));
        books.add(new Book("Mystery of the Lost Island", "123-456-790", 2002, "Jane Smith"));
        books.add(new Book("Secrets of the Universe", "123-456-791", 2003, "Emily Johnson"));
        books.add(new Book("The Last Kingdom", "123-456-792", 2004, "William Brown"));
        books.add(new Book("A Journey to the Unknown", "123-456-793", 2005, "Olivia Green"));
        books.add(new Book("The Forgotten Hero", "123-456-794", 2006, "James White"));
        books.add(new Book("Shadows in the Dark", "123-456-795", 2007, "Michael Davis"));
        books.add(new Book("Rise of the Phoenix", "123-456-796", 2008, "Sophia Taylor"));
        books.add(new Book("The Enchanted Forest", "123-456-797", 2009, "Isabella Martinez"));
        books.add(new Book("Beyond the Horizon", "123-456-798", 2010, "Daniel Lewis"));
        books.add(new Book("Whispers of the Wind", "123-456-799", 2011, "Grace Clark"));
        books.add(new Book("Into the Wild", "123-456-800", 2012, "David Hall"));
        books.add(new Book("Legends of the Stars", "123-456-801", 2013, "Mia Allen"));
        books.add(new Book("The Phantom's Curse", "123-456-802", 2014, "Alexander Young"));
        books.add(new Book("Echoes of the Past", "123-456-803", 2015, "Charlotte King"));
        books.add(new Book("The Hidden Truth", "123-456-804", 2016, "Liam Wright"));
        books.add(new Book("Guardians of Time", "123-456-805", 2017, "Amelia Scott"));
        books.add(new Book("The Secret Code", "123-456-806", 2018, "Lucas Turner"));
        books.add(new Book("Journey to the Stars", "123-456-807", 2019, "Evelyn Hernandez"));
        books.add(new Book("The Lost Artifact", "123-456-808", 2020, "Henry Lopez"));
        books.add(new Book("Tales of the Unknown", "123-456-809", 2021, "Victoria Gonzalez"));
        books.add(new Book("The Eternal Flame", "123-456-810", 2022, "Sebastian Wilson"));
        books.add(new Book("The Maze Runner", "123-456-811", 2023, "Chloe Ramirez"));
        books.add(new Book("The Battle of Worlds", "123-456-812", 2024, "Aiden Moore"));
        books.add(new Book("The Forgotten Prophecy", "123-456-813", 2025, "Ella Adams"));
        books.add(new Book("The Last Survivor", "123-456-814", 2026, "Noah Perez"));
        books.add(new Book("Tales of the Forgotten", "123-456-815", 2027, "Lily James"));
        books.add(new Book("The Dragon's Curse", "123-456-816", 2028, "Jack Harris"));
        books.add(new Book("The Dark Knight", "123-456-817", 2029, "Lucas Garcia"));
        books.add(new Book("The Silent Sea", "123-456-818", 2030, "Emma Martinez"));
        books.add(new Book("The Golden Compass", "123-456-819", 2031, "Owen Thompson"));
        books.add(new Book("The Secret Garden", "123-456-820", 2032, "Sophia Nelson"));
        books.add(new Book("The Black Mirror", "123-456-821", 2033, "Liam Walker"));
        books.add(new Book("The Silver Sword", "123-456-822", 2034, "Olivia Baker"));
        books.add(new Book("The Crystal Cave", "123-456-823", 2035, "James Anderson"));
        books.add(new Book("The Emerald City", "123-456-824", 2036, "Benjamin Martinez"));
        books.add(new Book("The Lost World", "123-456-825", 2037, "Grace Phillips"));
        books.add(new Book("The Golden Crown", "123-456-826", 2038, "Daniel Murphy"));
        books.add(new Book("The Shadow Thief", "123-456-827", 2039, "Amelia Roberts"));
        books.add(new Book("The Flame of Hope", "123-456-828", 2040, "Liam Hughes"));
        books.add(new Book("The Starry Night", "123-456-829", 2041, "Charlotte Rivera"));
        books.add(new Book("The Frozen Heart", "123-456-830", 2042, "Mason Evans"));
        books.add(new Book("The Hidden Kingdom", "123-456-831", 2043, "Harper Gonzalez"));
        books.add(new Book("The Golden Phoenix", "123-456-832", 2044, "Elijah Turner"));
        books.add(new Book("The Midnight Sun", "123-456-833", 2045, "Sofia Collins"));
        
        String returnString ="";
        for(Book book : books){
            if(book.getBookName().equalsIgnoreCase(crit)){ 
            returnString = "Yes we do have that book \n" + book.toString() ;
                return returnString;
            }
        
        return "";
   
    
        }
}}
