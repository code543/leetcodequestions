##[685.Redundant Connection II](https://leetcode.com/problems/redundant-connection-ii/description/ "685.Redundant Connection II")
######Difficulty:Hard
####Similiar Topics:
  [Tree](https://leetcode.com//tag/tree)  [Union Find](https://leetcode.com//tag/union-find)  [Graph](https://leetcode.com//tag/graph)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:
  [Redundant Connection](https://leetcode.com//problems/redundant-connection)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>
In this problem, a rooted tree is a <b>directed</b> graph such that, there is exactly one node (the root) for which all other nodes are descendants of this node, plus every node has exactly one parent, except for the root node which has no parents.
</p><p>
The given input is a directed graph that started as a rooted tree with N nodes (with distinct values 1, 2, ..., N), with one additional directed edge added.  The added edge has two different vertices chosen from 1 to N, and was not an edge that already existed.
</p><p>
The resulting graph is given as a 2D-array of <code>edges</code>.  Each element of <code>edges</code> is a pair <code>[u, v]</code> that represents a <b>directed</b> edge connecting nodes <code>u</code> and <code>v</code>, where <code>u</code> is a parent of child <code>v</code>.
</p><p>
Return an edge that can be removed so that the resulting graph is a rooted tree of N nodes.  If there are multiple answers, return the answer that occurs last in the given 2D-array.
</p><p><b>Example 1:</b><br/>
</p><pre><b>Input:</b> [[1,2], [1,3], [2,3]]
<b>Output:</b> [2,3]
<b>Explanation:</b> The given directed graph will be like this:
  1
 / \
v   v
2--&gt;3
</pre>
<p/>
<p><b>Example 2:</b><br/>
</p><pre><b>Input:</b> [[1,2], [2,3], [3,4], [4,1], [1,5]]
<b>Output:</b> [4,1]
<b>Explanation:</b> The given directed graph will be like this:
5 &lt;- 1 -&gt; 2
     ^    |
     |    v
     4 &lt;- 3
</pre>
<p/>
<p><b>Note:</b><br/>
</p><li>The size of the input 2D-array will be between 3 and 1000.</li>
<li>Every integer represented in the 2D-array will be between 1 and N, where N is the size of the input array.</li>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>