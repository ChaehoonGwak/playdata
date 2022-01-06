1260

문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.



from collections import deque

N, M, V = map(int, input().split())

graph = [[] for _ in range(N+1)] # 그래프 초기화

for _ in range(M): # 각 노드가 연결된 정보를 입력
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
    
for i in graph: # 그래프의 연결된 정보를 정렬 (작은 수 순으로 탐색)
    i.sort()
    
visited = [False] * (N+1) # 각 노드가 방문된 정보 초기화

def dfs(graph, v, visited):
    visited[v] = True # 현재 노드를 방문 처리
    print(v, end=' ')
    
    for i in graph[v]: # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        if not visited[i]:
            dfs(graph, i, visited)
            
def bfs(graph, start, visited):
    queue = deque([start]) # 큐 구현을 위해 deque 라이브러리 사용
    visited[start] = True # 현재 노드를 방문 처리
    
    while queue: # 큐가 빌 때까지 반복
        v = queue.popleft() # 큐에서 하나의 원소를 뽑아 출력
        print(v, end=' ')
        
        for i in graph[v]:  # 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            if not visited[i]:
                queue.append(i)
                visited[i] = True
        
            
dfs(graph, V, visited)
visited = [False] * (N+1) # 각 노드가 방문된 정보 초기화
print() # 줄바꿈 입력
bfs(graph, V, visited)
