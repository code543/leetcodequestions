##[514.Freedom Trail](https://leetcode.com/problems/freedom-trail/description/ "514.Freedom Trail")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Divide and Conquer](https://leetcode.com//tag/divide-and-conquer)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>
In the video game Fallout 4, the quest "Road to Freedom" requires players to reach a metal dial called the "Freedom Trail Ring", and use the dial to spell a specific keyword in order to open the door. 
</p>

<p>
Given a string <b>ring</b>, which represents the code engraved on the outer ring and another string <b>key</b>, which represents the keyword needs to be spelled. You need to find the <b>minimum</b> number of steps in order to spell all the characters in the keyword.
</p>
Initially, the first character of the <b>ring</b> is aligned at 12:00 direction. You need to spell all the characters in the string <b>key</b> one by one by rotating the ring clockwise or anticlockwise to make each character of the string <b>key</b> aligned at 12:00 direction and then by pressing the center button.
<br/>

At the stage of rotating the ring to spell the key character <b>key[i]</b>:
<ol>
<li>You can rotate the <b>ring</b> clockwise or anticlockwise <b>one place</b>, which counts as 1 step. The final purpose of the rotation is to align one of the string <b>ring's</b> characters at the 12:00 direction, where this character must equal to the character <b>key[i]</b>.

</li><li>If the character <b>key[i]</b> has been aligned at the 12:00 direction, you need to press the center button to spell, which also counts as 1 step. After the pressing, you could begin to spell the next character in the key (next stage), otherwise, you've finished all the spelling.</li>
</ol>

<p/>

<p><b>Example:</b><br/>
</p><center>
<img src="/static/images/problemset/ring.jpg" width="26%"/>
</center>
<br/>
<pre><b>Input:</b> ring = "godding", key = "gd"
<b>Output:</b> 4
<b>Explanation:</b><br/> For the first key character 'g', since it is already in place, we just need 1 step to spell this character. <br/> For the second key character 'd', we need to rotate the ring "godding" anticlockwise by two steps to make it become "ddinggo".<br/> Also, we need 1 more step for spelling.<br/> So the final output is 4.
</pre>
<p/>

<p><b>Note:</b><br/>
</p><ol>
<li>Length of both ring and <b>key</b> will be in range 1 to 100.</li>
<li>There are only lowercase letters in both strings and might be some duplcate characters in both strings.</li>
<li>It's guaranteed that string <b>key</b> could always be spelled by rotating the string <b>ring</b>.</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>