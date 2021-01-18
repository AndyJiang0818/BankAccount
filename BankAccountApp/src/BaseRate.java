import java.util.*;

public interface BaseRate {
	// Returns the base rate
	default double getBaseRate() {
		return 2.5;
	}
}
