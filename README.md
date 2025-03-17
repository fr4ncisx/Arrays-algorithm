## Explanation

The purpose of this algorithm is to reduce code by using Streams to filter numbers with Predicate, order the numbers with sorted, and then convert the List into int[]

```
int[] result; // {}
int[] seatsArray;// identifier numbers of each seat, we need to delete all duplicated elements
List<Integer> seatList; // Our list of seatsArray
int[] newArray; // this will be filled with seatList numbers result

First: convert int[] into List<Integer>

Second: manipulate List with Stream API

Third: Add List values into the newArray

Fourth and finally: We overwrite result to newArray
```

So with this algorithm we reduce lines of code using foreach in manipulate the seatsArray to clean numbers.

It's simple but worth it for some daily usage





