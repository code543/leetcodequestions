##[847.Shortest Path Visiting All Nodes](https://leetcode.com/problems/shortest-path-visiting-all-nodes/description/ "847.Shortest Path Visiting All Nodes")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>An undirected, connected graph of N nodes (labeled&#160;<code>0, 1, 2, ..., N-1</code>) is given as <code>graph</code>.</p>

<p><code>graph.length = N</code>, and <code>j != i</code>&#160;is in the list&#160;<code>graph[i]</code>&#160;exactly once, if and only if nodes <code>i</code> and <code>j</code> are connected.</p>

<p>Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.</p>

<p>&#160;</p>

<ol>
</ol>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>[[1,2,3],[0],[0],[0]]
<strong>Output: </strong>4
<strong>Explanation</strong>: One possible path is [1,0,2,0,3]</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>[[1],[0,2,4],[1,3,4],[2],[1,2]]
<strong>Output: </strong>4
<strong>Explanation</strong>: One possible path is [0,1,4,2,3]
</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= graph.length &lt;= 12</code></li>
	<li><code>0 &lt;= graph[i].length &lt;&#160;graph.length</code></li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>