# APCSTextAnalysisFramework
Text Analysis Framework to answer several promts by using a hand-coded naive approach and three ML models including: 
1) KNN classifier
2) Decision-tree classifier 
3) Naive bayes classifier

# Note on Datasets
Datasets can be found at this [Google Drive link](https://drive.google.com/drive/folders/1wI9p2xSurcHKuZS5tiXCz2T9sTtieSvt?usp=sharing), please unzip the folder and move the data folder into the project

## The ref_data folder contains 3 files
*commonWords.txt* - Contains a list of words that are commonly used

*syllables.txt* - Contains a list of words and the separations of syllables 

FORMAT: word=woqrd separated with *s to indicate syllable separations (eg. adhesion=ad*he*sion)

*words.txt* - Simply a Dictionary of words

## The train_test_data folder contains 1 folder and 3 files ##

*airline_reviews.csv* - Contains a list of Airline reviews and whether they are positive or negative.

FORMAT:  tweet_id,airline_sentiment,airline_sentiment_confidence,negativereason,negativereason_confidence,airline,airline_sentiment_gold,name,negativereason_gold,retweet_count,text,tweet_coord,tweet_created,tweet_location,user_timezone


*amazon_train.csv* - A List of Amazon Album reviews with the number of stars given to each review

FORMAT: numStars,reviewText

*us-economic-newspaper.csv* - Reviews of Economic news

FORMAT: _unit_id,_golden,_unit_state,_trusted_judgments,_last_judgment_at,positivity,positivity:confidence,relevance,relevance:confidence,orig__golden,articleid,date,headline,lineid,next_sentence,positivity_gold,previous_sentence,relevance_gold,text

# More Potential Datasets can be found at
https://cseweb.ucsd.edu/~jmcauley/datasets.html
