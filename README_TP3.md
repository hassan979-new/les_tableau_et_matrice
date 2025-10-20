
# 🧮 **Ex3 – Spiral Matrix in Java**

## 📘 Description

This project implements two classic array algorithms in Java:

Ce programme Java remplit une matrice carrée n x n avec des entiers consécutifs de 1 à n² en suivant un parcours en spirale (sens horaire).

## 📂 Project Structure
- projets
- ├──TP3/
- │  └── src/
- │      └── ex3/
- │          └── Ex3.java
- └── README_TP3.md
## ⚙️ Features

- ✅Input a square matrix size n from the user

- ✅Automatically fill the matrix with integers from 1 to n²

- ✅Fill in clockwise spiral order

- ✅Dynamic adjustment of matrix boundaries using top, down, left, right

- ✅Clean and readable console output

- ✅Works for any reasonable matrix size (e.g., n ≤ 1000)

## 🧠 Core Methods
| Concept                        | Description                                                                        |
| ------------------------------ | ---------------------------------------------------------------------------------- |
| `top`, `down`, `left`, `right` | Indices representing the current boundaries of the spiral fill                     |
| Nested loops                   | Used to fill the matrix in 4 directions: left→right, top→down, right→left, down→up |
| `num`                          | Counter for consecutive integers from 1 to n²                                      |
| While loop                     | Continues until all numbers are placed in the matrix                               |

## 🖥️ Example Execution

### For n = 2 and n = 5 :
### Ourput:
<img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/8de1519b-cc65-4540-a950-469579d2936d" />
<img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/c9ff19a3-5e98-4c00-87c3-ba71e9f3ae05" />


## 💡 Concepts Practiced

- Iterative control of 2D arrays using index boundaries

- Spiral traversal of a matrix

- Nested loops for structured iteration

- User input handling via Scanner

## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Fondamentaux et Concepts Avancés de la Programmation Java – TP1
- 🎓 Instructor	Mr.LACHGAR
- 📅 4	October 2025

