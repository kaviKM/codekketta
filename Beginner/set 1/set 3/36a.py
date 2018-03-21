def countCharacterType(str)
    specialChar = 0
for i in range(0, len(str)): 
     ch = str[i]
     if ( (ch >= 'a' and ch <= 'z') or
             (ch >= 'A' and ch <= 'Z') ): 
             ch = ch.lower()
             if (ch == 'a' or ch == 'e' or ch == 'i'
                        or ch == 'o' or ch == 'u'):
                vowels += 1
            else:
                consonant += 1
         
        elif (ch >= '0' and ch <= '9'):
            digit += 1
        else:
            specialChar += 1
     print("Special Character:", specialChar) 
 str = "geeks for geeks121"
countCharacte
