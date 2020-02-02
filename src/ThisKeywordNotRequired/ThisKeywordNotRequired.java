
package ThisKeywordNotRequired;

public class ThisKeywordNotRequired {
    
    int id;
    String name;
    
    ThisKeywordNotRequired(int i, String n){
    
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        
        ThisKeywordNotRequired s1 = new ThisKeywordNotRequired(1, "Wan Sornolota IT");
        ThisKeywordNotRequired s2 = new ThisKeywordNotRequired(2, "Potro Chaya");
        
        s1.display();
        s2.display();
    }
}
