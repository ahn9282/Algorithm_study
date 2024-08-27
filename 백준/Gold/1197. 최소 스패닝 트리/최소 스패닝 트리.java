
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Node>[] arr = new ArrayList[N + 1];
        boolean[] visited = new boolean[N + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<Node>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            arr[A].add(new Node(B, C));
            arr[B].add(new Node(A, C));
        }

        PriorityQueue<Node> que = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        long answer = 0;
        int count = 0;
        que.add(new Node(1, 0));

        while (!que.isEmpty()) {
            Node now = que.poll();
            int weight = now.weight;
            int node = now.end;
            if (visited[node]) continue;
            visited[node] = true;
            answer += weight;
            count++;
            if (count == N) break;

            for (Node next : arr[node]) {
                if(!visited[next.end]){
                    que.add(next);
                }
            }
        }
        System.out.println(answer);
    }
}
class Node {

    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
}