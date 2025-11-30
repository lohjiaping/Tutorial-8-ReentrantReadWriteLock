# Tutorial-6-ReentrantReadWriteLock

## The following questions are based on the above Java program. 

## a. Create the main class for this program (5 marks) 
<img width="1920" height="1020" alt="Image" src="https://github.com/user-attachments/assets/f964e71a-676d-49ec-9967-bfe12d8ff701" />

## b. What is the output of this program?(3 marks) 
<img width="1920" height="1020" alt="Image" src="https://github.com/user-attachments/assets/9436e076-6d39-4971-8eb5-90aadd51bc70" />

## c. What is the advantage of using ReentrantReadWriteLock over synchronized method in this program? (2 marks) 

`The advantages of using ReentrantReadWriteLock is allow the Threads enter into the lock on a resources  many times, more efficiency compared to use synchronized method. `


## d. Explain the difference between readLock() and writeLock().(3 marks) 

`The readLock() is like a shared lock that allow mutiple threads to enter into the lock at the same time. However, the writeLock() is like an exclusive lock only allows one thread to hold this lock at a time. The users on readLock() can only read to prevent Race conditions and the users on writeLock() nobody thread can write until the lock is released.`

 

## e. Why is writeLock.unlock() placed in a finally block? (2 marks) 

`The writeLock.unlock() placed in a finally block is to ensure that the Lock is always released eventhought the error occur, it can release the lock without blocking it, preventing of Deadlock happen. `
