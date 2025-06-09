package javacore.chapter05.object.exercise;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@SuppressWarnings("restriction")
public class TestBase64 {

    public static void main(String[] args) {

        String testContent = "Du texte à encoder pour être envoyé.";

        String encodedContent = Base64.getEncoder().encodeToString(testContent.getBytes(StandardCharsets.UTF_8));

        System.out.println("Contenu encodé : " + encodedContent);

    }

}