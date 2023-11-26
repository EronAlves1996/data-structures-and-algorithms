package com.eronalves.tamasiaexs;

import java.util.Arrays;

public class PNorm {

	public static double norm(double[] v,double p) {
		return Math.pow(Arrays
				.stream(v)
				.map(i -> Math.pow(i, p))
				.reduce(0, (prev, cur) -> prev + cur), 1/p);
	}
	
	public static double norm(double[] v) {
		return norm(v, 2);
	}
}
