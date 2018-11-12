##[913.Cat and Mouse](https://leetcode.com/problems/cat-and-mouse/description/ "913.Cat and Mouse")
######Difficulty:Hard
####Similiar Topics:
  [Minimax](https://leetcode.com//tag/minimax)  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>A game on an <strong>undirected</strong> graph is played by two players, Mouse and Cat, who alternate turns.</p>

<p>The graph is given as follows: <code>graph[a]</code> is a list of all nodes <code>b</code> such that <code>ab</code> is an edge of the graph.</p>

<p>Mouse starts at node 1 and goes first, Cat starts at node 2 and goes second, and there is a Hole at node 0.</p>

<p>During each player's turn, they <strong>must</strong> travel along one&#160;edge of the graph that meets where they are.&#160; For example, if the Mouse is at node <code>1</code>, it <strong>must</strong> travel to any node in <code>graph[1]</code>.</p>

<p>Additionally, it is not allowed for the Cat to travel to the Hole (node 0.)</p>

<p>Then, the game can end in 3 ways:</p>

<ul>
	<li>If ever the Cat occupies the same node as the Mouse, the Cat wins.</li>
	<li>If ever the Mouse reaches the Hole, the Mouse wins.</li>
	<li>If ever a position is repeated (ie.&#160;the players are in the same position as a previous turn, and&#160;it is the same player's turn to move), the game is a draw.</li>
</ul>

<p>Given a <code>graph</code>, and assuming both players play optimally, return <code>1</code>&#160;if the game is won by Mouse, <code>2</code>&#160;if the game is won by Cat, and <code>0</code>&#160;if the game is a draw.</p>

<p>&#160;</p>

<ol>
</ol>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong><span id="example-input-1-1">[[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]</span>
<strong>Output: </strong><span id="example-output-1">0
<strong>Explanation:</strong>
</span>4---3---1
|&#160; &#160;|
2---5
&#160;\&#160;/
&#160; 0
</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ol>
	<li><code>3 &lt;= graph.length &lt;= 50</code></li>
	<li>It is guaranteed that <code>graph[1]</code> is non-empty.</li>
	<li>It is guaranteed that <code>graph[2]</code> contains a non-zero element.&#160;</li>
</ol>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>