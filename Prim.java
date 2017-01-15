import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 15.01.2017.
 */
public class Prim {

    int INF = Integer.MAX_VALUE / 2; // "Бесконечность"
    int vNum; // количество вершин
    int eNum; // количество рёбер
    int start; // index of start vertex
    int[][] graph; // матрица смежности

    Prim(){
        Scanner scanner = new Scanner(System.in);
        vNum=scanner.nextInt();
        eNum=scanner.nextInt();
        graph= new int [vNum][vNum];
        for (int e_i = 0;e_i < eNum; e_i++){
            int i = scanner.nextInt()-1;
            int j = scanner.nextInt()-1;
            graph[i][j]=graph[j][i]=scanner.nextInt();
        }
        start = scanner.nextInt()-1;
        for (int i = 0; i < vNum; i++)
            for(int j = 0; j < vNum; j++)
                if(graph[i][j]==0 && i!=j)
                    graph[i][j]=INF;


    }
    private void solve (){
        System.out.println(mstPrim());
    }

    public static void main(String[] args) {
        Prim solution = new Prim();

        // Вызываем процедуру решения задачи
        solution.solve();
    }



    /* Алгоритм Прима за O(V^2) */
    int mstPrim() {
        boolean[] used = new boolean [vNum]; // массив пометок
        int[] dist = new int [vNum]; // массив расстояния. dist[v] = вес_ребра(MST, v)

        Arrays.fill(dist, INF); // устанаавливаем расстояние до всех вершин INF
        dist[start] = 0; // для начальной вершины положим 0
        for (;;) {
            int v = start-1;
            for (int nv = 0; nv < vNum; nv++) // перебираем вершины
                if (!used[nv] && dist[nv] < INF && (v == start-1 || dist[v] > dist[nv])) // выбираем самую близкую непомеченную вершину
                    v = nv;
            if (v == start-1) break; // ближайшая вершина не найдена
            used[v] = true; // помечаем ее
            for (int nv = 0; nv < vNum; nv++)
                if (!used[nv] && graph[v][nv] < INF) // для всех непомеченных смежных
                    dist[nv] = Math.min(dist[nv], graph[v][nv]); // улучшаем оценку расстояния (релаксация)
        }
        int ret = 0; // вес MST
        for (int v = 0; v < vNum; v++)
            ret += dist[v];
        return ret;
    }
}
