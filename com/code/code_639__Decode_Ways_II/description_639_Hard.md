##[639.Decode Ways II](https://leetcode.com/problems/decode-ways-ii/description/ "639.Decode Ways II")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)
####Similiar Problems:
  [Decode Ways](https://leetcode.com//problems/decode-ways)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>
A message containing letters from <code>A-Z</code> is being encoded to numbers using the following mapping way:
</p>

<pre>'A' -&gt; 1
'B' -&gt; 2
...
'Z' -&gt; 26
</pre>

<p>
Beyond that, now the encoded string can also contain the character '*', which can be treated as one of the numbers from 1 to 9.
</p>


<p>
Given the encoded message containing digits and the character '*', return the total number of ways to decode it.
</p>

<p>
Also, since the answer may be very large, you should return the output mod 10<sup>9</sup> + 7.
</p>

<p><b>Example 1:</b><br/>
</p><pre><b>Input:</b> "*"
<b>Output:</b> 9
<b>Explanation:</b> The encoded message can be decoded to the string: "A", "B", "C", "D", "E", "F", "G", "H", "I".
</pre>
<p/>

<p><b>Example 2:</b><br/>
</p><pre><b>Input:</b> "1*"
<b>Output:</b> 9 + 9 = 18
</pre>
<p/>

<p><b>Note:</b><br/>
</p><ol>
<li>The length of the input string will fit in range [1, 10<sup>5</sup>].</li>
<li>The input string will only contain the character '*' and digits '0' - '9'.</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>