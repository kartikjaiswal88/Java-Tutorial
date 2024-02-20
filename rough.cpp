#include <bits/stdc++.h>
#include <vector>
using namespace std;

vector<int> findDuplicates(vector<int> &nums)
{
    int n = nums.size();
    vector<int> ans;

    for (int i = 0; i < n; i++)
    {
        int index = abs((nums[i] % (n + 1)) - 1);
        nums[index] = nums[index] + n + 1;
    }

    for (int i = 0; i < n; i++)
    {
        int temp = nums[i] / (n + 1);
        if (temp >= 2)
            ans.push_back(i + 1);
    }
    return ans;
}

void nextDistinct(int *arr, int size, int &index)
{
    while (index < size && arr[index] == arr[index - 1])
        index++;
}

int doUnion(int arr[], int n, int brr[], int m)
{
    int i = 0;
    int j = 0;
    int ans = 0;
    sort(arr, arr + n);
    sort(brr, brr + m);
    while (i < n && j < m)
    {
        if (arr[i] < brr[j])
        {
            nextDistinct(arr, n, ++i);
        }
        else if (arr[i] > brr[j])
        {
            nextDistinct(brr, m, ++j);
        }
        else
        {
            nextDistinct(arr, n, ++i);
            nextDistinct(brr, m, ++j);
        }
        ans++;
    }

    while (i < n)
    {
        ans++;
        nextDistinct(arr, n, ++i);
    }
    while (j < m)
    {
        ans++;
        nextDistinct(brr, m, ++j);
    }

    return ans;
}

int main()
{
    vector<int> arr = {1, 2, 1};
    findDuplicates(arr);
}

void bubbleSort(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}