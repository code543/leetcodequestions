##[851.Loud and Rich](https://leetcode.com/problems/loud-and-rich/description/ "851.Loud and Rich")
######Difficulty:Medium
####Similiar Topics:
  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>In a group of N people (labelled <code>0, 1, 2, ..., N-1</code>), each person has different amounts of money, and different levels of quietness.</p>

<p>For convenience, we'll call the person with label <code>x</code>, simply "person <code>x</code>".</p>

<p>We'll say that <code>richer[i] = [x, y]</code> if person <code>x</code>&#160;definitely has more money than person&#160;<code>y</code>.&#160; Note that <code>richer</code>&#160;may only be a subset of valid observations.</p>

<p>Also, we'll say <code>quiet[x] = q</code> if person <font face="monospace">x</font>&#160;has quietness <code>q</code>.</p>

<p>Now, return <code>answer</code>, where <code>answer[x] = y</code> if <code>y</code> is the least quiet person (that is, the person <code>y</code> with the smallest value of <code>quiet[y]</code>), among all people&#160;who definitely have&#160;equal to or more money than person <code>x</code>.</p>

<p>&#160;</p>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>richer = <span id="example-input-1-1">[[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]]</span>, quiet = <span id="example-input-1-2">[3,2,5,4,6,1,7,0]</span>
<strong>Output: </strong><span id="example-output-1">[5,5,2,5,4,5,6,7]</span>
<strong>Explanation: </strong>
answer[0] = 5.
Person 5 has more money than 3, which has more money than 1, which has more money than 0.
The only person who is quieter (has lower quiet[x]) is person 7, but
it isn't clear if they have more money than person 0.

answer[7] = 7.
Among all people that definitely have equal to or more money than person 7
(which could be persons 3, 4, 5, 6, or 7), the person who is the quietest (has lower quiet[x])
is person 7.

The other answers can be filled out with similar reasoning.
</pre>
</div>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= quiet.length = N &lt;= 500</code></li>
	<li><code>0 &lt;= quiet[i] &lt; N</code>, all <code>quiet[i]</code> are different.</li>
	<li><code>0 &lt;= richer.length &lt;= N * (N-1) / 2</code></li>
	<li><code>0 &lt;= richer[i][j] &lt; N</code></li>
	<li><code>richer[i][0] != richer[i][1]</code></li>
	<li><code>richer[i]</code>'s are all different.</li>
	<li>The&#160;observations in <code>richer</code> are all logically consistent.</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>