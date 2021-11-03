package JavaPractice;

public class StringAlternativePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String altString ="";
		String name = "GeeksforGeeks";
        int counter=1;
        for(int i = 0; i<name.length(); i++){
            
            if(counter == 1){
                altString =  altString + name.charAt(i);
            }
            if(counter > 1 && !(counter%2==0)){
                altString =  altString + name.charAt(i);
            }
            counter++;
        }
        System.out.println(altString);
        System.out.println(altString);
        

	}

}