import random

def guessing_game():
    # Generate a random number between 1 and 100 (you can adjust the range if needed)
    secret_number = random.randint(1, 100)
    attempts = 0

    print("Welcome to the Guessing Game!")
    print("I've picked a random number between 1 and 100. Can you guess it?")

    while True:
        try:
            # Ask for the user's guess
            guess = int(input("Enter your guess: "))
            attempts += 1

            # Compare the guess to the secret number
            if guess == secret_number:
                print(f"Congratulations! You guessed the number {secret_number} in {attempts} attempts.")
                break
            elif guess < secret_number:
                print("Too low! Try again.")
            else:
                print("Too high! Try again.")

        except ValueError:
            print("Invalid input. Please enter a valid number.")

if __name__ == "__main__":
    guessing_game()
