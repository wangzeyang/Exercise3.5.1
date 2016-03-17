import javax.swing.JOptionPane;

public class exercise {
    public static void main (String [] args){
    
    String s2,s3,s4,s5,s6;
    s2="Administrator";
    s3="Faculty";
    s4="Staff";
    s5="Student";
    s6="Guest";
    String s1=JOptionPane.showInputDialog("please enter your user role;\n"
            + "you can choose: Administrator, Faculty, Staff, Student,or Guest");
    while(!s1.equals(s2)&& !s1.equalsIgnoreCase(s3)&& !s1.equals(s4)&& !s1.equals(s5)&& !s1.equals(s6)){
        JOptionPane.showMessageDialog(null,"Wrong user role");
         s1=JOptionPane.showInputDialog("please enter your user role;\n"
                + "you can choose: Administrator, Faculty, Staff, Student,or Guest");
         }
        
        
    switch(s1){
    case("Administrator"): 
        JOptionPane.showMessageDialog(null,"welcome Administrator");
        break;
    case("Faculty"): 
        JOptionPane.showMessageDialog(null,"welcome Faculty");
        break;
    case("Staff"): 
        JOptionPane.showMessageDialog(null,"welcome Staff");
        break;
    case("Student"): 
        JOptionPane.showMessageDialog(null,"welcome Student");
        break;
    case("Guest"): 
        JOptionPane.showMessageDialog(null,"welcome Guest");
        break;
        }
    
        
    
    }
}
