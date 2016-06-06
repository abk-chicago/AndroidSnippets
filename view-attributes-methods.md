
## Common View Attributes & Methods

Attribute | Method                | Description
----------|-----------------------|---------------------------------------------------------------
alpha     | setAlpha(float)       | Defines alpha level of the view (0, transparent to 1, opaque)
background| setBackground(Drawable), setBackgroundColor(int), setBackgroundDrawable(Drawable), setBackgroundResource(int) | Set the desired resource for background
contentDescription  | setContentDescription(CharSequence) | Sets text used to briefly describe a view for accessibility users
duplicateParentState  | setDuplicateParentState(boolnea)  | Setting to true has the view get current state (pressed, focused, etc) from the parent element
focusable | setFocusable(boolean) | Makes view focusable; default is false
focusableInTouchMode  | setFocusableInTouchMode(boolean)  | Sets the view to be focusable while the app is in "touch mode" (http://android-developers.blogspot.com/2008/12/touch-mode.html)
id        | setId(int)            | Defines the id for the view
