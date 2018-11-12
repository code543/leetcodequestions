##[822.Card Flipping Game](https://leetcode.com/problems/card-flipping-game/description/ "822.Card Flipping Game")
######Difficulty:Medium
####Similiar Topics:

####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>On a table are <code>N</code> cards, with a positive integer printed on the front and back of each card (possibly different).</p>

<p>We flip any number of cards, and after we choose one&#160;card.&#160;</p>

<p>If the number <code>X</code> on the back of the chosen&#160;card is not on the front of any card, then this number X is good.</p>

<p>What is the smallest number that is good?&#160; If no number is good, output <code>0</code>.</p>

<p>Here, <code>fronts[i]</code> and <code>backs[i]</code> represent the number on the front and back of card <code>i</code>.&#160;</p>

<p>A&#160;flip swaps the front and back numbers, so the value on the front is now on the back and vice versa.</p>

<p><strong>Example:</strong></p>

<pre><strong>Input:</strong> fronts = [1,2,4,4,7], backs = [1,3,4,1,3]
<strong>Output:</strong> <code>2</code>
<strong>Explanation:</strong> If we flip the second card, the fronts are <code>[1,3,4,4,7]</code> and the backs are <code>[1,2,4,1,3]</code>.
We choose the second card, which has number 2 on the back, and it isn't on the front of any card, so <code>2</code> is good.</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= fronts.length == backs.length&#160;&lt;=&#160;1000.</code></li>
	<li><code>1 &lt;=&#160;fronts[i]&#160;&lt;= 2000</code>.</li>
	<li><code>1 &lt;= backs[i]&#160;&lt;= 2000</code>.</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>