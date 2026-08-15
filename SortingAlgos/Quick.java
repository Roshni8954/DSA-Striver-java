package SortingAlgos;

/* Choice of Pivot
There are many different choices for picking pivots.

Always pick the first (or last) element as a pivot. The below implementation picks the last element as pivot. The problem with this approach is
it ends up in the worst case when array is already sorted. Pick a random element as a pivot. This is a preferred approach because it does not 
have a pattern for which the worst case happens. Pick the median element is pivot. This is an ideal approach in terms of time complexity as we
can find median in linear time and the partition function will always divide the input array into two halves. But it takes more time on average 
as median finding has high constants. 
*/

public class Quick {
    
}
