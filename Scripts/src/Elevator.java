
import java.util.BitSet;


public class Elevator {

  /**
   * 
   * @param A weights of queued people
   * @param B floors where person i will drop by
   * @param M floor to reach
   * @param X maximum number of person can stay in a lift
   * @param Y maximum weight can lift hold
   * @return total number of times lift will be stopped to reach ground floor
   */
  public static int solution(int[] A, int[] B, int M, int X, int Y) {
    int currentWeight = 0;
    int currentPeople = 0;
    int totalPeople = A.length;
    int stopCount = 0;

    BitSet dropByFloors = new BitSet(M);

    for (int i = 0; i < totalPeople; i++) {
      if (currentPeople + 1 <= X && currentWeight + A[i] <= Y) {
        currentPeople += 1;
        currentWeight += A[i];
        dropByFloors.set(B[i]);
      } else {
        stopCount += dropByFloors.cardinality();
        stopCount += 1; // coming down to ground floor
        dropByFloors.clear();
        currentPeople = currentWeight = 0;
        i--;
      }
    }
    if (!dropByFloors.isEmpty()) {
      stopCount += dropByFloors.cardinality();
      stopCount += 1; // coming down to ground floor
    }
    return stopCount;
  }

  public static void test() {
    int[] A = new int[] {60, 80, 40};
    int[] B = new int[] {2, 3, 5};
    int M = 5;
    int X = 2;
    int Y = 200;
    assertThat(solution(A, B, M, X, Y), 5);

    A = new int[] {40, 40, 100, 80, 20};
    B = new int[] {3, 3, 2, 2, 3};
    M = 3;
    X = 5;
    Y = 200;
    assertThat(solution(A, B, M, X, Y), 6);

    A = new int[] {40, 40, 100, 200, 20};
    B = new int[] {3, 3, 2, 2, 3};
    M = 3;
    X = 5;
    Y = 200;
    assertThat(solution(A, B, M, X, Y), 7);

    A = new int[] {40, 40, 100, 200, 20};
    B = new int[] {3, 3, 2, 2, 3};
    M = 3;
    X = 1;
    Y = 200;
    assertThat(solution(A, B, M, X, Y), 10);
  }

  public static void assertThat(int a, int b) {
    if (a != b) {
      System.err.println("Excepted - " + b + " ; but returned - " + a);
    } else {
      System.out.println("Excepted - output matches with returned - " + a);
    }
  }

  public static void main(String args[]) {
    test();
  }
}
