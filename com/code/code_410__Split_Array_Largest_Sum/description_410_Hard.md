##[410.Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/description/ "410.Split Array Largest Sum")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Binary Search](https://leetcode.com//tag/binary-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given an array which consists of non-negative integers and an integer <i>m</i>, you can split the array into <i>m</i> non-empty continuous subarrays. Write an algorithm to minimize the largest sum among these <i>m</i> subarrays.
</p>

<p><b>Note:</b><br/>
If <i>n</i> is the length of array, assume the following constraints are satisfied:
</p><ul>
<li>1 &#8804; <i>n</i> &#8804; 1000</li>
<li>1 &#8804; <i>m</i> &#8804; min(50, <i>n</i>)</li>
</ul>
<p/>

<p><b>Examples: </b>
</p><pre>Input:
<b>nums</b> = [7,2,5,10,8]
<b>m</b> = 2

Output:
18

Explanation:
There are four ways to split <b>nums</b> into two subarrays.
The best way is to split it into <b>[7,2,5]</b> and <b>[10,8]</b>,
where the largest sum among the two subarrays is only 18.
</pre>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>