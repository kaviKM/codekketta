while True:
	print("Enter 'x' for exit.")
	string = input("Enter any string: ")
if string == 'x':
    word_length = len(string.split())
    print("Number of words =",word_length,"\n")
