  encrypt s (
  removeWhitespaceAndCovertToUpper s
  substitute s
  swapHalfsForEncrypt s
  swapFirst2WithLast2 s
  swapMiddleChars s
  )
  removeWhitespaceAndCovertToUpper s (
  trim s
  s toUpperCase
  )
  substitute s (
  replace "A" with "@”
  replace "E" with "="
  replace “I" with "!”
  replace “J" with "?"
  replace "O" with "*"
  replace "P" with "#"
  replace “R" with "&"
  replace "S" with "$"
  replace "T" with "plus"
  replace “V" with "^"
  replace "X" with "%"
  replace " " with "_"
  )
  swapHalfsForEncrypt s (
  String firstHalf, secondHalf;
  
  if get the length plus 1 % 2 == 0 (
  firstHalf = get the subString 0, get the length divided by 2 ;
  secondHalf = get the subString get the length divided by 2, get the length  - 1 ;
  ) else (
  firstHalf = get the subString 0, get the length divided by 2 plus 1 ;
  secondHalf = get the subString get the length divided by 2 plus 1, get the length  - 1 ;
  )
  
  output secondHalf plus firstHalf;
  )
  swapFirst2WithLast2 s (
  String body = get the subString 2, get the length  - 3 ;
  String first2 = get the subString 0, 1 ;
  String last2 = get the subString get the length  - 2, get the length  - 1 ;
  
  output last2 plus body plus first2;
  )
  swapMiddleChars s (
  String body1, body2, middle1, middle2;
  
  if get the length  plus 1 % 2 == 0  (
  body1 = get the subString 0, get the length divided by 2 - 2 ;
  middle1 = get the subString get the length divided by 2 - 2 , get the length divided by 2 ;
  middle2 = get the subString get the length divided by 2, get the length divided by 2 plus 2 ;
  body2 = get the subString get the length divided by 2 plus 2, get the length - 1 ;
  ) else (
  body1 = get the subString 0, get the length divided by 2 - 1 ;
  middle1 = get the subString get the length divided by 2 - 1 , get the length  divided by 2 plus 1 ;
  middle2 = get the subString get the length divided by 2 plus 1, get the length  divided by 2 plus 3 ;
  body2 = get the subString get the length divided by 2 plus 3, get the length  - 1 ;
  )
  output body1 plus middle2 plus middle1 plus body2;
  )
)
