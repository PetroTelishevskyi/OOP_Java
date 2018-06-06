package ua.lpnuai.oop.stasiuk12;

public class Item {
    public boolean name (String name){
        String typePattern = "[a-zA-Z]+";
        if (name.matches(typePattern)){
            return true;
        }
        return false;
    }

    public boolean phone(String data){
        String typePattern = "[A-Z\\d]{10}";
        if(data.matches(typePattern))
            return true;
        return false;

    }
    public boolean education (String education){
        String typePattern = "[a-zA-Z]+";
        //String numberPattern = "\\d+";
        if (education.matches(typePattern)){
            return true;
        }
        return false;
    }

    public boolean character (String character){
        String reasonPattern = ".+";
        if (character.matches(reasonPattern))
            return true;
        return false;
    }

    public boolean mark (String salary){
        String reasonPattern = "\\d+";
        if (salary.matches(reasonPattern))
            return true;
        return false;
    }
    public boolean birthday(String [] birthday){
        String typePattern = "\\d{2}\\.\\d{2}\\.\\d{4}";
        String type1Pattern = "[a-zA-Z]+";
        if(birthday[0].matches(typePattern) && birthday[1].matches(type1Pattern) && birthday[2].matches(type1Pattern))
            return true;
        return false;
    }



}