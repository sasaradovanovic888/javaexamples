package math;

import static java.lang.Math.*;

public class MathematicalFunctionsStatic {
	
	double sineFunc(double radians) {
		double result = sin(radians);
		return result;
	}
	
	double cosineFunc(double radians) {
		double result = cos(radians);
		return result;
	}
	
	double tangentFunc(double radians) {
		double result = tan(radians);
		return result;
	}
	
	double arcsineFunc(double radians) {
		double result = asin(radians);
		return result;
	}
	
	double arccosineFunc(double radians) {
		double result = acos(radians);
		return result;
	}
	
	double arctangentFunc(double radians) {
		double result = atan(radians);
		return result;
	}
	
	double arctangent2Func(double arg1radians, double arg2radians) {
		double result = atan2(arg1radians, arg2radians);
		return result;
	}
	
	double toRadiansFunc(double argument) {
		double result = toRadians(argument);
		return result;
	}
	
	double toDegriesFunc(double argument) {
		double result = toDegrees(argument);
		return result;
	}
	
	double toIntExactFunc(long argument) {
		double result = toIntExact(argument);
		return result;
	}
	
	double showPi() {
		double mypi = PI;
		return mypi;
	}
	
	double shoeE() {
		double mye = E;
		return mye;
	}
	
	int absoluteIntegerFunc(int argument) {
		int result = abs(argument);
		return result;
	}
	
	long absoluteLongFunc(long argument) {
		long result = abs(argument);
		return result;
	}
	
	float absoluteFloatFunc(float argument) {
		float result = abs(argument);
		return result;
	}
	
	double absoluteDoubleFunc(double argument) {
		double result = abs(argument);
		return result;
	}
	
	int maximumIntegerFunc(int argument1, int argument2) {
		int result = max(argument1, argument2);
		return result;
	}
	
	long maximumLongFunc(long argument1, long argument2) {
		long result = max(argument1, argument2);
		return result;
	}
	
	float maximumFloatFunc(float argument1, float argument2) {
		float result = max(argument1, argument2);
		return result;
	}
	
	double maximumDoubleFunc(double argument1, double argument2) {
		double result = max(argument1, argument2);
		return result;
	}
	
	int minimumIntegerFunc(int argument1, int argument2) {
		int result = min(argument1, argument2);
		return result;
	}
	
	long minimumLongFunc(long argument1, long argument2) {
		long result = min(argument1, argument2);
		return result;
	}
	
	float minimumFloatFunc(float argument1, float argument2) {
		float result = min(argument1, argument2);
		return result;
	}
	
	double minimumDoubleFunc(double argument1, double argument2) {
		double result = min(argument1, argument2);
		return result;
	}
	
	double ceilFunc(double argument) {
		double result = ceil(argument);
		return result;
	}
	
	double floorFunc(double argument) {
		double result = floor(argument);
		return result;
	}
	
	float roundFloatFunc(float argument) {
		float result = round(argument);
		return result;
	}
	
	double roundDoubleFunc(double argument) {
		double result = round(argument);
		return result;
	}
	
	double rintFunc(double argument) {
		double result = rint(argument);
		return result;
	}
	
	double squareRootFunc(double argument) {
		double result = sqrt(argument);
		return result;
	}
	
	double cubeRootFunc(double argument) {
		double result = cbrt(argument);
		return result;
	}
	
	double powerFunc(double base, double exponent) {
		double result = pow(base, exponent);
		return result;
	}
	
	double squareRootOfTwoArguments(double argument1, double argument2) {
		double result = hypot(argument1, argument2);
		return result;
	}
	
	double eraisedToPowerOfArgument(double argument) {
		double result = exp(argument);
		return result;
	}
	
	double eraisedToPowerOfArgumentMinusOne(double argument) {
		double result = expm1(argument);
		return result;
	}
	
	double naturalLogarithmBaseE(double argument) {
		double result = log(argument);
		return result;
	}
	
	double naturalLoratithmBaseEOfArgumentPlusOne(double argument) {
		double result = log1p(argument);
		return result;
	}
	
	double logarithmBase10(double argument) {
		double result = log10(argument);
		return result;
	}
	
	double randomFunc() {
		double result = random();
		return result;
	}
}
