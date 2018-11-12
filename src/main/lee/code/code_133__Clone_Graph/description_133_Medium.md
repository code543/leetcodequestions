##[133.Clone Graph](https://leetcode.com/problems/clone-graph/description/ "133.Clone Graph")
######Difficulty:Medium
####Similiar Topics:
  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Graph](https://leetcode.com//tag/graph)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:
  [Copy List with Random Pointer](https://leetcode.com//problems/copy-list-with-random-pointer)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given the head of a&#160;graph, return a deep copy (clone) of the graph. Each node in the graph contains a <code>label</code>&#160;(<code>int</code>) and a list (<code>List[UndirectedGraphNode]</code>) of its <code>neighbors</code>. There is an edge between the given node and each of the nodes in its neighbors.</p>

<div><br/>
<b>OJ's undirected graph serialization (so you can understand error output):</b>

<p>Nodes are labeled uniquely.</p>
We use <code>#</code> as a separator for each node, and <code>,</code> as a separator for node label and each neighbor of the node.

<p>&#160;</p>

<p>As an example, consider the serialized graph <code><font color="red">{<font color="black">0</font>,1,2#</font><font color="blue"><font color="black">1</font>,2#</font><font color="green"><font color="black">2</font>,2}</font></code>.</p>

<p>The graph has a total of three nodes, and therefore contains three parts as separated by <code>#</code>.</p>

<ol>
	<li>First node is labeled as <code><font color="black">0</font></code>. Connect node <code><font color="black">0</font></code> to both nodes <code><font color="red">1</font></code> and <code><font color="red">2</font></code>.</li>
	<li>Second node is labeled as <code><font color="black">1</font></code>. Connect node <code><font color="black">1</font></code> to node <code><font color="blue">2</font></code>.</li>
	<li>Third node is labeled as <code><font color="black">2</font></code>. Connect node <code><font color="black">2</font></code> to node <code><font color="green">2</font></code> (itself), thus forming a self-cycle.</li>
</ol>

<p>&#160;</p>

<p>Visually, the graph looks like the following:</p>

<pre>       1
      / \
     /   \
    0 --- 2
         / \
         \_/
</pre>

<p><strong>Note</strong>: The information about the tree serialization is only meant so that you can understand error output if you get a wrong answer. You don't need to understand the serialization to solve the problem.</p>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>