def compare(x0, x1):
	if x0 > x1:
		return [ x1, x0 ]
	else:
		return [ x0, x1 ]

def goThroughArray(array):
	sortIndicator = 0
	i = 0
	while i < len(array) - 1:
		result = compare(array[i], array[i + 1])
		array[i] = result[0]
		array[i + 1] = result[1]
		if result[0] != array[i]:
			print('Sort ', result[0], array[i])
			sortIndicator += 1
		i += 1
	return sortIndicator


array = [ 1, 3, 5, 2, 4, 8]

print('before', array)
print(goThroughArray(array))
print('after', array)
