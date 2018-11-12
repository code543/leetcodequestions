##[848.Shifting Letters](https://leetcode.com/problems/shifting-letters/description/ "848.Shifting Letters")
######Difficulty:Medium
####Similiar Topics:
  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>We have a string <code>S</code> of lowercase letters, and an integer array <code>shifts</code>.</p>

<p>Call the <em>shift</em> of a letter, the next letter in the alphabet, (wrapping around so that <code>'z'</code> becomes <code>'a'</code>).&#160;</p>

<p>For example, <code>shift('a') = 'b'</code>, <code>shift('t') = 'u'</code>, and <code>shift('z') = 'a'</code>.</p>

<p>Now for each <code>shifts[i] = x</code>, we want to shift the first <code>i+1</code>&#160;letters of <code>S</code>, <code>x</code> times.</p>

<p>Return the final string&#160;after all such shifts to <code>S</code> are applied.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>S = "abc", shifts = [3,5,9]
<strong>Output: </strong>"rpl"
<strong>Explanation: </strong>
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.
</pre>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= S.length = shifts.length &lt;= 20000</code></li>
	<li><code>0 &lt;= shifts[i] &lt;= 10 ^ 9</code></li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>