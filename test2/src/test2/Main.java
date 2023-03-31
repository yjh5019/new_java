package test2;

public class Main {
	
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public interface Operation {
	    String chat(String input);
	    void writeFile(String question, String answer);
	}

	public class Main implements Operation {

	    String[] question = {"happy", "hello", "old", "name", "bye"};
	    String[] answer = {"it's dope, man", "hey ya", "take a guess", "it's confidential", "see ya"};

	    @Override
	    public String chat(String input) {
	        for (int i = 0; i < question.length; i++) {
	            if (input.contains(question[i])) {
	                return answer[i];
	            }
	        }
	        return "lol";
	    }

	    @Override
	    public void writeFile(String question, String answer) {
	        try {
	            FileWriter writer = new FileWriter(System.getProperty("user.home") + "/Desktop/chat.csv", true);
	            writer.append(question + ",");
	            writer.append(answer + "\n");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        Main main = new Main();
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            String input = scanner.nextLine();
	            if (input.contains("bye")) {
	                break;
	            }
	            String response = main.chat(input);
	            main.writeFile(input, response);
	        }
	    }
	}

}
