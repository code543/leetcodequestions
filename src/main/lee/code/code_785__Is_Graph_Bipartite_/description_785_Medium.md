##[785.Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/description/ "785.Is Graph Bipartite?")
######Difficulty:Medium
####Similiar Topics:
  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Graph](https://leetcode.com//tag/graph)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given an undirected&#160;<code>graph</code>, return <code>true</code> if and only if it is bipartite.</p>

<p>Recall that a graph is <em>bipartite</em> if we can split it's set of nodes into two independent&#160;subsets A and B such that every edge in the graph has one node in A and another node in B.</p>

<p>The graph is given in the following form: <code>graph[i]</code> is a list of indexes <code>j</code> for which the edge between nodes <code>i</code> and <code>j</code> exists.&#160; Each node is an integer between <code>0</code> and <code>graph.length - 1</code>.&#160; There are no self edges or parallel edges: <code>graph[i]</code> does not contain <code>i</code>, and it doesn't contain any element twice.</p>

<pre><strong>Example 1:</strong>
<strong>Input:</strong> [[1,3], [0,2], [1,3], [0,2]]
<strong>Output:</strong> true
<strong>Explanation:</strong> 
The graph looks like this:
0----1
|    |
|    |
3----2
We can divide the vertices into two groups: {0, 2} and {1, 3}.
</pre>

<pre><strong>Example 2:</strong>
<strong>Input:</strong> [[1,2,3], [0,2], [0,1,3], [0,2]]
<strong>Output:</strong> false
<strong>Explanation:</strong> 
The graph looks like this:
0----1
| \  |
|  \ |
3----2
We cannot find a way to divide the set of nodes into two independent subsets.
</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ul>
	<li><code>graph</code> will have length in range <code>[1, 100]</code>.</li>
	<li><code>graph[i]</code> will contain integers in range <code>[0, graph.length - 1]</code>.</li>
	<li><code>graph[i]</code> will not contain <code>i</code> or duplicate values.</li>
	<li>The graph is undirected: if any element <code>j</code> is in <code>graph[i]</code>, then <code>i</code> will be in <code>graph[j]</code>.</li>
</ul>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>