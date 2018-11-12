##[373.Find K Pairs with Smallest Sums](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description/ "373.Find K Pairs with Smallest Sums")
######Difficulty:Medium
####Similiar Topics:
  [Heap](https://leetcode.com//tag/heap)
####Similiar Problems:
  [Find K-th Smallest Pair Distance](https://leetcode.com//problems/find-k-th-smallest-pair-distance)  [Kth Smallest Element in a Sorted Matrix](https://leetcode.com//problems/kth-smallest-element-in-a-sorted-matrix)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>You are given two integer arrays <b>nums1</b> and <b>nums2</b> sorted in ascending order and an integer <b>k</b>.</p>

<p>Define a pair <b>(u,v)</b> which consists of one element from the first array and one element from the second array.</p>

<p>Find the k pairs <b>(u<sub>1</sub>,v<sub>1</sub>),(u<sub>2</sub>,v<sub>2</sub>) ...(u<sub>k</sub>,v<sub>k</sub>)</b> with the smallest sums.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>nums1 = <span id="example-input-1-1">[1,7,11]</span>, nums2 = <span id="example-input-1-2">[2,4,6]</span>, k = <span id="example-input-1-3">3</span>
<strong>Output: </strong><span id="example-output-1">[[1,2],[1,4],[1,6]] 
<strong>Explanation: </strong></span>The first 3 pairs are returned from the sequence: 
&#160;            [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>nums1 = [1,1,2], nums2 = [1,2,3], k = 2
<strong>Output: </strong>[1,1],[1,1]<span>
<strong>Explanation: </strong></span>The first 2 pairs are returned from the sequence: 
&#160;            [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong>nums1 = [1,2], nums2 = [3], k = 3
<strong>Output: </strong>[1,3],[2,3]<span>
<strong>Explanation: </strong></span>All possible pairs are returned from the sequence: [1,3],[2,3]
</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>