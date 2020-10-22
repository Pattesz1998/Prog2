import java.io.BufferedReader; //buffer olvasás
import java.io.IOException; //kivételkezelés
import java.io.InputStreamReader; //standart inputos olvasás
import java.util.HashMap; //térkép a cseréhez
import java.util.regex.Matcher; //megfeleltetés
import java.util.regex.Pattern; //karakterkészet
class L33tConvertor {
private String toLeetCode(String str) {
Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // ←-
megadja hogy milyen karaktereken lehet elvégezni a ←-
cserét
StringBuilder result = new StringBuilder(); // ←-
eredmény tárolás
HashMap<Character, String> map = new HashMap<Character, ←-
String>(); //a csere térképét adja meg
map.put(’A’, "@");
map.put(’B’, "ß");
map.put(’C’, "©");
map.put(’D’, "¯d");
map.put(’E’, "C");
map.put(’F’, "&#x192;");
map.put(’G’, "6");
map.put(’H’, "#");
map.put(’I’, "!");
map.put(’J’, "¿");
map.put(’K’, "X");
map.put(’L’, "£");
map.put(’M’, "M");
map.put(’N’, "r");
map.put(’O’, "0");
map.put(’P’, "p");
map.put(’Q’, "0");
map.put(’R’, "®");
map.put(’S’, "$");
map.put(’T’, "7");
map.put(’U’, "$\mathrm{\mu}$");
map.put(’V’, "v");
map.put(’W’, "w");
map.put(’X’, "%");
map.put(’Y’, "$\yen$");
map.put(’Z’, "z");
map.put(’0’, "O");
map.put(’1’, "I");
map.put(’2’, "2");
map.put(’3’, "2");
map.put(’4’, "2");
map.put(’5’, "2");
map.put(’6’, "2");
map.put(’7’, "2");
map.put(’8’, "2");
map.put(’9’, "2");
for (int i = 0; i < str.length(); i++) { //végig ←-
megy a bufferen
char key = Character.toUpperCase(str.charAt(i)); ←-
//nagybet˝usen olvassa be a buffert
Matcher matcher = pattern.matcher(Character.toString( ←-
key));
if (matcher.find()) { //ha nincs a ←-
karakter a készletbe akkor visszaadja önmagát
result.append(key);
result.append(’ ’);
} else { //ha benne van ←-
akkor a párját a térképb˝ol
result.append(map.get(key));
result.append(’ ’);
}
}
return result.toString();
}
public static void main(String[] args) throws IOException {
L33tConvertor obj = new L33tConvertor();
BufferedReader br = new BufferedReader(new ←-
InputStreamReader(System.in));
String leetWord;
int cont;
do {
System.out.println("\nEnter the English Words ←-
:-");
leetWord = br.readLine();
String leet = obj.toLeetCode(leetWord);
System.out.println("The 1337 Code is :- " + ←-
leet);
System.out.println("\n\nDo you want to continue ? [1= ←-
Yes and 0=No]");
cont = Integer.parseInt(br.readLine());
} while (cont != 0);
}
}