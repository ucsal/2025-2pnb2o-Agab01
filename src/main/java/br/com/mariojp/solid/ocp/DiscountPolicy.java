package br.com.mariojp.solid.ocp;

public interface DiscountPolicy {
	double apply(double amount);

	class RegularPolicy implements DiscountPolicy {
		public double apply(double amount) {
			return amount * 0.95;
		}
	}

	class PremiumPolicy implements DiscountPolicy {
		public double apply(double amount) {
			return amount * 0.9;
		}
	}

	class PartnerPolicy implements DiscountPolicy {
		public double apply(double amount) {
			return amount * 0.88;
		}
	}
}
