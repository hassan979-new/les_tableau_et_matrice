
# 🧮 **Ex5 – Circular Permutation Check in Java**

## 📘 Description

This Java project checks whether a given array of integers represents a valid circular permutation.

A circular permutation is defined as an array containing all integers from 1 to n exactly once, which can be rotated to form either a strictly increasing or strictly decreasing sequence.

- The project demonstrates:

- Array manipulation and traversal

- Checking permutations and rotations

- Handling both increasing and decreasing sequences

- Iterative comparison with modular arithmetic
## 📂 Project Structure
- projets
- ├──TP5/
- │     └── ma/project/
- │-----     └── Ex5.java
- └── README_TP4.md
## ⚙️ Features

- ✅Check if an array is a permutation of 1…n

- ✅Verify if the permutation can be rotated to form an increasing or decreasing sequence

- ✅Modular arithmetic for circular rotation

- ✅Supports arrays of any reasonable size

## 🧠 Core Methods
| Method                                       | Description                                         | Parameters                                   | Returns          |
| -------------------------------------------- | --------------------------------------------------- | -------------------------------------------- | ---------------- |
| `estPermutationCirculaire(int[] tab, int n)` | Checks if the array is a valid circular permutation | `tab` – integer array, `n` – length of array | `true` / `false` |


## 🖥️ Example Execution

### Input 
``` 
int[] tab = {2, 1, 5, 4, 3};
```
### Output :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/fe87d8d4-fa5d-4f03-888d-a8a1eafc85dd" />
### Input 
``` 
int[] tab = {3, 1, 4, 2, 5};
```
### Output :
<img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/a20e1a2c-e359-4c9a-8d9b-7548eb548646" />

## 💡 Concepts Practiced

- Array validation and uniqueness check

- Circular rotation using modular arithmetic (i + offset) % n

- Comparison with strictly increasing and decreasing sequences

- Boolean flags for flexible verification
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Fondamentaux et Concepts Avancés de la Programmation Java – TP1
- 🎓 Instructor	Mr.LACHGAR
- 📅 11	October 2025

