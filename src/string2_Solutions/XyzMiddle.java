package string2_Solutions;

public class XyzMiddle {

    public boolean xyzMiddle(String str) {

        if (str.length()>=5){

            for (int i = 0; i < str.length()/2; i++) {
                
            }
            
          

            }

        

        return false;

    }
    
//    public boolean xyzMiddle(String str) {
//
//        if (str.contains("xyz")){
//
//            String[] parts = str.split("xyz");
//
//            if (parts.length==2){
//
//                return (parts[0].length()==parts[1].length())||(parts[0].length()+1==parts[1].length())||(parts[0].length()-1==parts[1].length());
//
//            }
//
//        }
//
//        return false;
//
//    }

}

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the
left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */