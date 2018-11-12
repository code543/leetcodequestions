##[863.All Nodes Distance K in Binary Tree](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/description/ "863.All Nodes Distance K in Binary Tree")
######Difficulty:Medium
####Similiar Topics:
  [Tree](https://leetcode.com//tag/tree)  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>We are given a binary tree (with root node&#160;<code>root</code>), a <code>target</code> node, and an integer value <code>K</code>.</p>

<p>Return a list of the values of all&#160;nodes that have a distance <code>K</code> from the <code>target</code> node.&#160; The answer can be returned in any order.</p>

<p>&#160;</p>

<ol>
</ol>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>root = <span id="example-input-1-1">[3,5,1,6,2,0,8,null,null,7,4]</span>, target = <span id="example-input-1-2">5</span>, K = <span id="example-input-1-3">2</span>

<strong>Output: </strong><span id="example-output-1">[7,4,1]</span>

<strong>Explanation: </strong>
The nodes that are a distance 2 from the target node (with value 5)
have values 7, 4, and 1.

<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/28/sketch0.png" style="width: 280px; height: 240px;"/>

Note that the inputs "root" and "target" are actually TreeNodes.
The descriptions of the inputs above are just serializations of these objects.
</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ol>
	<li>The given tree is non-empty.</li>
	<li>Each node in the tree has unique values&#160;<code>0 &lt;= node.val &lt;= 500</code>.</li>
	<li>The <code>target</code>&#160;node is a node in the tree.</li>
	<li><code>0 &lt;= K &lt;= 1000</code>.</li>
</ol>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>