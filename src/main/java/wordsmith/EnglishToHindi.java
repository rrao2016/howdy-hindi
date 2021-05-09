package wordsmith;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;


public class EnglishToHindi {

    private String name;
    private int number;
    private int transCategory;
    private String color;
    private String animals;
    private String fruits;

    //getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getAnimals() {
        return animals;
    }

    public String getFruits() {
        return fruits;
    }

    //
//Methods
public String learnWord() {

    // create instance of Random class
    Random rand = new Random();
    int rand_int1 = rand.nextInt(5);

    Map<Integer, String> wordGen = new HashMap<>();
    wordGen.put(0, "\"Have a good day!\" in hindi is \"Accha Din!\"");
    wordGen.put(1, "\"Hello\" in hindi is \"Namaste\"");
    wordGen.put(2, "\"How are you?\"  in hindi is \"Aap kaise hain?\"");
    wordGen.put(3, "\"Thank You\" in hindi is \"Shukriya!\"");
    wordGen.put(4, "\"Good Morning\" in hindi is \"Shubh Din\"");
    wordGen.put(5, "\"What is your name?\" in hindi is \"Tumhara Naam kya hain?\"");
    return ("Phrase of the day: ==> " + wordGen.get(rand_int1));
    }

  public String animalTranslate(String wordEntered){
        this.animals = wordEntered;
           if(this.animals.equals("cat")){

            return "Cat in hindi is \"Billi\"";
        }
      else if(this.animals.equals("dog")){

          return "dog in hindi is \"Kutta\"";
      }
      else if(this.animals.equals("bird")){

          return "bird in hindi is \"Chidiya\"";
      }
      else if(this.animals.equals("fish")){

          return "fish in hindi is \"Machali\"";
      }
      else if(this.animals.equals("lion")){

          return "Lion in hindi is \"Sher\"";
      }

        else return "Not available in the translator";

    }

    //Number translator
    public String numberTranslate(int numberEntered){
        this.number = numberEntered;
        if(this.number==1){

            return "1 in hindi is \"EK\"";
        }
        else if(this.number==2){

            return "dog in hindi is \"DO\"";
        }
        else if(this.number==3){

            return "3 in hindi is \"TEEN\"";
        }
        else if(this.number==4){

            return "4 in hindi is \"CHAR\"";
        }
        else if(this.number==5){

            return "5 in hindi is \"PAANCH\"";
        }
        else if(this.number==6){

            return "6 in hindi is \"CHE\"";
        }
        else if(this.number==7){

            return "7 in hindi is \"SAATH\"";
        }
        else if(this.number==8){

            return "8 in hindi is \"AAT\"";
        }
        else if(this.number==9){

            return "9 in hindi is \"NAU\"";
        }else if(this.number==10){

            return "10 in hindi is \"DUS\"";
        }

        else return "Not available in the translator";
    }

//Color Translator
public String colorTranslate(String colorEntered){
    this.color = colorEntered;
    if(this.color.equals("red")){

        return "Red in hindi is \"Laal\"";
    }
    else if(this.color.equals("blue")){

        return "blue in hindi is \"Neeli\"";
    }
    else if(this.color.equals("green")){

        return "green in hindi is \"Hara\"";
    }
    else if(this.color.equals("yellow")){

        return "yellow in hindi is \"Peeli\"";
    }
    else if(this.color.equals("black")){

        return "Black in hindi is \"Kaala\"";
    }
    else if(this.color.equals("white")){

        return "White in hindi is \"Safedh\"";
    }

    else return "Not available in the translator";

}


    //=================

}






