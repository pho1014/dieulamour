---
layout: post
title:  "blog #4:Attempt at UV mapping using photoshop + blender"
date:   2017-10-19
thumbnail: 
---


It took me a while to find an older version of VLT on google image.
 
<figure>
	<img src="{{ site.baseurl }}/assets/blog4/lemon_tea_old_original.jpg" alt="image">
	<figcaption>
		VLT is BEST!
	</figcaption>
</figure>

I stretched the bottom half of the image because it was at a weird angle. Then I applied an unsharp mask a few times then created a layer mask and painted over with white brush tool, 
I was able to sharpen the stretched out part.

<figure>
	<img src="{{ site.baseurl }}/assets/blog4/lemontea.png" alt="image">
</figure>  

  
I then modelled a simple cuboid and used smart UV project to unwrap the model. The UV map came out all squares and the trick is to ONLY scale in edit mode so the shapes are correct after unwrapped.

<figure>
	<img src="{{ site.baseurl }}/assets/blog4/lemon_uv.png" alt="image">
</figure>  

On photoshop, I created a layer under the UV map then painted over it and then created another layer to put the box image on top the front side of the unwrapped box. Then I unchecked the visibility of the original uv map layer and then exported it.

<figure>
	<img src="{{ site.baseurl }}/assets/blog4/lemon_uv1-1.png" alt="image">
</figure>  

And then all I had to do was to use the node editor to apply the edited UV map. note: press alt-z to view the material in object mode.

<figure>
	<img src="{{ site.baseurl }}/assets/blog4/rendered_lemontea_node_editor.png" alt="image">
</figure>  

It's just a simple cuboid without a typical carton's creases and texture so it's not really a usable asset. But it's good to know UV mapping isn't so hard! (with simple shapes at least.)