##[818.Race Car](https://leetcode.com/problems/race-car/description/ "818.Race Car")
######Difficulty:Hard
####Similiar Topics:
  [Heap](https://leetcode.com//tag/heap)  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Your car starts at position 0 and speed +1 on an infinite number line.&#160; (Your car can go into negative positions.)</p>

<p>Your car drives automatically according to a sequence of instructions A (accelerate) and R (reverse).</p>

<p>When you get an instruction "A", your car does the following:&#160;<code>position += speed, speed *= 2</code>.</p>

<p>When you get an instruction "R", your car does the following: if your speed is positive then&#160;<code>speed = -1</code>&#160;, otherwise&#160;<code>speed = 1</code>.&#160; (Your position stays the same.)</p>

<p>For example, after commands "AAR", your car goes to positions 0-&gt;1-&gt;3-&gt;3, and your speed goes to 1-&gt;2-&gt;4-&gt;-1.</p>

<p>Now for some target position, say the <strong>length</strong> of the shortest sequence of instructions to get there.</p>

<pre><strong>Example 1:</strong>
<strong>Input:</strong> 
target = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
The shortest instruction sequence is "AA".
Your position goes from 0-&gt;1-&gt;3.
</pre>

<pre><strong>Example 2:</strong>
<strong>Input:</strong> 
target = 6
<strong>Output:</strong> 5
<strong>Explanation:</strong> 
The shortest instruction sequence is "AAARA".
Your position goes from 0-&gt;1-&gt;3-&gt;7-&gt;7-&gt;6.
</pre>

<p>&#160;</p>

<p><strong>Note: </strong></p>

<ul>
	<li><code>1 &lt;= target &lt;= 10000</code>.</li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>