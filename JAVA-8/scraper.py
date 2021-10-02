import asyncio
import pandas as pd
import snscrape.modules.twitter as sntwitter
from datetime import datetime, timedelta, timezone

scrapeKey = input("What you want to scrape ? : ")
scraper = sntwitter.TwitterSearchScraper(scrapeKey)
# print(scraper)
count = 0
with open('meetups1.txt', 'w', encoding='utf-8') as f:
    for tweet in scraper.get_items():

        # print(str(tweet.date))
        tweetdate = datetime.fromisoformat(str(tweet.date))
        todaydate = datetime.utcnow()
        todaydate = todaydate.replace(tzinfo=timezone.utc)

        days_ago = todaydate - timedelta(days=60)
        # print(days_ago)

        if tweetdate >= days_ago and tweetdate <= todaydate:
            f.write(str(tweet.user.username)+'\n')
            f.write(str(tweet.date).split()[0]+'\n')
            # Write some data to the file
            f.write(str(tweet)+'\n')
            f.write(str(tweet.rawContent+'\n'))
            f.write(
                '===================================================================================================\n')
            count += 1
        if count == 60:
            break

# if __name__ == '__main__':
#     loop = asyncio.get_event_loop()
#     loop.run_until_complete(scrape_twitter())
#     number = input('enter a number')
#     print(number)
