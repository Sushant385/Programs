words = input('Enter word').split()
alpha = 0
for word in words:
    for ch in word:
        if ch.isalpha():
            alpha += 1
print(alpha)
print(word)
