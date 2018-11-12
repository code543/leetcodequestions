##[831.Masking Personal Information](https://leetcode.com/problems/masking-personal-information/description/ "831.Masking Personal Information")
######Difficulty:Medium
####Similiar Topics:
  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>We are given a&#160;personal information string <code>S</code>, which may represent&#160;either <strong>an email address</strong> or <strong>a phone number.</strong></p>

<p>We would like to mask this&#160;personal information according to the&#160;following rules:</p>

<p><br/>
<u><strong>1. Email address:</strong></u></p>

<p>We define a&#160;<strong>name</strong> to be a string of <code>length &#8805; 2</code> consisting&#160;of only lowercase letters&#160;<code>a-z</code> or uppercase&#160;letters&#160;<code>A-Z</code>.</p>

<p>An email address starts with a name, followed by the&#160;symbol <code>'@'</code>, followed by a name, followed by the&#160;dot&#160;<code>'.'</code>&#160;and&#160;followed by a name.&#160;</p>

<p>All email addresses are&#160;guaranteed to be valid and in the format of&#160;<code>"name1@name2.name3".</code></p>

<p>To mask an email, <strong>all names must be converted to lowercase</strong> and <strong>all letters between the first and last letter of the first name</strong> must be replaced by 5 asterisks <code>'*'</code>.</p>

<p><br/>
<u><strong>2. Phone number:</strong></u></p>

<p>A phone number is a string consisting of&#160;only the digits <code>0-9</code> or the characters from the set <code>{'+', '-', '(', ')', '&#160;'}.</code>&#160;You may assume a phone&#160;number contains&#160;10 to 13 digits.</p>

<p>The last 10 digits make up the local&#160;number, while the digits before those make up the country code. Note that&#160;the country code is optional. We want to expose only the last 4 digits&#160;and mask all other&#160;digits.</p>

<p>The local&#160;number&#160;should be formatted and masked as <code>"***-***-1111",&#160;</code>where <code>1</code> represents the exposed digits.</p>

<p>To mask a phone number with country code like <code>"+111 111 111 1111"</code>, we write it in the form <code>"+***-***-***-1111".</code>&#160; The <code>'+'</code>&#160;sign and the first <code>'-'</code>&#160;sign before the local number should only exist if there is a country code.&#160; For example, a 12 digit phone number mask&#160;should start&#160;with <code>"+**-"</code>.</p>

<p>Note that extraneous characters like <code>"(", ")", " "</code>, as well as&#160;extra dashes or plus signs not part of the above formatting scheme should be removed.</p>

<p>&#160;</p>

<p>Return the correct "mask" of the information provided.</p>

<p>&#160;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>"LeetCode@LeetCode.com"
<strong>Output: </strong>"l*****e@leetcode.com"
<strong>Explanation:&#160;</strong>All names are converted to lowercase, and the letters between the
&#160;            first and last letter of the first name is replaced by 5 asterisks.
&#160;            Therefore, "leetcode" -&gt; "l*****e".
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>"AB@qq.com"
<strong>Output: </strong>"a*****b@qq.com"
<strong>Explanation:&#160;</strong>There must be 5 asterisks between the first and last letter 
&#160;            of the first name "ab". Therefore, "ab" -&gt; "a*****b".
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong>"1(234)567-890"
<strong>Output: </strong>"***-***-7890"
<strong>Explanation:</strong>&#160;10 digits in the phone number, which means all digits make up the local number.
</pre>

<p><strong>Example 4:</strong></p>

<pre><strong>Input: </strong>"86-(10)12345678"
<strong>Output: </strong>"+**-***-***-5678"
<strong>Explanation:</strong>&#160;12 digits, 2 digits for country code and 10 digits for local number. 
</pre>

<p><strong>Notes:</strong></p>

<ol>
	<li><code>S.length&#160;&lt;=&#160;40</code>.</li>
	<li>Emails have length at least 8.</li>
	<li>Phone numbers have length at least 10.</li>
</ol></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>