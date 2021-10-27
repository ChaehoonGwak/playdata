문제 설명
이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.

명령어	수신 탑(높이)
I 숫자	큐에 주어진 숫자를 삽입합니다.
D 1	큐에서 최댓값을 삭제합니다.
D -1	큐에서 최솟값을 삭제합니다.
이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 
비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.

제한사항
operations는 길이가 1 이상 1,000,000 이하인 문자열 배열입니다.
operations의 원소는 큐가 수행할 연산을 나타냅니다.
원소는 “명령어 데이터” 형식으로 주어집니다.- 최댓값/최솟값을 삭제하는 연산에서 최댓값/최솟값이 둘 이상인 경우, 하나만 삭제합니다.
빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시합니다.



import heapq

def solution(operations):
    hq = [] # 힙큐 리스트 초기화
    
    for op in operations:
        if op[0] == 'I': # 'I'라면 리스트에 push
            heapq.heappush(hq, int(op[2:]))
        else: # 'D' 라면 최댓값이나 최솟값을 pop
            if op == 'D 1': # 정렬 후 최댓값 pop
                if hq:
                    hq.sort()
                    hq.pop()
            elif op == 'D -1': # heapq를 이용해 최솟값 pop
                if hq: heapq.heappop(hq)
                    
    if hq: return [max(hq), min(hq)] # hq가 비어있지 않다면 최댓값과 최솟값 리스트로 반환
    else : return [0, 0] # hq가 비어있따면 [0, 0] 리스트 반환
