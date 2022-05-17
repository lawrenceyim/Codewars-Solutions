def dig_pow(n, p):
    sum = 0
    num = str(n)
    for i in range(0, len(num)):
        sum += int(num[i]) ** (p + i)
    if int(sum % n) == 0:
         return sum // n
    return -1