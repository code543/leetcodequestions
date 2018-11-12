##[834.Sum of Distances in Tree](https://leetcode.com/problems/sum-of-distances-in-tree/description/ "834.Sum of Distances in Tree")
######Difficulty:Hard
####Similiar Topics:
  [Tree](https://leetcode.com//tag/tree)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>An undirected, connected&#160;tree with <code>N</code> nodes labelled <code>0...N-1</code> and <code>N-1</code> <code>edges</code>&#160;are&#160;given.</p>

<p>The <code>i</code>th edge connects nodes&#160;<code>edges[i][0] </code>and<code>&#160;edges[i][1]</code>&#160;together.</p>

<p>Return a list <code>ans</code>, where <code>ans[i]</code> is the sum of the distances between node <code>i</code> and all other nodes.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
<strong>Output: </strong>[8,12,6,10,10,10]
<strong>Explanation: </strong>
Here is a diagram of the given tree:
  0
 / \
1   2
   /|\
  3 4 5
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.  Hence, answer[0] = 8, and so on.
</pre>

<p>Note:<font face="monospace">&#160;<code>1 &lt;= N &lt;= 10000</code></font></p></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>