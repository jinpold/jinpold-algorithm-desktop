package jinPractice;

import java.util.*;

public class GraphSearch {
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static StringBuilder dfsResult = new StringBuilder();
    private static StringBuilder bfsResult = new StringBuilder();

    public static void dfs(int v) {
        visited[v] = true;
        dfsResult.append(v).append(" ");
        for (int node : adjList[v]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            bfsResult.append(v).append(" ");
            for (int node : adjList[v]) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.offer(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int V = sc.nextInt(); // 시작 정점

        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adjList[i]);
        }

        visited = new boolean[N + 1];
        dfs(V);

        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(dfsResult);
        System.out.println(bfsResult);
    }
}