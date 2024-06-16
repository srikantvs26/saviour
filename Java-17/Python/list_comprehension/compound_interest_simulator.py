import numpy as np
import matplotlib.pyplot as plt

monthly_investment = 10000
years = 25

rates_of_return = [0.08, 0.12, 0.16]
# print(rates_of_return[-1])

# Intialize dictionaries to store investment values for different rate of return

investment_values = {rate: [0] for rate in rates_of_return}
total_invested = [0]


# Simulate the investment growth for different rate of return
for rate in rates_of_return:
    monthly_return_rate = (1 + rate) ** (1 / 12) - 1
    for month in range(1, 12 * years + 1):
        # print(investment_values[rate][-1])
        new_value = (investment_values[rate][-1] + monthly_investment) * (1 + monthly_return_rate)  # [-1] means last value
        investment_values[rate].append(new_value)
    total_invested = [
        month * monthly_investment for month in range(years * 12 + 1)]

yearly_values = {
    rate: [investment_values[rate][year * 12] for year in range(years + 1)]
    for rate in rates_of_return
}
total_invested_yearly = [total_invested[year * 12]
                         for year in range(years + 1)]

# Plot settings
plt.figure(figsize=(18, 12))
colors = ["b", "g", "orange"]
for rate, color in zip(rates_of_return, colors):
    plt.plot(
        range(years + 1),
        yearly_values[rate],
        label=f"Investment value at {rate*100:.0f}% Return",
        color=color,
    )
plt.plot(
    range(years + 1),
    total_invested_yearly,
    label="Total Invested",
    color="r",
    linestyle="--",
)

# Mark key growth periods
key_periods = [5, 10, 15, 20, 25]
for year in key_periods:
    plt.axvline(x=year, color="grey", linestyle="--", alpha=0.7)
    for rate, color in zip(rates_of_return, colors):
        value = yearly_values[rate][year]
        plt.text(
            year, value, f"${value:,.0f}", horizontalalignment="right", color=color
        )

# Plot settings
plt.title("investment growth over 25 years at different rates of return")
plt.xlabel("years")
plt.ylabel("INR")
plt.legend()
plt.grid(True)
plt.show()
# plt.savefig("foo.png")compound_interest_simulator
