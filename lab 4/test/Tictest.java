import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Tictest {

String[][] resultTest1 = {{"|", " ", "|"}}; //1,1
String[][] resultTest2 = {{"|", " ", "|", "|", " ", "|"},{"|", " ", "|", "|", " ", "|"}}; //2,2
String[][] resultTest3 = {{"|", " ", "|"},{"|", " ", "|"},{"|", " ", "|"}}; //3,1
String[][] resultTest4 = {{"|", " ", "|", "|", " ", "|", "|", " ", "|"}};//1,3
String[][] resultTest5 = {{"|", " ", "|", "|", " ", "|", "|", " ", "|"}, {"|", " ", "|", "|", " ", "|", "|", " ", "|"}}; //2,3

@Test
void testResults1() {
Tic test = new Tic();
assertArrayEquals(resultTest1, test.createBoard(0,1));

@Test
    void testResults1() {
    Tic test = new Tic();
    assertArrayEquals(resultTest1, test.createBoard(1,2));
    }



}
}