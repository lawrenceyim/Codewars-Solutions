def solution(number):
    if number < 3:
         return 0
    sum = 0
    for i in range(3, number, 3):
        if i % 5 != 0:
            sum += i
    if number >= 5:
        for i in range(5, number, 5):
            sum += i
    return sum
  

def solution(number):
    sum = 0
    for i in range(number):
        if (i % 3) == 0 or (i % 5) == 0:
            sum += i
    return sum


def solution(number):
    return sum(x for x in range(number) if x % 3 == 0 or x % 5 == 0)
