##[236.Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/ "236.Lowest Common Ancestor of a Binary Tree")
######Difficulty:Medium
####Similiar Topics:
  [Tree](https://leetcode.com//tag/tree)
####Similiar Problems:
  [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com//problems/lowest-common-ancestor-of-a-binary-search-tree)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.</p>

<p>According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of LCA on Wikipedia</a>: &#8220;The lowest common ancestor is defined between two nodes p&#160;and q&#160;as the lowest node in T that has both p&#160;and q&#160;as descendants (where we allow <b>a node to be a descendant of itself</b>).&#8221;</p>

<p>Given the following binary tree:&#160; root =&#160;[3,5,1,6,2,0,8,null,null,7,4]</p>

<pre>        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
</pre>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
<strong>Output:</strong> 3
<strong>Explanation: </strong>The LCA of of nodes <code>5</code> and <code>1</code> is <code>3.</code>
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
<strong>Output:</strong> 5
<strong>Explanation: </strong>The LCA of nodes <code>5</code> and <code>4</code> is <code>5</code>, since a node can be a descendant of itself
             according to the LCA definition.</pre>

<p><strong>Note:</strong></p>

<ul>
	<li>All of the nodes' values will be unique.</li>
	<li>p and q are different and both values will&#160;exist in the binary tree.</li>
</ul>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>