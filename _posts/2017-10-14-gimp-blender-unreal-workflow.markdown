---
layout: post
title:  "GIMP to Blender to UE4"
date:   2017-10-13
thumbnail: 
---


Today I tried to recreate a typical Hong Kong style pawn shop sign using a jpeg.

<figure>
	<img src="{{ site.baseurl }}/assets/blog3/pawn_sign.JPG" alt="image">
	<figcaption>
		Pawn Shop Sign
	</figcaption>
</figure>

I used the fuzzy tool(thanks to the advice of one genius koana) in GIMP to create an svg of the chinese characters on the sign and the surrounding patterns then imported it into blender. 

I extruded everything a bit, used alt-c to convert the curves into a mesh, used a solidifier to fill it out a bit to look like tubes then applied an emission material.
I find that there was no need to actually model the sign itself but using loop-cuts to conform a plane into the right shape. I could use GIMP to get the shape and extrude it,
 which would save me a lot of time. 

I was pleased with the end result.

<figure>
	<img src="{{ site.baseurl }}/assets/blog3/pawn_sign_blender.jpg" alt="image">
</figure>  

  

I could have tweaked the colors a little bit to get the right feel. Looks like this will be the beginning of my VR HK culture preservation project.

Lots of models to be made! Should also look into photogrammetry....
