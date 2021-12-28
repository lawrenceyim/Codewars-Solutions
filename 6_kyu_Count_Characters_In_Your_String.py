# My solution
def count(string):
    unique = set()
    characters = {}
    for i in string:
        if i not in unique:
            unique.add(i)
    for i in unique:
        characters[f"{i}"] = string.count(i)
    return characters


# A good solution on the discussion board
def count(string):
    return {i: string.count(i) for i in string}


# Top rated solution on the discussion board. This solution isn't very readable or understandble
# without knowledge of the Counter module from collections
from collections import Counter

def count(string):
    return Counter(string)