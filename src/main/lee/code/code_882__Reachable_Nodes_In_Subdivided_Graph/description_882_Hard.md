##[882.Reachable Nodes In Subdivided Graph](https://leetcode.com/problems/reachable-nodes-in-subdivided-graph/description/ "882.Reachable Nodes In Subdivided Graph")
######Difficulty:Hard
####Similiar Topics:
  [Heap](https://leetcode.com//tag/heap)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Starting with an&#160;<strong>undirected</strong> graph (the "original graph") with nodes from <code>0</code> to <code>N-1</code>, subdivisions are made to some of the edges.</p>

<p>The graph is given as follows: <code>edges[k]</code> is a list of integer pairs <code>(i, j, n)</code> such that <code>(i, j)</code> is an edge of the original graph,</p>

<p>and <code>n</code> is the total number of <strong>new</strong> nodes on that edge.&#160;</p>

<p>Then, the edge <code>(i, j)</code> is deleted from the original graph,&#160;<code>n</code>&#160;new nodes <code>(x_1, x_2, ..., x_n)</code> are added to the original graph,</p>

<p>and <code>n+1</code> new&#160;edges <code>(i, x_1), (x_1, x_2), (x_2, x_3), ..., (x_{n-1}, x_n), (x_n, j)</code>&#160;are added to the original&#160;graph.</p>

<p>Now, you start at node <code>0</code>&#160;from the original graph, and in each move, you travel along one&#160;edge.&#160;</p>

<p>Return how many nodes you can reach in at most <code>M</code> moves.</p>

<p>&#160;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong><code>edges </code>= <span id="example-input-1-1">[[0,1,10],[0,2,1],[1,2,2]]</span>, M = <span id="example-input-1-2">6</span>, N = <span id="example-input-1-3">3</span>
<strong>Output: </strong><span id="example-output-1">13</span>
<strong>Explanation: </strong>
The nodes that are reachable in the final graph after M = 6 moves are indicated below.
<span><img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/01/origfinal.png" style="width: 487px; height: 200px;"/></span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong><code>edges </code>= <span id="example-input-2-1">[[0,1,4],[1,2,6],[0,2,8],[1,3,1]]</span>, M = <span id="example-input-2-2">10</span>, N = <span id="example-input-2-3">4</span>
<strong>Output: </strong><span id="example-output-2">23</span></pre>

<p>&#160;</p>
</div>

<p><strong>Note:</strong></p>

<ol>
	<li><code>0 &lt;= edges.length &lt;= 10000</code></li>
	<li><code>0 &lt;= edges[i][0] &lt;&#160;edges[i][1] &lt; N</code></li>
	<li>There does not exist any&#160;<code>i != j</code> for which <code>edges[i][0] == edges[j][0]</code> and <code>edges[i][1] == edges[j][1]</code>.</li>
	<li>The original graph&#160;has no parallel edges.</li>
	<li><code>0 &lt;= edges[i][2] &lt;= 10000</code></li>
	<li><code>0 &lt;= M &lt;= 10^9</code></li>
	<li><code><font face="monospace">1 &lt;= N &lt;= 3000</font></code></li>
	<li>A reachable node is a node that can be travelled to&#160;using at most&#160;M moves starting from&#160;node 0.</li>
</ol>

<div>
<div>&#160;</div>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>