import java.io.PrintWriter;
import java.util.Scanner;

public class Floyd_Warshall {
    // В качестве условной бесконечности 
    // выберем достаточно большое число 10^9
    private static final int INF = 1000 * 1000 * 1000;

    public static void main(String[] args) {
        Floyd_Warshall solution = new Floyd_Warshall();

        // Вызываем процедуру решения задачи
        solution.solve();
    }

    private void solve() {
        // Для считывания воспользуемся классом Scanner
        // Для вывода - классом PrintWriter
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        // Считываем число вершин графа
        int vertexCount = scanner.nextInt();

        // Граф будем хранить в матрице смежности
        int[][] g = new int[vertexCount][vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                // Считываем вес ребра между вершинами
                // i и j соответственно
                g[i][j] = scanner.nextInt();

                // По условию если g[i][j] = 0, то это
                // означает, что дуги из i в j нет;
                // в этом случае расстояние между этими
                // вершинами бесконечно велико
                if (g[i][j] == 0) {
                    g[i][j] = INF;
                }
            }
        }

        // Согласно алгоритму будем обновлять
        // ответ для каждой пары вершин i и j,
        // перебирая промежуточную вершину k
        for (int k = 0; k < vertexCount; k++) {
            for (int i = 0; i < vertexCount; i++) {
                for (int j = 0; j < vertexCount; j++) {
                    g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                }
            }
        }

        // Для каждой пары вершин выведем величину
        // кратчайшего пути от i до j, или 0,
        // если j не достижима из i
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (g[i][j] == INF) {
                    printWriter.print(0 + " ");
                } else {
                    printWriter.print(g[i][j] + " ");
                }
            }

            printWriter.println();
        }

        // После выполнения программы необходимо закрыть
        // потоки ввода и вывода
        scanner.close();
        printWriter.close();
    }
}