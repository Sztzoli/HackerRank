package Regex;

public class MyRegex {


    String num = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
// [01]?[0-9]{1,2} 0 vagy 1 lehet elől és az első második helyen 1-9 vagyis 0-199
// 2[0-4][0-9] 2 van elől majd második helyen 0-4 3. 0-9 vagyis 200-249
// 25[0-9] 3 helyen 0-9 ig
    String pattern = num + "." + num + "." + num + "." + num;
}
