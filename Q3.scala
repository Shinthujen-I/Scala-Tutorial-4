//Question 3
import scala.io.StdIn.readLine;

object  Question {
    def toUpper(text:String) : String = text.toUpperCase();
    def toLower(text:String) : String = text.toLowerCase();

    def formatNames(name: String)(indexList: Int* )(func: String => String): String = {
        if(indexList.isEmpty){
            return func(name) ;
        }
        var out_name = "" ;
        var i = 0 ;

        while (i < name.length()){
            if(indexList.contains(i)) out_name = out_name + func(name.charAt(i).toString);
            else out_name = out_name + name.charAt(i).toString;
            i += 1 ;
        }
        return out_name;
    }

    def main(args: Array[String]): Unit = {
        
        println(formatNames("Benny")()(toUpper));
        println(formatNames("Niroshan")(1)(toUpper));
        println(formatNames("Saman")()(toLower));
        println(formatNames("Kumara")(5)(toUpper));
    }
}