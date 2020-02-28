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

We assume that <img src="https://render.githubusercontent.com/render/math?math=W1,\cdots,W_D" /> are the number of tasks in each step of depth. So we have 

<div align=center><img src="https://render.githubusercontent.com/render/math?math=T=\sum_{i=1}^D(W_i/P%2B1)=W/P%2BD" /></div>

## work stealing

<div align=center><img src="./2.png" /></div>

[Blumofe and Leiserson](http://supertech.csail.mit.edu/papers/steal.pdf) proves that work stealing can achieve the optimal time complexity.

## reference

- [Work stealing](https://en.wikipedia.org/wiki/Work_stealing)
- [Scheduling Multithreaded Computations by Work Stealing](http://supertech.csail.mit.edu/papers/steal.pdf)
- [Chapter 10 Work-Stealing](http://www.cs.tau.ac.il/~shanir/multiprocessor-synch-2003/steal/notes/steal.pdf)
- [并行算法科普向 系列之一：计算模型，调度器，和其它](https://zhuanlan.zhihu.com/p/90172780)