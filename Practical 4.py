#!/usr/bin/env python
# coding: utf-8

# In[3]:


import matplotlib.pyplot as plt
from IPython.display import Math , Latex
from IPython.core.display import Image
import numpy as np
import seaborn as sms
print('all are imported')


# In[6]:


sms.set(color_codes=True)
sms.set(rc={'figure.figsize':(5,5)})


# In[10]:


from scipy.stats import randint
import matplotlib.pyplot as plt
fig,ax=plt.subplots(1,1)
low, high = 7,32
mean, var,skew,kurt = randint.stats(low,high,moments='mvsk')
x = np.arange(randint.ppf(0.01,low,high),
             randint.ppf(0.99,low,high))
ax.plot(x,randint.pmf(x,low,high),'bo',ms=8,label='randint.pmf')
ax.vlines(x,0,randint.pmf(x,low,high),colors='b',lw=5,alpha=0.5)


# In[15]:


from scipy.stats import randint
import matplotlib.pyplot as plt
fig,ax=plt.subplots(1,1)
low, high = 7,32
mean, var,skew,kurt = randint.stats(low,high,moments='mvsk')
x = np.arange(randint.ppf(0.01,low,high),
             randint.ppf(0.99,low,high))
ax.plot(x,randint.pmf(x,low,high),'bo',ms=8,label='randint.pmf')
ax.vlines(x,0,randint.pmf(x,low,high),colors='b',lw=5,alpha=0.5)
rv=randint(low,high)
ax.vlines(x,0,rv.pmf(x),colors='k',linestyles='-',lw=1,label='frozen pmf')
ax.legend(loc='best',frameon=False)
plt.show()
prob=randint.cdf(x,low,high)
np.allclose(x,randint.ppf(prob,low,high))
r=randint.rvs(low,high,size=1000)


# # Bernoulli Distribution

# In[22]:


from scipy.stats import bernoulli
data_bern=bernoulli.rvs(size=10000,p=0.5)
ax=sms.distplot(data_bern,kde=False,color='skyblue',hist_kws={"linewidth":15,'alpha':1})
ax.set(xlabel='Bernoulli Distribution',ylabel='frequency')


# # Binomial Distribution

# In[25]:


from scipy.stats import binom
data_binom=binom.rvs(size=10000,p=0.8,n=10)
ax=sms.distplot(data_binom,kde=False,color='skyblue',hist_kws={"linewidth":15,'alpha':1})
ax.set(xlabel='Binomial Distribution',ylabel='frequency')


# # Poisson Distribution

# In[27]:


from scipy.stats import poisson
data_poisson=poisson.rvs(size=10000,mu=3)
ax=sms.distplot(data_poisson,kde=False,color='skyblue',hist_kws={"linewidth":15,'alpha':1})
ax.set(xlabel='Poisson Distribution',ylabel='frequency')


# In[ ]:




