switch(expression) {
    case key1:
        /* statements if the expression value matches key1 */
        break;
    case key2:
        /* statements if the expression value matches key2 */
        break;
    ...
    default:
        /* statements  */
}

//Syntax of expessions in switch
public int defineLevel(String role) {
    return switch (role) { 
        case "guest" -> 0; 
        case "client" -> 1; 
      	case "moderator" -> 2; 
      	case "admin" -> 3; 
      	default -> { 
            System.out.println("non-authentic role = " + role); 
        	yield -1; 
      	} 
    }; 
}


//////Direct assiggnment of the statement switch
public int defineLevel(String role) {
    var result = switch (role) {
        case "guest" -> 0;
      	case "client" -> 1;
      	case "moderator" -> 2;
      	case "admin" -> 3;
      	default  -> {
        	System.out.println("non-authentic role = " + role);
        	yield -1;
      	}
    };
    return result;
}

//Statement switch as a method
System.out.println(
    switch (value) {
        case 2, 3, 4 -> "2,3 or 4";
        case 777 -> "Range: " + value;
        case 0 -> "0";
        default -> "Default";
        });
