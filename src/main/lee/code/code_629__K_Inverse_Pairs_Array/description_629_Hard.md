##[629.K Inverse Pairs Array](https://leetcode.com/problems/k-inverse-pairs-array/description/ "629.K Inverse Pairs Array")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>
Given two integers <code>n</code> and <code>k</code>, find how many different arrays consist of numbers from <code>1</code> to <code>n</code> such that there are exactly <code>k</code> inverse pairs. 
</p>
<p>
We define an inverse pair as following:
For <code>i<sub>th</sub></code> and <code>j<sub>th</sub></code> element in the array, if <code>i</code> &lt; <code>j</code> and <code>a[i]</code> &gt; <code>a[j]</code> then it's an inverse pair; Otherwise, it's not.
</p>

<p>
Since the answer may be very large, the answer should be modulo 10<sup>9</sup> + 7.
</p>

<p><b>Example 1:</b><br/>
</p><pre><b>Input:</b> n = 3, k = 0
<b>Output:</b> 1
<b>Explanation:</b> 
Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pair.
</pre>
<p/>

<p><b>Example 2:</b><br/>
</p><pre><b>Input:</b> n = 3, k = 1
<b>Output:</b> 2
<b>Explanation:</b> 
The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
</pre>
<p/>

<p><b>Note:</b><br/>
</p><ol>
<li>The integer <code>n</code> is in the range [1, 1000] and <code>k</code> is in the range [0, 1000].</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>