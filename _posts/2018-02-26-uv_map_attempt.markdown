---
layout: post
title:  "blog #4:Attempt at UV mapping using photoshop + blender"
date:   2017-10-19
thumbnail: 
---


I had the idea to make a "game room" for my HKVR project. It's probably gonna have a few classic Chinese tabletop games in different themed rooms.

I started with chinese chess. This took me about a week.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chinese_chess1.jpg" alt="image">
</figure> 

I managed to find a good online caligraphy generator and generated these pretty okay looking characters.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chinese_chess_characters.png" alt="image">
</figure> 

I was relatively satisfied with these and I proceeded to model my chess piece, a few loop cuts on a cylinder and bevelled the edges, added a subsurf modifier and it came out okay.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chinese_chess_model.png" alt="image">
</figure> 

I did some experimenting with marking seams to UV unwrap the model in such a way that my model would have a continuity in the texture. 
The best way is to mark the seam on the bottom, since I figured not a lot of people would closely examine the bottom of the piece.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/seam_bottom_uv_blender.png" alt="image">
</figure> 


Next step was to vectorize the caligraphied characters in illustrator and export the UV map of the chess piece to line things up on a nice wooden texture.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chinese_chess_uv.png" alt="image">
</figure> 

Then I imported the chess piece into UE4 and made materials out of the textures made in AI along with normal and bump maps.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chess_mat_unreal.png" alt="image">
</figure> 

After that was done I proceeded to make the chess board. I found a good reference on the web and drew over it in AI.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chinese_chess_board_drawning.png" alt="image">
</figure> 

I then protruded a flat square in blender to make a board and uv unwrap that and make my board texture.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chinese_chinese_chess_board_UV.png" alt="image">
</figure> 

Imported the board into UE4 too and applied the materials made and voila!

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chess_board_pieces_unreal.png" alt="image">
</figure> 

Of course, I didn't forget to script the pieces so I can actually pick them up with my vive wand.Just used whatever script came stock with one of the VR startup maps. Physics had to be enabled on pieces too.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chess_pickup_script.png" alt="image">
</figure> 

Here's a closeup to really show of the bumps on the texture.

<figure>
	<img src="{{ site.baseurl }}/assets/blog5/chess_board_piece_tool_close.png" alt="image">
</figure> 

Credits to Koana for having much patience to teach this PS/AI n00b! Next I should work on flight chess/mahjong...