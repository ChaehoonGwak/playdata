문제 설명
스크린샷 2018-09-14 오후 5.44.19.png

위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다. 
아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다. 예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.

제한사항
삼각형의 높이는 1 이상 500 이하입니다.
삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.



def solution(triangle):
    answer = 0
    dp = []
    dp.append(triangle[0]) # 맨 꼭대기 수를 dp에 삽입
    
    for i in range(1, len(triangle)):
        temp = []
        temp.append(triangle[i][0] + dp[i-1][0]) # 맨 왼쪽 수
        
        for j in range(len(triangle[i])-2): # 중간에 있는 수는 왼쪽과 오른쪽에서 내려오는 두가지 케이스를 비교하여 더 큰 값으로 내려옴
            temp.append(max(triangle[i][j+1]+dp[i-1][j], triangle[i][j+1]+dp[i-1][j+1]))
            
        temp.append(triangle[i][-1] + dp[i-1][-1]) # 맨 오른쪽 수
        dp.append(temp)
        
    answer = max(dp[-1]) # 2차원 리스트의 맨끝에서 가장 큰 수가 거쳐간 숫자의 최댓값
    return answer
