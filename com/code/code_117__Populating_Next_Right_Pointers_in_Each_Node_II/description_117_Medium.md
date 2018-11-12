##[117.Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/ "117.Populating Next Right Pointers in Each Node II")
######Difficulty:Medium
####Similiar Topics:
  [Tree](https://leetcode.com//tag/tree)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:
  [Populating Next Right Pointers in Each Node](https://leetcode.com//problems/populating-next-right-pointers-in-each-node)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a binary tree</p>

<pre>struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
</pre>

<p>Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to <code>NULL</code>.</p>

<p>Initially, all next pointers are set to <code>NULL</code>.</p>

<p><strong>Note:</strong></p>

<ul>
	<li>You may only use constant extra space.</li>
	<li>Recursive approach is fine, implicit stack space does not count as extra space for this problem.</li>
</ul>

<p><strong>Example:</strong></p>

<p>Given the following binary tree,</p>

<pre>     1
   /  \
  2    3
 / \    \
4   5    7
</pre>

<p>After calling your function, the tree should look like:</p>

<pre>     1 -&gt; NULL
   /  \
  2 -&gt; 3 -&gt; NULL
 / \    \
4-&gt; 5 -&gt; 7 -&gt; NULL
</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>