Palindrome
__________________________________________________
say “please input a word”

word = user input

length = length of word (in characters including spaces)

number charactersInWord = 0

do (

get last character of word

put last character in the front of word

characterInWord = characterInWord + 1)

while characterInWord < length

say “Your word reversed is “ characterInWord

if characterInWord = word

say “Your word is a palindrome”

or else

say “Your word is NOT a palindrome

say “would you like to run the program again? Type 1 for yes and 2 for no”

againOrExit = user input

if againOrExit = 1, re-run the program

else

end program

MailingAddress
__________________________________________________
say “please input a delimiter for your mailing label”

character delimiter = user input

say “please input the contents of your mailing label with the delimiter to separate lines”

contents = user input

split contents into an array of characters

integer length = length of contents

finalMessage = “”

while integer index is less than or equal to length - 1 (

index = index + 1

charAt = the character in contents at index

if character is delimiter (

create a new line on finalMessage

) else (

finalMessage = finalMessage + charAt

)
)

say “--------------------”

say “finalMessage”

say “--------------------”

say “would you like to run the program again? Type 1 for yes and 2 for no”

againOrExit = user input

if againOrExit = 1, re-run the program

else

end program

Zinnformatics
__________________________________________________
say “What is the name of your company?”

companyName = user input

say “How many packages would you like to order?”

packageAmount = user input

integer discount = 0

if packageAmount >= 10 AND <= 19 (
discount = 20
) else if packageAmount >= 20 AND <= 49 (
discount = 30
) else if packageAmount >= 50AND <= 99 (
discount = 40
) else if packageAmount >= 100 (
discount = 50
)

RealNumber trueDiscount = (100 - discount) / 100

RealNumber finalCost = packageAmount * trueDiscount

say “Thank you for your order at “ + companyName + “! You have ordered “ + packageAmount + “ packages, at a “ + discount + “% discount. Your final cost will be “ + finalCost + “.”

say “would you like to run the program again? Type 1 for yes and 2 for no”

againOrExit = user input

if againOrExit = 1, re-run the program

else

end program

CozaLozaWoza
__________________________________________________
say “input a number”

integer num = user input
