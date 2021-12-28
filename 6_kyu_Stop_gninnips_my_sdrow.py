def spin_words(sentence):
    words = sentence.split(" ")
    print(words)
    result = ""
    for word in words:
        if len(word) >= 5:
            result += word[::-1] + " "
        else:
            result += word + " "
    print(result)
    return result.rstrip()
    

def spin_words(sentence):
    words = [word for word in sentence.split(" ")]
    words = [word if len(word) < 5 else word[::-1] for word in words]
    return " ".join(words)
    

def spin_words(sentence):
    return " ".join([x[::-1] if len(x) >= 5 else x for x in sentence.split(" ")])
