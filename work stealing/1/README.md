# introduction

## task parallel

Tasks can be decomposited into subtasks, and subtasks are connected with dependency. So subtasks can be described by a directed acyclic graph, such as 

<div align=center><img src="./1.png" /></div>

## time complexity

Assume that

- subtasks can be executed in <img src="https://render.githubusercontent.com/render/math?math=T_1" /> time in sequential situation
- subtasks can be executed in <img src="https://render.githubusercontent.com/render/math?math=T_\infinity" /> time when there are infinite processes
- <img src="https://render.githubusercontent.com/render/math?math=P" /> is the actual number of processes

[Blumofe and Leiserson](http://supertech.csail.mit.edu/papers/steal.pdf) proves that the optimal time complexity is <img src="https://render.githubusercontent.com/render/math?math=T_1/P%2BO(T_\infinity)" />.

### simple proof

Assume that every subtask one unit time, then the optimal time complexity is <img src="https://render.githubusercontent.com/render/math?math=W/P%2BO(D)" /> with

- <img src="https://render.githubusercontent.com/render/math?math=W" /> is the number of tasks
- <img src="https://render.githubusercontent.com/render/math?math=D" /> is the depth of directed acyclic graph


## work stealing