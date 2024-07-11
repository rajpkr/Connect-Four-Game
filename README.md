# Connect Four Game

## Introduction

Connect Four is a two-player connection game in which the players take turns dropping colored discs into a vertical grid. The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four of one's own discs. This project is a console-based implementation of the Connect Four game in Java.

## Features

- Two-player mode
- Console-based interface
- Simple and intuitive gameplay

## Prerequisites

- Java Development Kit (JDK) installed
- Git installed (optional, for cloning the repository)

## Getting Started

### Cloning the Repository

To clone the repository, use the following command:
```sh
git clone https://github.com/rajpkr/Connect-Four-Game.git
```

## Project Structure
The project structure is as follows:
```sh
Connect-Four-Game/
├── src/
│   └── connect_four_game/
│       ├── Board.java
│       ├── Player.java
│       ├── Game.java
│       └── ConnectFour.java
└── README.md
```

## Running the Game
### Navigate to the project directory:
```sh
cd Connect-Four-Game/src
```
### Compile the Java files:
```sh
javac connect_four_game/*.java
```
### Run the game:
```sh
java connect_four_game.ConnectFour
```
## How to Play

- The game is played on a grid with 6 rows and 7 columns.
- Players take turns dropping their discs into one of the columns.
- The goal is to connect four of your discs in a row horizontally, vertically, or diagonally.
- The first player to connect four discs wins the game.
- If the grid is completely filled and no player has connected four discs, the game ends in a draw.

### Controls
Enter the column number (0-6) where you want to drop your disc.

### Example Gameplay
```sh
 0 1 2 3 4 5 6
 . . . . . . .
 . . . . . . .
 . . . . . . .
 . . . . . . .
 . . . . . . .
 R . . . . . .
```

Player 1's turn (R)
Choose a column (0-6): 1

## Contributing
Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

## Author
[Prince Kamal Raj]

## License
This project is licensed under the MIT License.
