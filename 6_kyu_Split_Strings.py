def solution(s):
    split_strings = []
    if len(s) == 0:
        return split_strings
    for index in range(0, len(s), 2):
        if (index < len(s) - 2):
            split_strings.append(s[index : index + 2])
        else:
            split_strings.append(s[index:])
    if len(split_strings[-1]) == 1:
        split_strings[-1] += '_'
    return split_strings


def solution(s):
    result = []
    if len(s) % 2:
        s += '_'
    for i in range(0, len(s), 2):
        result.append(s[i:i+2])
    return result
    