 
 i m p o r t   j a v a . u t i l . c o n c u r r e n t . * ;  
  
 p u b l i c   c l a s s   h e l l o   {  
 	 s t a t i c   T h r e a d L o c a l < S t r i n g >   t h r e a d L o c a l = n e w   T h r e a d L o c a l < S t r i n g > ( ) ;  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   t h r o w s   E x c e p t i o n   {  
               T h r e a d   t = n e w   T h r e a d ( ( ) - > {  
         	       t r y   {  
         	 	        
         	 	       t h r e a d L o c a l . s e t ( " t 1 " ) ;  
         	 	        
         	 	       p r i n t ( " v a l u e   i n   t 1   i s   " ) ;  
         	 	       T h r e a d . s l e e p ( 1 0 0 0 ) ;  
         	 	       p r i n t ( " v a l u e   i n   t 1   a f t e r   1 s   i s   " ) ;  
         	       }   c a t c h   ( I n t e r r u p t e d E x c e p t i o n   e )   {  
 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } f i n a l l y   {  
         	 	       t h r e a d L o c a l . r e m o v e ( ) ;  
         	 	       p r i n t ( " v a l u e   i n   t 1   a f t e r   r e m o v e   i s " ) ;  
         	       }  
               } ) ;  
               T h r e a d   t 1 = n e w   T h r e a d ( ( ) - > {  
         	       t r y   {  
         	 	       t h r e a d L o c a l . s e t ( " t 2 " ) ;  
         	 	       p r i n t ( " v a l u e   i n   t 2   i s   " ) ;  
         	 	       T h r e a d . s l e e p ( 5 0 0 ) ;  
         	 	       p r i n t ( " v a l u e   i n   t 2   a f t e r   1 s   i s   " ) ;  
         	       }   c a t c h   ( I n t e r r u p t e d E x c e p t i o n   e )   {  
 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } f i n a l l y   {  
         	 	       t h r e a d L o c a l . r e m o v e ( ) ;  
         	 	       p r i n t ( " v a l u e   i n   t 2   a f t e r   r e m o v e   i s   " ) ;  
         	       }  
               } ) ;  
               t . s t a r t ( ) ;  
               t 1 . s t a r t ( ) ;  
         }  
 	 s t a t i c   v o i d   p r i n t ( S t r i n g   s )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( s + t h r e a d L o c a l . g e t ( ) ) ;  
 	  
 	 }  
          
 }  
 