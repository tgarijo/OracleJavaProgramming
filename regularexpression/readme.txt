 * | 0 o more ocurrences | return str.matches("A*"); 
 		return true if srt consists of zero o more A's but not other letter
 ? | 0 or 1 occurrence | return str.matches("A?");
 		return true if str is "" or "A"
 + | 1 or more occurrences | return str.matches("A+");
 		return true if str is 1 or more A's in a sequence
 {x} | x ocurrences | return str.matches("A{7}"); 
 		return true if str is a secuence of 7 A's
 {x,y} | Between x & y ocurrences |  return str.matches("A{7,9}");
 		return true if str is a sequence of 7,8,9 A's
 {x,} | x o more occurrences| return str.matches("A{5,}");
 		return true if str is a sequence of 5 or more A's
 		
 return str.matches(".?[0-5]{10}");
 return true is tehere are sequence of 10 digitis(between 0 and 5) and may have
 0 or 1 characters predicing the secuence
 Valid code: K1234512345
 Invalid Code: K1234567890
 Invalid Code: KL1234512345
 
"