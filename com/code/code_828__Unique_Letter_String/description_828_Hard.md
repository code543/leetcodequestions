##[828.Unique Letter String](https://leetcode.com/problems/unique-letter-string/description/ "828.Unique Letter String")
######Difficulty:Hard
####Similiar Topics:
  [Two Pointers](https://leetcode.com//tag/two-pointers)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>A character is unique in string <code>S</code> if it occurs exactly once in it.</p>

<p>For example, in string <code>S = "LETTER"</code>, the only unique characters are <code>"L"</code> and <code>"R"</code>.</p>

<p>Let's define <code>UNIQ(S)</code> as the number of unique characters in string <code>S</code>.</p>

<p>For example, <code>UNIQ("LETTER") =&#160; 2</code>.</p>

<p>Given a string <code>S</code> with only uppercases, calculate the sum of <code>UNIQ(substring)</code> over all non-empty substrings of <code>S</code>.</p>

<p>If there are two or more equal substrings at different positions in <code>S</code>, we consider them different.</p>

<p>Since the answer can be very large, return&#160;the answer&#160;modulo&#160;<code>10 ^ 9 + 7</code>.</p>

<p>&#160;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>"ABC"
<strong>Output: </strong>10
<strong>Explanation: </strong>All possible substrings are: "A","B","C","AB","BC" and "ABC".
Evey substring is composed with only unique letters.
Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>"ABA"
<strong>Output: </strong>8
<strong>Explanation: </strong>The same as example 1, except uni("ABA") = 1.
</pre>

<p>&#160;</p>

<p><strong>Note:</strong> <code>0 &lt;= S.length &lt;= 10000</code>.</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>