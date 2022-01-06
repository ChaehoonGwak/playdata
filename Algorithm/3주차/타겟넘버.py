문제 설명
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.



def dfs(numbers, idx, target, num):
        global answer
        if idx == len(numbers): # 모든 수를 연산 했을 때 그 수가 target과 같으면 answer++
            if num == target:
                answer += 1
            return
        
        # 더하거나 빼거나 둘 중 하나
        dfs(numbers, idx+1, target, num+numbers[idx]) 
        dfs(numbers, idx+1, target, num-numbers[idx])
        
def solution(numbers, target):
    global answer    
    answer = 0 # 타겟 넘버를 만드는 방법의 수 초기화
    dfs(numbers, 0, target, 0) # 타겟 넘버를 만드는 방법의 수를 세는 dfs 함수 호출
    return answer
