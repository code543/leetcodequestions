##[546.Remove Boxes](https://leetcode.com/problems/remove-boxes/description/ "546.Remove Boxes")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:
  [Strange Printer](https://leetcode.com//problems/strange-printer)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given several boxes with different colors represented by different positive numbers. <br/>
You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (composed of k boxes, k &gt;= 1), remove them and get <code>k*k</code> points.<br/>
Find the maximum points you can get.
</p>

<p><b>Example 1:</b><br/>
Input: 
</p><pre>[1, 3, 2, 2, 2, 3, 4, 3, 1]
</pre>
Output:
<pre>23
</pre>
Explanation: 
<pre>[1, 3, 2, 2, 2, 3, 4, 3, 1] 
----&gt; [1, 3, 3, 4, 3, 1] (3*3=9 points) 
----&gt; [1, 3, 3, 3, 1] (1*1=1 points) 
----&gt; [1, 1] (3*3=9 points) 
----&gt; [] (2*2=4 points)
</pre>
<p/>

<p><b>Note:</b>
The number of boxes <code>n</code> would not exceed 100.
</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>