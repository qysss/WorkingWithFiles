package papruha.andrei;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class WorkWithFiles {
    @Test
    void selenideDownloadTest() throws FileNotFoundException {
        Selenide.open("https://github.com/junit-team/junit5/blob/main/README.md");
        File downloadedFile = $("#raw-url").download();
    }
}
