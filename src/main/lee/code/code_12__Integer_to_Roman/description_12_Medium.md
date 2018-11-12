##[12.Integer to Roman](https://leetcode.com/problems/integer-to-roman/description/ "12.Integer to Roman")
######Difficulty:Medium
####Similiar Topics:
  [Math](https://leetcode.com//tag/math)  [String](https://leetcode.com//tag/string)
####Similiar Problems:
  [Integer to English Words](https://leetcode.com//problems/integer-to-english-words)  [Roman to Integer](https://leetcode.com//problems/roman-to-integer)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Roman numerals are represented by seven different symbols:&#160;<code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.</p>

<pre><strong>Symbol</strong>       <strong>Value</strong>
I             1
V             5
X             10
L             50
C             100
D             500
M             1000</pre>

<p>For example,&#160;two is written as <code>II</code>&#160;in Roman numeral, just two one's added together. Twelve is written as, <code>XII</code>, which is simply <code>X</code> + <code>II</code>. The number twenty seven is written as <code>XXVII</code>, which is <code>XX</code> + <code>V</code> + <code>II</code>.</p>

<p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:</p>

<ul>
	<li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.&#160;</li>
	<li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.&#160;</li>
	<li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li>
</ul>

<p>Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong>&#160;3
<strong>Output:</strong> "III"</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong>&#160;4
<strong>Output:</strong> "IV"</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong>&#160;9
<strong>Output:</strong> "IX"</pre>

<p><strong>Example 4:</strong></p>

<pre><strong>Input:</strong>&#160;58
<strong>Output:</strong> "LVIII"
<strong>Explanation:</strong> C = 100, L = 50, XXX = 30 and III = 3.
</pre>

<p><strong>Example 5:</strong></p>

<pre><strong>Input:</strong>&#160;1994
<strong>Output:</strong> "MCMXCIV"
<strong>Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>