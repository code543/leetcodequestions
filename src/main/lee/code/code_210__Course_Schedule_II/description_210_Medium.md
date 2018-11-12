##[210.Course Schedule II](https://leetcode.com/problems/course-schedule-ii/description/ "210.Course Schedule II")
######Difficulty:Medium
####Similiar Topics:
  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Graph](https://leetcode.com//tag/graph)  [Topological Sort](https://leetcode.com//tag/topological-sort)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:
  [Sequence Reconstruction](https://leetcode.com//problems/sequence-reconstruction)  [Course Schedule](https://leetcode.com//problems/course-schedule)  [Minimum Height Trees](https://leetcode.com//problems/minimum-height-trees)  [Course Schedule III](https://leetcode.com//problems/course-schedule-iii)  [Alien Dictionary](https://leetcode.com//problems/alien-dictionary)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>There are a total of <em>n</em> courses you have to take, labeled from <code>0</code> to <code>n-1</code>.</p>

<p>Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: <code>[0,1]</code></p>

<p>Given the total number of courses and a list of prerequisite <strong>pairs</strong>, return the ordering of courses you should take to finish all courses.</p>

<p>There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> 2, [[1,0]] 
<strong>Output: </strong><code>[0,1]</code>
<strong>Explanation:</strong>&#160;There are a total of 2 courses to take. To take course 1 you should have finished   
&#160;            course 0. So the correct course order is <code>[0,1] .</code></pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> 4, [[1,0],[2,0],[3,1],[3,2]]
<strong>Output: </strong><code>[0,1,2,3] or [0,2,1,3]</code>
<strong>Explanation:</strong>&#160;There are a total of 4 courses to take. To take course 3 you should have finished both     
             courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0. 
&#160;            So one correct course order is <code>[0,1,2,3]</code>. Another correct ordering is <code>[0,2,1,3] .</code></pre>

<p><strong>Note:</strong></p>

<ol>
	<li>The input prerequisites is a graph represented by <strong>a list of edges</strong>, not adjacency matrices. Read more about <a href="https://www.khanacademy.org/computing/computer-science/algorithms/graph-representation/a/representing-graphs" target="_blank">how a graph is represented</a>.</li>
	<li>You may assume that there are no duplicate edges in the input prerequisites.</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>