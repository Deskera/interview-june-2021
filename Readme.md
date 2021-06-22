Write the implementaion for the method which takes a positive (or zero) integer value and converts it into a binary equivalent without using any Math library.
However, if the input argument is negative, it should throw some exception as so far it doesn't still supports 
to convert the negative number into binary. 


Sample Input:  if a given number is <b>35</b>, the method should return <b>100011</b> 


write your code under <b> src/main/java/exam/ConvertToBinary#toBinary() - (3) Marks.</b> method

----------------

Write the implementation of a method which takes an integer array and it shifts all the elements to one right 
however the last element would be placed at the first position as it cannot go further right in the same array and hence goes to first place.
No new array needs to be created, the operation should be performed in the same array.

e.g. if the array input is <b>1,2,3,4,5</b>
then the implementation of shift method should shift the element and also the last element (5) should come to the first place 
and hence the final output should be <b>5,1,2,3,4</b> 

write your code under <b> src/main/java/exam/ShiftElementsInArray#shift() - (3) Marks.</b> method

----------------


For a given total (T), and a weight (w) find the number of combinations where total T can be achieved by summing up
all the weights range from 1 to w.

<b> e.g. if T=5 and w=3 then, </b>

 - total 5 can be achieved by summing up all 1s and that is one way e.g. 1,1,1,1,1.
 - and then going with the higher weights till w=3 and below is the result where it can be achieved in 5 ways.
 
 The program should output value 5 as shown below.

`1,1,1,1,1`

`1,1,1,2`

`1,2,2`

`1,1,3`

`2,3`

write your code under <b> src/main/java/exam/CountCombinations#getNumberOfWays() - (4) Marks.</b> method



-----

<b><i>For any of the above questions, donot change the signature of the provided methods, 
just write your code inside the give methods as mentioned in each question!</i></b>