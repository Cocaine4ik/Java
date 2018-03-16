package MethodsAndClasses;

// return object String type

public class ErrorMsg {
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};
	
	// return object String type look like message about error
	
	String getErrorMsg (int i) {
		if (i >= 0 & i < msgs.length)
		return msgs[i]; 
		
		else return "Invalid error code";
	}
}
