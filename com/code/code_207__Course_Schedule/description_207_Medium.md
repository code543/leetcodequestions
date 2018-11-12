##[207.Course Schedule](https://leetcode.com/problems/course-schedule/description/ "207.Course Schedule")
######Difficulty:Medium
####Similiar Topics:
  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Graph](https://leetcode.com//tag/graph)  [Topological Sort](https://leetcode.com//tag/topological-sort)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:
  [Course Schedule III](https://leetcode.com//problems/course-schedule-iii)  [Minimum Height Trees](https://leetcode.com//problems/minimum-height-trees)  [Course Schedule II](https://leetcode.com//problems/course-schedule-ii)  [Graph Valid Tree](https://leetcode.com//problems/graph-valid-tree)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>There are a total of <i>n</i> courses you have to take, labeled from <code>0</code> to <code>n-1</code>.</p>

<p>Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: <code>[0,1]</code></p>

<p>Given the total number of courses and a list of prerequisite <b>pairs</b>, is it possible for you to finish all courses?</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> 2, [[1,0]] 
<strong>Output: </strong>true
<strong>Explanation:</strong>&#160;There are a total of 2 courses to take. 
&#160;            To take course 1 you should have finished course 0. So it is possible.</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> 2, [[1,0],[0,1]]
<strong>Output: </strong>false
<strong>Explanation:</strong>&#160;There are a total of 2 courses to take. 
&#160;            To take course 1 you should have finished course 0, and to take course 0 you should
&#160;            also have finished course 1. So it is impossible.
</pre>

<p><b>Note:</b></p>

<ol>
	<li>The input prerequisites is a graph represented by <b>a list of edges</b>, not adjacency matrices. Read more about <a href="https://www.khanacademy.org/computing/computer-science/algorithms/graph-representation/a/representing-graphs" target="_blank">how a graph is represented</a>.</li>
	<li>You may assume that there are no duplicate edges in the input prerequisites.</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>