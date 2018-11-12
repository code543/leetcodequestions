##[825.Friends Of Appropriate Ages](https://leetcode.com/problems/friends-of-appropriate-ages/description/ "825.Friends Of Appropriate Ages")
######Difficulty:Medium
####Similiar Topics:
  [Array](https://leetcode.com//tag/array)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Some people will make friend requests. The&#160;list of their ages is given and&#160;<code>ages[i]</code>&#160;is the age of the&#160;ith person.&#160;</p>

<p>Person A will NOT friend request person B (B != A) if any of the following conditions are true:</p>

<ul>
	<li><code>age[B]&#160;&lt;= 0.5 * age[A]&#160;+ 7</code></li>
	<li><code>age[B]&#160;&gt; age[A]</code></li>
	<li><code>age[B]&#160;&gt; 100 &amp;&amp;&#160;age[A]&#160;&lt; 100</code></li>
</ul>

<p>Otherwise, A will friend request B.</p>

<p>Note that if&#160;A requests B, B does not necessarily request A.&#160; Also, people will not friend request themselves.</p>

<p>How many total friend requests are made?</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>[16,16]
<strong>Output: </strong>2
<strong>Explanation: </strong>2 people friend request each other.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>[16,17,18]
<strong>Output: </strong>2
<strong>Explanation: </strong>Friend requests are made 17 -&gt; 16, 18 -&gt; 17.</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong>[20,30,100,110,120]
<strong>Output: </strong>
<strong>Explanation: </strong>Friend requests are made 110 -&gt; 100, 120 -&gt; 110, 120 -&gt; 100.
</pre>

<p>&#160;</p>

<p>Notes:</p>

<ul>
	<li><code>1 &lt;= ages.length&#160;&lt;= 20000</code>.</li>
	<li><code>1 &lt;= ages[i] &lt;= 120</code>.</li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>