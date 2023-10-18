package DailyPractise.oops;

public class ParameterizedConstructor {

    String languages;
    ParameterizedConstructor(String lang){
        languages=lang;
        System.out.println(languages);




    }
    public static void main(String args[]){
        ParameterizedConstructor object=new ParameterizedConstructor("Hello java");
    }

}
