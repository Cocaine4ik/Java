package Inheritance;

// return object type String

public class ErrorMsg {
	// error codes
	// constant announced by key word final
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXRR = 3;
	
	String msg[] = {
			"Output Error",
			"Input Error",
			"Disk Full",
			"Index Out-Of-Bounds"
	};
	
	// return an error message
	String getErrorMsg(int i) {
		if(i >= 0 & i < msg.length) return msg[i];
		else return "Invalid Error Code";
	}
	
}
