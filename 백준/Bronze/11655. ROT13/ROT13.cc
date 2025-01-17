#include <iostream>
#include <string>
using namespace std;

int main() {
    string word;
    getline(cin, word);

    for (int i = 0; i < word.length(); i++) {
        if (word[i] >= 'A' && word[i] <= 'Z') { // 대문자
            word[i] = (word[i] - 'A' + 13) % 26 + 'A';
        } else if (word[i] >= 'a' && word[i] <= 'z') { // 소문자
            word[i] = (word[i] - 'a' + 13) % 26 + 'a';
        }
    }

    cout << word << endl;
    return 0;
}
