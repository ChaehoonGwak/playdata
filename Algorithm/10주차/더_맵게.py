문제 설명
매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 
모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

제한 사항
scoville의 길이는 2 이상 1,000,000 이하입니다.
K는 0 이상 1,000,000,000 이하입니다.
scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.

"""
heappush() O(logN)의 시간 복잡도
heappop() O(logN)의 시간 복잡도
"""

import heapq # heapq는 원소들이 항상 정렬된 상태로 추가,삭제 됨

def solution(scoville, K):
    answer = 0
    
    heapq.heapify(scoville) # scoville 리스트를 힙리스트로 변환
    if scoville[0] >= K: return answer # 가장 맵지 않은 음식이 K 이상이라면 0 리턴
    
    while True:
        new = heapq.heappop(scoville) + heapq.heappop(scoville)*2
        answer += 1
        heapq.heappush(scoville, new) 
        if scoville[0] >= K: break # 가장 맵지 않은 음식이 K 이상이라면 루프 종료
        if len(scoville) == 1: return -1 # 리스트 길이가 1이면 더이상 섞을 음식이 없고, K보다 높지 않으므로 -1 리턴
    
    return answer
