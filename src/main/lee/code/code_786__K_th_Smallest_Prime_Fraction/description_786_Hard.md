##[786.K-th Smallest Prime Fraction](https://leetcode.com/problems/k-th-smallest-prime-fraction/description/ "786.K-th Smallest Prime Fraction")
######Difficulty:Hard
####Similiar Topics:
  [Heap](https://leetcode.com//tag/heap)  [Binary Search](https://leetcode.com//tag/binary-search)
####Similiar Problems:
  [Find K-th Smallest Pair Distance](https://leetcode.com//problems/find-k-th-smallest-pair-distance)  [Kth Smallest Number in Multiplication Table](https://leetcode.com//problems/kth-smallest-number-in-multiplication-table)  [Kth Smallest Element in a Sorted Matrix](https://leetcode.com//problems/kth-smallest-element-in-a-sorted-matrix)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>A sorted list <code>A</code> contains 1, plus some number of primes.&#160; Then, for every p &lt; q in the list, we consider the fraction p/q.</p>

<p>What is the <code>K</code>-th smallest fraction considered?&#160; Return your answer as an array of ints, where <code>answer[0] = p</code> and <code>answer[1] = q</code>.</p>

<pre><strong>Examples:</strong>
<strong>Input:</strong> A = [1, 2, 3, 5], K = 3
<strong>Output:</strong> [2, 5]
<strong>Explanation:</strong>
The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, 2/3.
The third fraction is 2/5.

<strong>Input:</strong> A = [1, 7], K = 1
<strong>Output:</strong> [1, 7]
</pre>

<p><strong>Note:</strong></p>

<ul>
	<li><code>A</code> will have length between <code>2</code> and <code>2000</code>.</li>
	<li>Each <code>A[i]</code> will be between <code>1</code> and <code>30000</code>.</li>
	<li><code>K</code> will be between <code>1</code> and <code>A.length * (A.length - 1) / 2</code>.</li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>