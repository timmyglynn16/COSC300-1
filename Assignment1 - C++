#include <stdio.h>
#include <iostream>
using namespace std;

// function headers given
void bubblesort(int *low, int *high);
int* binsearch(int *low, int *high, int key);

// start with sorting the array
void bubblesort(int *low, int *high){
    
    // first loop to count/keep track of the number of iterations made through the array
    for (int *p1 = low; p1<high; p1++)
    {
        //second loop to count/keep track of the number of comparisons made
        for (int *p2 = low; p2<high; p2++)
        {
            if (*p2>*(p2 + 1))
            {
                // swap (if condition is met)
                int temp = *p2;
                *(p2) = *(p2 + 1);
                *(p2 + 1) = temp;
            }
        }
    }
}

// search for a key in the array

// kept having to rewrite this function - ended up with something like this...
/*
 while(*low < *high){
 int* mid = low + (high - low) / 2;
 if (key == *mid)
 return mid;
 else if (key < *mid)
 *high = *mid - 1;
 else
 *low = *mid + 1;
 }
 return high+1;*/

// ...But something wasn't right

// found help online and came up with this:
int *binsearch(int *low, int *high, int key){
    
    // ONLINE HELP: needed to make these 'references' that represent the *low, *high pointers
    // this way i can do arithmetic when calculating the *mid
    int *lowRef = low;
    int *highRef = high;
    int *mid = (lowRef + (highRef - lowRef) / 2);// calculate the mid value and point to the address of mid
    
    // loop until the program finds the key
    while (lowRef <= highRef && key != *mid)
    {
        // basic binsearch algorithm
        // instead of using *low and *high, use the references from the swap algorithm
        if (key>*mid)
            lowRef = mid + 1; // lowRef represents *low
        else if (key<*mid)
            highRef = mid - 1; // highRef represents *high
        mid = (lowRef + (highRef - lowRef) / 2);
    }
        if (key == *mid)
            return mid;
        else
            return high + 1;


// TOO MUCH ARRAY INDEXING - WRONG!!!!
// also this worked but it wasnt really using pointers the way i wanted it to
    /*
    int i = 0;
    int j = 0;
     
    while(i <= key) {
        j = (i + key) / 2;
        if(high[j] < low[i])
            i = j+1;
        else
            if(high[j] > low[i])
                key = j - 1;
            else
                return j;
        }
        return -1;
    }*/
}

// main program to test above functions
int main()
{

    // declare the size of the array
    int n, i;
    int key = 0;
    cout << "\nEnter the size of the array: ";
    cin >> n;
    cout << endl;
    
    // enter integers into the array
    int arr[n];
    for(i = 0; i < n; i++)
    {
        cout << "Enter element " << i+1 << ": ";
        cin >> arr[i];
    }
    
    // call the function to sort the array
    bubblesort(&arr[0], &arr[n-1]);
        
    // display the sorted data from bubblesort
    cout << "\nSorted array: \n";
    for (int i = 0; i<n; i++)
        cout << " " <<  *(arr + i);
    cout << endl;
    
    // enter the key
    cout << "\nEnter number to search: ";
    cin >> key;
    cout << endl;
    
    // call the function to search for a key in the array
    int *keyFound = binsearch(&arr[0], &arr[n-1], key);
    
    if (keyFound >= &arr[n-1])
        cout << "Key " << key << " not found. ";
    else
        cout << "Key " << key << " is in the array.";
    cout << "\n";
    return 0;
    
    
}
