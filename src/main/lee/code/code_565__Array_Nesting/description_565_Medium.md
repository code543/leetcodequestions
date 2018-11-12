##[565.Array Nesting](https://leetcode.com/problems/array-nesting/description/ "565.Array Nesting")
######Difficulty:Medium
####Similiar Topics:
  [Array](https://leetcode.com//tag/array)
####Similiar Problems:
  [Flatten Nested List Iterator](https://leetcode.com//problems/flatten-nested-list-iterator)  [Nested List Weight Sum II](https://leetcode.com//problems/nested-list-weight-sum-ii)  [Nested List Weight Sum](https://leetcode.com//problems/nested-list-weight-sum)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>A zero-indexed array A of length N contains all integers from 0 to N-1. Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.</p>

<p>Suppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]&#8230; By that analogy, we stop adding right before a duplicate element occurs in S.</p>

<p><b>Example 1:</b><br/>
</p><pre><b>Input:</b> A = [5,4,0,3,1,6,2]
<b>Output:</b> 4
<b>Explanation:</b> 
A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

One of the longest S[K]:
S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
</pre>
<p/>

<p><b>Note:</b><br/>
</p><ol>
<li>N is an integer within the range [1, 20,000].</li>
<li>The elements of A are all distinct.</li>
<li>Each element of A is an integer within the range [0, N-1].</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>