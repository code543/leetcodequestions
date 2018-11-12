##[8.String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/description/ "8.String to Integer (atoi)")
######Difficulty:Medium
####Similiar Topics:
  [Math](https://leetcode.com//tag/math)  [String](https://leetcode.com//tag/string)
####Similiar Problems:
  [Valid Number](https://leetcode.com//problems/valid-number)  [Reverse Integer](https://leetcode.com//problems/reverse-integer)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Implement <code><span>atoi</span></code> which&#160;converts a string to an integer.</p>

<p>The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.</p>

<p>The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.</p>

<p>If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.</p>

<p>If no valid conversion could be performed, a zero value is returned.</p>

<p><strong>Note:</strong></p>

<ul>
	<li>Only the space character <code>' '</code> is considered as whitespace character.</li>
	<li>Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [&#8722;2<sup>31</sup>,&#160; 2<sup>31&#160;</sup>&#8722; 1]. If the numerical value is out of the range of representable values, INT_MAX (2<sup>31&#160;</sup>&#8722; 1) or INT_MIN (&#8722;2<sup>31</sup>) is returned.</li>
</ul>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> "42"
<strong>Output:</strong> 42
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> "   -42"
<strong>Output:</strong> -42
<strong>Explanation:</strong> The first non-whitespace character is '-', which is the minus sign.
&#160;            Then take as many numerical digits as possible, which gets 42.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> "4193 with words"
<strong>Output:</strong> 4193
<strong>Explanation:</strong> Conversion stops at digit '3' as the next character is not a numerical digit.
</pre>

<p><strong>Example 4:</strong></p>

<pre><strong>Input:</strong> "words and 987"
<strong>Output:</strong> 0
<strong>Explanation:</strong> The first non-whitespace character is 'w', which is not a numerical 
&#160;            digit or a +/- sign. Therefore no valid conversion could be performed.</pre>

<p><strong>Example 5:</strong></p>

<pre><strong>Input:</strong> "-91283472332"
<strong>Output:</strong> -2147483648
<strong>Explanation:</strong> The number "-91283472332" is out of the range of a 32-bit signed integer.
&#160;            Thefore INT_MIN (&#8722;2<sup>31</sup>) is returned.</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>