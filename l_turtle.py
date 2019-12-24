from turtle import *
# color('red', 'yellow')
# begin_fill()
# while True:
#     forward(200)
#     left(170)
#     if abs(pos()) < 1:
#         break
# end_fill()
# done()


def drawRect(height):
	color('red', 'yellow')
	begin_fill()
	forward(15)
	left(90)
	forward(height)
	left(90)
	forward(15)
	left(90)
	forward(height)
	left(90)
	forward(15)
	left(90)
	end_fill()
	done()
