---
layout: post
title:  "Apple Rain"
date:   2017-08-30
thumbnail:
---


Apple Rain is my pet project to commemorate the few surviving comfort women in WW2.  

Since this is my first attempt at making a VR experience, I will try to keep it simple.
Apple Rain will comprise of simple controller interactions with apples that "rain" from a mesh emitter.
Upon the user picking up the apples, the apples will explode into butterflies which then will congregate to make up a part of the "peace statue".  

To make it rain apples, I first modelled the apple in blender.

<figure>
	<img src="{{ site.baseurl }}/assets/blog2/model.png" alt="image">
	<figcaption>
		Stemless Apple
	</figcaption>
</figure>

I then imported it to ue4 as a .fbx and the stem and apple were separated.  

<figure>
	<img src="{{ site.baseurl }}/assets/blog2/mmm.png" alt="image">
</figure>  

I then went back to blender and ctrl+j to join the stem and apple into one mesh. The result was better.  

<figure>
	<img src="{{ site.baseurl }}/assets/blog2/a1.png" alt="image">
</figure>  

I managed to make a mesh emitter that rains apples that collide as they hit the floor. No problem there.  

<figure>
	<img src="{{ site.baseurl }}/assets/blog2/a2.png" alt="image">
	<figcaption>
		It's raining apples!
	</figcaption>
</figure>   

I then wanted the apples to have random colors as they spawn but I cannot change the color of the apples without also tempering with the brown stem, which
I do not want to do. I think the solution is to UV unwrap the apple in blender then import the UV map to ue4 then make the material in ue4 instead of trying to import from blender. Will try that later.
