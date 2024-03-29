import java.util.Date;

public class DateRange {
	private final Date start;
	private final Date end;

	public DateRange(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}
}
