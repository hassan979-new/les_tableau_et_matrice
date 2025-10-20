
# 🧮 **Ex4 – Maximum Rectangle Surface in a Binary Matrix**

## 📘 Description

This Java project calculates the largest rectangle of 1's in a binary matrix (2D array of 0s and 1s).

- The project demonstrates the use of:

- Histogram-based approach to transform rows into 1D arrays

- Nested loops for calculating rectangle surfaces

- Use of Math.min and Math.max for comparisons

- Iterative logic for 2D array traversal

It is an example of applying algorithmic thinking to solve matrix problems efficiently.

## 📂 Project Structure
- projets
- ├──TP4/
- │  └── src/
- │      └── ma/project/ex4//
- │          └── Ex4.java
- └── README_TP4.md
## ⚙️ Features

- ✅Input is a binary matrix of 0s and 1s

- ✅Computes the largest rectangle composed entirely of 1's

- ✅Uses a histogram transformation of each row to simplify calculations

- ✅Efficient comparison using Math.min and Math.max

- ✅Prints the maximum rectangle surface found
## 🧠 Core Methods
| Method                  | Description                                        | Parameters             | Returns            |
| ----------------------- | -------------------------------------------------- | ---------------------- | ------------------ |
| `largeSurface(int[] t)` | Computes the maximum rectangle area in a histogram | `t` – array of heights | Maximum area (int) |

## 🖥️ Example Execution

### Input (Matrix m in the code)
``` 
int[][] m = {
    {1, 0, 1, 1, 1},
    {1, 1, 1, 1, 1},
    {0, 1, 1, 1, 0}
}; 
```
### Output :
<img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/c78af606-3c96-427a-b21a-b334ea72b9d2" />

## 💡 Concepts Practiced

- Transforming a 2D matrix problem into a series of 1D histogram problems

- Calculating maximum rectangle area in a histogram

- Iterative logic with nested loops

- Efficient use of min/max operations
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Fondamentaux et Concepts Avancés de la Programmation Java – TP1
- 🎓 Instructor	Mr.LACHGAR
- 📅 11	October 2025

