##[809.Expressive Words](https://leetcode.com/problems/expressive-words/description/ "809.Expressive Words")
######Difficulty:Medium
####Similiar Topics:
  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Sometimes people repeat letters to represent extra feeling, such as "hello" -&gt; "heeellooo", "hi" -&gt; "hiiii".&#160; Here, we have&#160;groups, of adjacent letters that are all the same character, and adjacent characters to&#160;the group are different.&#160; A group&#160;is extended if that group is length 3 or more, so "e" and "o" would be extended in the first example, and "i" would be extended in the second example.&#160; As another example, the groups of "abbcccaaaa" would be "a", "bb", "ccc", and "aaaa"; and "ccc" and "aaaa" are the extended groups of that string.</p>

<p>For some given string S, a query word is <em>stretchy</em> if it can be made to be equal to S by extending some groups.&#160; Formally, we are allowed to repeatedly choose a group&#160;(as defined above) of characters <code>c</code>, and add some number of the&#160;same character <code>c</code> to it so that the length of the group is 3 or more.&#160; Note that we cannot extend a group of size one like "h" to a group of size two like "hh" - all extensions must leave the group extended - ie., at least 3 characters long.</p>

<p>Given a list of query words, return the number of words that are stretchy.&#160;</p>

<pre><strong>Example:</strong>
<strong>Input:</strong> 
S = "heeellooo"
words = ["hello", "hi", "helo"]
<strong>Output:</strong> 1
<strong>Explanation:</strong> 
We can extend "e" and "o" in the word "hello" to get "heeellooo".
We can't extend "helo" to get "heeellooo" because the group "ll" is not extended.
</pre>

<p><strong>Notes: </strong></p>

<ul>
	<li><code>0 &lt;= len(S) &lt;= 100</code>.</li>
	<li><code>0 &lt;= len(words) &lt;= 100</code>.</li>
	<li><code>0 &lt;= len(words[i]) &lt;= 100</code>.</li>
	<li><code>S</code> and all words in <code>words</code>&#160;consist only of&#160;lowercase letters</li>
</ul>

<p>&#160;</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>