import random

number = random.randint(1,10)

guess = input("U cool")
guess = int(guess)

if guess == number:
    print("you won")