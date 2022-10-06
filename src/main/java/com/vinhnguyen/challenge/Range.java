package com.vinhnguyen.challenge;

public class Range<T extends Comparable>{
	private T lowerbound;
	private T upperbound;
	private String type;

	private Range(T lowerbound, T upperbound) {
		super();
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
	}

	public Range(T lowerbound, T upperbound, String type) {
		super();
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
		this.type = type;
	}

	/**
	 * of
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static Range of(int lowbound, int uppbound) {
		// validate
		if (lowbound > uppbound) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound);
	}

	/**
	 * contains
	 * 
	 * @param number
	 * @return
	 */
	public boolean contains(T value) {
		switch (this.type) {
		case "open":
			return (value.compareTo(this.lowerbound) > 0  && value.compareTo(this.upperbound) < 0);
		case "closed":
			return (value.compareTo(this.lowerbound) >= 0  && value.compareTo(this.upperbound) <= 0);
		case "openClosed":
			return (value.compareTo(this.lowerbound) > 0  && value.compareTo(this.upperbound) <= 0);
		case "closedOpen":
			return (value.compareTo(this.lowerbound) >= 0  && value.compareTo(this.upperbound) < 0);
		default:
			throw new IllegalArgumentException("Failed!");
		}
	}

	/**
	 * open
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static <T extends Comparable<T>> Range<T> open(T lowbound, T uppbound) {
		// validate
		if (lowbound.compareTo(uppbound) > 0) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "open");
	}
	
	/**
	 * closed
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static <T extends Comparable<T>> Range<T> closed(T lowbound, T uppbound) {
		// validate
		if (lowbound.compareTo(uppbound) > 0) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "closed");
	}
	
	/**
	 * openClosed
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static <T extends Comparable<T>> Range<T> openClosed(T lowbound, T uppbound) {
		// validate
		if (lowbound.compareTo(uppbound) > 0) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "closed");
	}
	
	/**
	 * closedOpen
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static <T extends Comparable<T>> Range<T> closedOpen(T lowbound, T uppbound) {
		// validate
		if (lowbound.compareTo(uppbound) > 0) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "closedOpen");
	}
}
