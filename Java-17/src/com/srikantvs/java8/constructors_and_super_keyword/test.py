import numpy as np;
import matplotlib.pyplot as plt;

monthly_investment = 10000;
years = 25;

rates_of_return = [0.08, 0.12, 0.16]
print(rates_of_return[-1])

# Intialize dictionaries to store investment values for different rate of return

investment_values = {rate : [0] for rate in rates_of_return}
total_invested = [0]


# Simulate the investment growth for different rate of return
for rate in rates_of_return:
    monthly_return_rate = (1+rate)**(1/12)-1
    for month in range(1, 12* years +1):
        # print(investment_values[rate][-1])
        new_value = (investment_values[rate][-1] + monthly_investment)+(1+monthly_return_rate) #[-1] means last value
        investment_values[rate].append(new_value)
    total_invested = [month * monthly_investment for month in range(years*12+1)]
# print(investment_values[0.08][-1])

yearly_values = {rate:[investment_values[rate][year*12] for year in range(years+1)]for rate in rates_of_return}
total_invested_yearly = [total_invested[year*12] for year in range(years + 1)]

plt.figure(figsize=(18,12))
colors = ['b','g','orange']
for rate, color in zip(rates_of_return, colors):
    plt.plot(range(years+1), yearly_values[rate])
plt.show()
plt.savefig('foo.png')


