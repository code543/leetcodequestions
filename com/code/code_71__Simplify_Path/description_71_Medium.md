##[71.Simplify Path](https://leetcode.com/problems/simplify-path/description/ "71.Simplify Path")
######Difficulty:Medium
####Similiar Topics:
  [Stack](https://leetcode.com//tag/stack)  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given an absolute path for a file (Unix-style), simplify it.&#160;</p>

<p>For example,<br/>
<strong>path</strong> = <code>"/home/"</code>, =&gt; <code>"/home"</code><br/>
<strong>path</strong> = <code>"/a/./b/../../c/"</code>, =&gt; <code>"/c"</code><br/>
<strong>path</strong> = <code>"/a/../../b/../c//.//"</code>, =&gt; <code>"/c"</code><br/>
<strong>path</strong> = <code>"/a//b////c/d//././/.."</code>, =&gt; <code>"/a/b/c"</code></p>

<p>In a UNIX-style file system, a period ('.') refers to the current directory, so it can be ignored in a simplified path. Additionally, a double period ("..") moves up a directory, so it cancels out whatever the last directory was. For more information, look here:&#160;<a href="https://en.wikipedia.org/wiki/Path_(computing)#Unix_style">https://en.wikipedia.org/wiki/Path_(computing)#Unix_style</a></p>

<p><strong>Corner Cases:</strong></p>

<ul>
	<li>Did you consider the case where <strong>path</strong> = <code>"/../"</code>?<br/>
	In this case, you should return <code>"/"</code>.</li>
	<li>Another corner case is the path might contain multiple slashes <code>'/'</code> together, such as <code>"/home//foo/"</code>.<br/>
	In this case, you should ignore redundant slashes and return <code>"/home/foo"</code>.</li>
</ul>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>