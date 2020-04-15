#include <bits/stdc++.h>
using namespace std;

void count_ways(vector<string> &words, vector<string> &sentences);

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int number_of_words;
		cin>>number_of_words;

		vector <string> words;
		while(number_of_words--)
		{
			string temp;
			cin>>temp;
			words.push_back(temp);
		}

		int number_of_sentences;
		cin>>number_of_sentences;

		vector <string> sentences;
		while( number_of_sentences-- )
		{
			string temp;
			cin>>temp;
			sentences.push_back(temp);
		}

		count_ways(words,sentences);
	}
	return 0;
}

class block
{
private:
	block* next[26];
	bool wordend;

public:
	block()
	{
		wordend=0;
		for(int i=0; i<26; i++)
			next[i] = NULL;
	}

	void add(string& word, int i)
	{
		if(i==word.size())
		{
			wordend=1;
			return;
		}
		
		int index = word[i] - 'a';
		
		if( !next[index] )
			next[index] = new block();
		
		next[index]->add(word, i+1);
	}

	int search( string& sen, int i, block* root, int* dp)
	{
		if( i==sen.size() && wordend ) return 1;
		if( i==sen.size() ) return 0;
		// if sentence ends at a position where a dictionary
		// word ends, a new combination is found
		
		int ret=0;
		
		if(wordend)
		{
			if(dp[i] == -1)
				dp[i] = root->search(sen, i, root, dp);
				// since word has ended, search function
				// can be called for root of trie
			
			// accessing array for dynamic programming
			ret+=dp[i];
		}
		
		int index = sen[i] - 'a';
		
		// continuing word only if next[index] is not NULL
		if( next[index] )
			ret += next[index]->search( sen, i+1, root, dp );
		
		return ret;
	}
};

void count_ways(vector<string> &words, vector<string> &sentences)
{
	block* dictionary = new block();

	// adding all words to dictionary
	for(int i=0 ; i<words.size() ; i++)
		dictionary->add( words[i], 0 );
	
	for(int i=0 ; i < sentences.size() ; i++)
	{
		// selecting a sentence
		string sen = sentences[i];
		
		// creating array for dynamic programming
		int *dp = new int[ sen.size() ];
		for(int i=0; i<sen.size(); i++)
			dp[i] = -1;
		
		cout<< dictionary->search( sen, 0, dictionary, dp) << endl;
	}
}