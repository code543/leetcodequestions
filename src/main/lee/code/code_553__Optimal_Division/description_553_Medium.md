##[553.Optimal Division](https://leetcode.com/problems/optimal-division/description/ "553.Optimal Division")
######Difficulty:Medium
####Similiar Topics:
  [Math](https://leetcode.com//tag/math)  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a list of <b>positive integers</b>, the adjacent integers will perform the float division. For example, [2,3,4] -&gt; 2 / 3 / 4.</p>

<p>However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the <b>maximum</b> result, and return the corresponding expression in string format. <b>Your expression should NOT contain redundant parenthesis.</b></p>

<p><b>Example:</b><br/>
</p><pre><b>Input:</b> [1000,100,10,2]
<b>Output:</b> "1000/(100/10/2)"
<b>Explanation:</b>
1000/(100/10/2) = 1000/((100/10)/2) = 200
However, the bold parenthesis in "1000/(<b>(</b>100/10<b>)</b>/2)" are redundant, <br/>since they don't influence the operation priority. So you should return "1000/(100/10/2)". 

Other cases:
1000/(100/10)/2 = 50
1000/(100/(10/2)) = 50
1000/100/10/2 = 0.5
1000/100/(10/2) = 2
</pre>
<p/>

<p><b>Note:</b>
</p><ol>
<li>The length of the input array is [1, 10].</li>
<li>Elements in the given array will be in range [2, 1000].</li>
<li>There is only one optimal division for each test case.</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>