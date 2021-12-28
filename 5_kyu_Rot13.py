# My solution
def rot13(message):
    new_message = ""
    for char in message:
        if not char.isalpha():
            new_message += char
        else:
            if char.isupper():
                new_message += convert(char.lower()).upper()
            else:
                new_message += convert(char)
    return new_message

def convert(char):
    uppercase = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', \
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', \
            'w', 'x', 'y', 'z']
    numerical_value = uppercase.index(char)
    numerical_value += 13
    if numerical_value > 25:
        numerical_value -= 26
    return uppercase[numerical_value]


# Good solution in the discussion section
import string
from codecs import encode as _dont_use_this_

def rot13(message):
    alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    outputMessage = ""
    for letter in message:
        if letter in alpha.lower():
            outputMessage += alpha[(alpha.lower().index(letter) +13) % 26].lower()
        elif letter in alpha:
            outputMessage += alpha[(alpha.index(letter) +13) % 26]
        else:
            outputMessage += letter
    return outputMessage


# Top rated solution in discussion section
import string
from codecs import encode as _dont_use_this_
from string import maketrans, lowercase, uppercase

def rot13(message):
    lower = maketrans(lowercase, lowercase[13:] + lowercase[:13])
    upper = maketrans(uppercase, uppercase[13:] + uppercase[:13])
    return message.translate(lower).translate(upper)
    