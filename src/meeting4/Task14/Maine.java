package meeting4.Task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maine {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/Score.csv"));
        String line = reader.readLine();

        List<Score> listScore = new ArrayList<>();

        while (line != null) {
            System.out.println(line);
            String[] tablicaScore = line.split(",");
            Score score = new Score(tablicaScore[0], tablicaScore[1], tablicaScore[2]);
            listScore.add(score);
            line = reader.readLine();
        }
        reader.close();

        System.out.println(listScore);


        System.out.println("*******SORTMIN***************************");
        List<Score> sortMin = listScore.stream()
                .sorted(Comparator.comparing(score -> score.getTimestamp()))
                .collect(Collectors.toList());
        System.out.println("Min" + sortMin);


        System.out.println("*******Max***************************");
        List<Score> max = listScore.stream().sorted(Comparator.comparing(Score::getTimestamp).
                        reversed()).collect(Collectors.toList());

        System.out.println(max);


        System.out.println("*******TOP5***************************");
        List<Score> top5LatestScores = max.stream().limit(5).collect(Collectors.toList());
        System.out.println(top5LatestScores);
    }
}
